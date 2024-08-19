import javax.swing.*;


public class Arrays {
    

    public static void main(String[] args) {
        
        /*String [] matriz =new String[8];*/ 

        /*int [] matriz = {1, 2, 3, 65, 8, 1, 10, 23, 23, 12, 56};

        for (int i=0; i<matriz.length; i++) {

            System.out.println(matriz [i]);
        }*/

        /*for (int i=0; i<8; i++){

            matriz[i] = JOptionPane.showInputDialog("Introduzca sus paises");
        }

        for (String elemento:matriz) {

            System.out.println("Pais " + elemento);
        } */

        int [] random = new int[130];

        for (int i=0; i<random.length; i++) {

            random [i] = (int) Math.round(Math.random()*100);

        }

        for (int numeros:random) { // nuevo bucle simplificado, declara variable y se iguala al nombre de la matriz (recorre)

            System.out.print(numeros + " ");

        }

        int [][] matrix = {

            {1,2,3,4}, 
            {4,67,764,34,6}, 
            {1,645,323,67}, 
            {123, 54, 65, 12}

        };

        for (int [] fila: matrix) {

            System.out.println();

            for ( int z:fila){

                System.out.print(z + " ");
            }

        }

    }
}
