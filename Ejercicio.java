import javax.swing.*;
import java.util.*;

public class Ejercicio {
    
    public static void main(String[] args) {
        
        try(Scanner entrada = new Scanner(System.in)) {

            System.out.println("Elige una opcion \n1: Cuadrado \n2: Triangulo \n3: Rectangulo \n4: Circulo ");

            int figura = entrada.nextInt();
    
            switch (figura) {
                case 1:
                    int lado=Integer.parseInt(JOptionPane.showInputDialog("Introduce su lado: "));
                    /* Joptionpane crea la ventana, al ser metodo estatico no necesita crear un objeto
                     * El problema al colocar unicamente el Joption, es que recibe string / recibe int = peta
                     * se usa integer.parseInt (no estatico) y dentro de coloca la ventana para que tome el valor como entero
                     */
    
                    System.out.println("Su area del cuadrado es " + (Math.pow(lado,2)));
                break;
                
                case 2:

                    int base = Integer.parseInt(JOptionPane.showInputDialog("Introduzca su base: "));
                    int h = Integer.parseInt(JOptionPane.showInputDialog("Introduzca su altura"));

                    double resultado = (base*h)/2;
                    System.out.println("El area de su triangulo es: " + resultado);

                break;

                case 3:

                    base = Integer.parseInt(JOptionPane.showInputDialog("Introduzca su base: "));
                    h = Integer.parseInt(JOptionPane.showInputDialog("Introduzca su altura"));

                    System.out.println("El area de su rectangulo es: " + (base*h));
                break;

                case 4:

                    int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduzca su radio"));

                    System.out.print("El area de circulo es: ");

                    System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2)));
                    
                break;
            }       
    


        }

        

    }

}
