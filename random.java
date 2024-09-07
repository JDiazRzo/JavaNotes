import java.util.*;
public class random {
    public static void main(String[] args) {

        /*  Crear las variables necesarias
         *  inicializar el numero secreto con random
         *  crear un contador y el numero del usuario para entrar el bucle
         *  crear el bucle en el que se repita hasta que no se encuentre el numero secreto
         *  cerrar en ciclo;
         */
        
        Random chance = new Random();
        Scanner scanner = new Scanner(System.in);
        int secretnum = chance.nextInt(100) + 1;
        int count = 0;
        int usernum = 0;
        

        while (usernum != secretnum) {
            System.out.println("Introduce your number: ");
                usernum = scanner.nextInt();
                count ++;   
                if (usernum < secretnum) {
                    System.out.println("The number is higher");
                }
                else if (usernum > secretnum) {
                    System.out.println("The numbers is lower");
                }
                else {
                    System.out.println("Correct! Your attemps to know the number is: " + count);
                }
        }

        scanner.close();
    }

}