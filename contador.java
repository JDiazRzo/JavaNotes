import java.util.Scanner;

public class contador {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userphrase;
        userphrase = scan.nextLine().toLowerCase();
        int countA = 0, countE = 0, countI = 0, countO = 0, countU = 0;

        for (int i=0; i <userphrase.length(); i ++) {
            char c = userphrase.charAt(i);
            switch (c) { /*
                The value of the expression is compared with the values of each case.
                If there is a match, the associated block of code is executed.
                */
                case 'a':
                    countA++;
                    break;
                case 'e':
                    countE++;
                    break;
                case 'i':
                    countI++;
                    break;
                case 'o':
                    countO++;
                    break;
                case 'u':
                    countU++;
                    break;
        
            }
        }
       
        System.out.println(countA + "," + countE + "," + countI + "," + countO + "," + countU + " ");
        scan.close();
    }
    
}
