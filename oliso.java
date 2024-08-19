public class oliso {

    public static boolean validateRowsOliso(int[][] board) {
        
        for (int i = 0; i < 3; i++) {

            /* 
             * 
            if (i==0){
                for (int j = 0; j < 3; j++) {
                board[j][i] /= 100; units
                }
            }
            if (i==1){
                for (int j = 0; j <3; j++){
                    board[j][i] = ((board[j][i])/10)%10; ones
                }
            }
            if (i==2){
                for (int c = 0; c <3; c++){
                    board[c][i] = ((board[c][i])%10); hundreds
                }    
            } 
            */
            
            for (int j = 0; j < 3; j++) {
                int hundreds = board[i][j] / 100;  
                int tens = (board[i][j] / 10) % 10;  
                int ones = board[i][j] % 10;  
                board[i][j] = hundreds + tens + ones;  
            }
            
            // ascending condition
            if (board[i][0] < board[i][1] && board[i][1] < board[i][2]) {
                return true;  
            }
            
            //descending condition :)
            if (board[i][0] > board[i][1] && board[i][1] > board[i][2]) {
                return true;  
            }
        }
        
        return false;  
    }

    public static void main(String[] args) {
        int[][] board_1 = {{807,982,808},  //ascending
                           {623,592,481}, 
                           {347,324,8} };
    
        int[][] board_2 = {
            {128, 184, 871},  // descending
            {623, 592, 481}, 
            {347, 324, 800}
        };

        int[][] board_3 = {
            {227, 222, 503}, //none 
            {443, 447, 670}, 
            {70, 235, 200}
        }; 

        boolean winnerAscending = validateRowsOliso(board_1);
        System.out.println("Oliso ascending alignment found? " + winnerAscending);

        boolean winnerDescending = validateRowsOliso(board_2);
        System.out.println("Oliso ascending descending found? " + winnerDescending);
    }
}
