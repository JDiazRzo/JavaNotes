public class Oliso {

    public static boolean checkRow(int[][][] biarray, int row) {
        return (biarray[row][0][0] == biarray[row][1][1] && biarray[row][1][1] == biarray[row][2][2]) || 
        (biarray[row][0][2] == biarray[row][1][1] && biarray[row][1][1] == biarray[row][2][0]);
    }

    public static boolean checkDiagonal(int[][][] biarray) {
       return (biarray[0][0][0] == biarray[1][1][1] && biarray[1][1][1] == biarray[2][2][2]) ||
       (biarray[0][0][2] == biarray[1][1][1] && biarray[1][1][1] == biarray[2][2][0]);
    }

    public static boolean checkColumn(int[][][] biarray) {
        return (biarray[0][0][0] == biarray[1][0][1] && biarray[1][0][1] == biarray[2][0][2]) ||
        (biarray[0][0][2] == biarray[1][0][1] && biarray[1][0][1] == biarray[2][0][0]);
    }

    public static boolean validateOliso(int[][] board, int[][][] biarray) {

        for (int i=0; i<board.length; i++) {
            for (int j = 0; j < board[i].length; j++){
                    int hundreds = board[i][j]/100;
                    int tens = (board[i][j]/10)%10;
                    int ones = (board[i][j])%10; 
                    int[] array = {hundreds, tens, ones};
                    biarray[i][j] = array;
                    //System.out.println("[" + biarray[0][0][0] +"]" + "[" + biarray[1][1][1] +"]" + "[" + biarray[i][2][0] +"]")
                }
                if (checkRow(biarray, i)){
                    return true;
                }
                if (checkColumn(biarray) || checkDiagonal(biarray)){
                    return true;
                }
            } 
            return false;
        }
    public static void main(String[] args) {

        int[][][] biarray = new int[3][3][3];

        int[][] board_column = {{128,992,200}, 
                                {683,512,481}, 
                                {843,324,814}}; 
        
        int[][] board_row = {{822,982,108}, 
                             {683,512,481}, 
                             {843,324,814}};

        int[][] board_diagonal = {{822,982,108}, 
                                  {683,582,481}, 
                                  {843,324,198}};                             
    
        boolean winner = validateOliso(board_column, biarray);
        boolean winner1 = validateOliso(board_row, biarray);
        boolean winner2 = validateOliso(board_diagonal, biarray);

        System.out.println("Oliso allignment column found? " + winner);
        System.out.println("Oliso allignment row found? " + winner1);
        System.out.println("Oliso allignment diagonal found? " + winner2);
       
        
        
    }


    
}