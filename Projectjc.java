import javax.swing.*;
import java.util.*;


public class Projectjc {
    
    public static void main(String[] args) {
        
        String nombre = JOptionPane.showInputDialog("Introduzca su nombre: ");

        String edad = JOptionPane.showInputDialog("Introduzca su edad"); /* HAY QUE CREAR
        UNA VARIABLE STRING Y LUEGO TRANSFORMARLA EN INT
         */

        int edad_usuario = Integer.parseInt(edad); 

        System.out.println(nombre + (edad_usuario+1));

        //NUMBER FORMAT: Formatear los valores numericos

        double x=1000.0;

        System.out.printf("%1.2f", x/3); //printf: Acepta 2 tipos de formato.

        //

        try (Scanner suma = new Scanner(System.in)) {

            System.out.println("Ingrese su primer valor");

            int primer_valor = suma.nextInt();

            System.out.println("Ingrese su segundo valor");

            int segundo_valor = suma.nextInt();

            double valorfinal = (primer_valor + segundo_valor)/3;

            System.out.println( "Su suma divido entre 3 es " + valorfinal);


        }


    }

}
