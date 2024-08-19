import java.util.*;

public class Condicionales {
    
    public static void main(String[] args) {
        
        try(Scanner entrada = new Scanner (System.in)){

            System.out.println("Introduce tu edad");

            int edad = entrada.nextInt();
    
            if(edad<=17) {
    
                System.out.println("Eres menor de edad");
            }
    
            else if (edad>= 110) {
    
                System.out.println("Introduzca una edad real");
            }
            else {
    
                System.out.println("Eres mayor de edad");
            }
    

        }

        
    }


}
