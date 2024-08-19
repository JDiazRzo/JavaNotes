import javax.swing.*;
import java.util.*;

public class Bucles {

    public static void main(String[] args) {
        
        /*String clave = "F0chvfgtjy";

        String pass = "jero";

        String nombre = JOptionPane.showInputDialog("Ingrese su nombre");

        while (clave.equals(pass)==false){

            pass = JOptionPane.showInputDialog("Ingrese su contraseña: ");
            

            if (clave.equals(pass)==false){

                System.out.println("Contraseña Incorrecta");

            }
            
        }*/

        /*System.out.println("Bienvenido " + nombre);

        for(int i=0;i<10;i++) {

            System.out.println("Hola mundo ");
        }*/


        // Ejercicio

        /*int arroba = 0;

        String mail = JOptionPane.showInputDialog("Ingrese su Email: ");

        for( int i=0; i<mail.length();i++) {

          if(mail.charAt(i)=='@') { // Los metodos char siempre van con comillas simples ''.

            arroba++;
          }
        }

        if (arroba==1) {

            System.out.println("Hola, es correcto");
        }

        else {

            System.out.println("Incorrecto");
        }*/

        /*int resultado = 1;

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero"));

        for (int i=numero; i>0; i--) {

            resultado = resultado*i;

        }

        System.out.println("El factorial de " + numero + " es " + resultado);*/

        int aleatorio=(int)(Math.random()*100);

        Scanner entrada = new Scanner (System.in);

        int numero = 0;

        int intento = 0;

        while(numero != aleatorio) {
            intento++;
            System.out.println("Introduzca un numero: ");

            numero = entrada.nextInt();

            if (aleatorio < numero) {

                System.out.println("Mas bajo");
            }

            else if (aleatorio > numero) {

                System.out.println("Mas alto");
            }


        }

        System.out.println("Correcto, su numero de intentos es: " + intento);
    }   
    
}