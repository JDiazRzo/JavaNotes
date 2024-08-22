public class Quiz1 {

    public static boolean validateRowsOliso(int[][] board, int[][][] biarray) {

        for (int i=0; i<board.length; i++) {
            for (int j = 0; j < board[i].length; j++){
                    int hundreds = board[i][j]/100;
                    int tens = (board[i][j]/10)%10;
                    int ones = (board[i][j])%10; 
                    
                    int[] array = {hundreds, tens, ones};
                    biarray[i][j] = array;

                
                    System.out.println("[" + biarray[i][j][0] +"]" + "[" + biarray[i][j][1] +"]" + "[" + biarray[i][j][2] +"]" );
                    if (biarray[i][0][0] == biarray[i][1][1] && biarray[i][1][1] == biarray[i][2][2]){
                        return true;
                    }
                    if (biarray[i][0][0] == biarray[i][1][1] && biarray[i][1][1] == biarray[i][2][2]){
                        return true;
                    }
                }
            } 
            return false;
  
        }
           
    
    
  
    public static void main(String[] args) {

        int[][][] biarray = new int[3][3][3];

        int[][] board_ascending = {{807,982,108}, //winner row
                                  {623,592,481}, 
                                  {347,324,8}}; 
    
        boolean winner = validateRowsOliso(board_ascending, biarray);

        System.out.println("Oliso allignment found? " + winner);
       
        
        
    }


    
}