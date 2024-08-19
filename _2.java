public class oliso {

    public static boolean validateRowsOliso(int[][] board) {
        

        for (int i=0; i<3; i++) {

            if (i==0){
                for (int j = 0; j < 3; j++) {
                board[j][i] /= 100; // units
                }
            }
            if (i==1){
                for (int j = 0; j <3; j++){
                    board[j][i] = ((board[j][i])/10)%10; //ones
                }
            }
            if (i==2){
                for (int c = 0; c <3; c++){
                    board[c][i] = ((board[c][i])%10); //hundreds
                }    
            }
            
            for (int x=0; x<3; x++){
               
                //ascending 
                if (board[x][0] == board[x][1] && board[x][1] == board[x][2]){
                    
                    return true;
                }
            }
        }
        return false;
        
    }
  
    public static void main(String[] args) {
        int[][] board_ascending = {{807,982,808}, //winner row
                                  {623,592,481}, 
                                  {347,324,8}}; 
    
        int[][] board_none = {{227,222,503}, //
                              {443,447,670}, 
                              {70,235,200}}; 

        boolean winner = validateRowsOliso(board_ascending);

        System.out.println("Oliso allignment found? " + winner);

        //System.out.println(board_ascending[2][2]);
        
        
    }


    
}