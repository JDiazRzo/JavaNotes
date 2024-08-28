public class finalOliso {

    public static boolean checkRow(int[][][] biarray, int row) {
        return (biarray[row][0][0] == biarray[row][1][1] && biarray[row][1][1] == biarray[row][2][2]) || 
        (biarray[row][0][2] == biarray[row][1][1] && biarray[row][1][1] == biarray[row][2][0]);
    }

    public static boolean checkDiagonal(int[][][] biarray) {
       return (biarray[0][0][0] == biarray[1][1][1] && biarray[1][1][1] == biarray[2][2][2]) ||
       (biarray[0][0][2] == biarray[1][1][1] && biarray[1][1][1] == biarray[2][2][0]) ||
       (biarray[0][2][0] == biarray[1][1][1] && biarray[1][1][1] == biarray[2][0][2]) ||
       (biarray[0][2][2] == biarray[1][1][1] && biarray[1][1][1] == biarray[2][2][0]);
    }

    public static boolean checkColumn(int[][][] biarray) {
        return (biarray[0][0][0] == biarray[1][0][1] && biarray[1][0][1] == biarray[2][0][2]) ||
               (biarray[2][0][2] == biarray[1][0][1] && biarray[1][0][1] == biarray[0][0][0]) ||
               (biarray[0][1][0] == biarray[1][1][1] && biarray[1][1][1] == biarray[2][1][2]) ||
               (biarray[2][1][2] == biarray[1][1][1] && biarray[1][1][1] == biarray[0][1][0]) ||
               (biarray[0][2][0] == biarray[1][2][1] && biarray[1][2][1] == biarray[2][2][2]) || 
               (biarray[2][2][2] == biarray[1][2][1] && biarray[1][2][1] == biarray[0][2][0]);
    }

    public static boolean validateOliso(int[][] board, int[][][] biarray) {
        // verificar si esta vacio el tablero
        boolean isEmpty = true;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != 0) {
                    isEmpty = false;
                    break;
                }
            }
            if (!isEmpty) break;
        }
        
        if (isEmpty) {
            return false;
        }
        // Separador
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                int hundreds = board[i][j] / 100;
                int tens = (board[i][j] / 10) % 10;
                int ones = (board[i][j]) % 10;
                int[] array = {hundreds, tens, ones};
                biarray[i][j] = array;
            }
            // condiciones
            if (checkColumn(biarray)) {
                return true;
            }

            if (checkRow(biarray, i)) {
                return true;
            }

            if (checkDiagonal(biarray)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][][] biarray = new int[3][3][3];

        int[][] board_column = {{123, 190, 801}, 
                                {627, 502, 481}, 
                                {143, 324, 118}}; 
        
        boolean winner = validateOliso(board_column, biarray);
        System.out.println("Oliso alignment column found? " + winner);
    }
}