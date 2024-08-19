public class string {
    
    public static void main(String[] args) {
        
        String mi_nombre = "Jeronimo";

        System.out.println("Mi nombre es" + mi_nombre);

        System.out.println(mi_nombre + "Tiene" + mi_nombre.length() + "Letras");
        System.out.println(mi_nombre + "Se escribe con " + mi_nombre.charAt(0));
        System.out.println(mi_nombre + "Se escribe como " + mi_nombre.substring(0, 4));
        System.out.println(mi_nombre + "Se escribe como " + mi_nombre.substring(2));

        String frase = "Hola quiero helado";

        String fraseresu = frase.substring(4, 11);

        System.out.println(fraseresu);

        String Alumno1, Alumno2;

        Alumno1 = "Juan";
        Alumno2 = "Juan";

        System.out.println(Alumno1.equals(Alumno2));
    }
}
