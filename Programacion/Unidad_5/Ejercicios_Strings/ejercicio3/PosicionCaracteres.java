package Programacion.Unidad_5.Ejercicios_Strings.ejercicio3;

public class PosicionCaracteres {
    public static void main(String[] args) {
        String nombre = "Juan Jose";
        String apellido1 = new String("Sanz");
        String apellido2 = "Lopez";

        String nombreCompleto = nombre + " " + apellido1 + " " + apellido2;

        System.out.println(nombreCompleto);
        System.out.println("Longitud del nombre completo: " + nombreCompleto.length());
        
        // Ejercicio 3.
        // Cuál es la primera letra del nombre.
        System.out.println(nombreCompleto.charAt(0));
        
        // Cuáles son las tres últimas letras del nombre completo.
        System.out.println(nombreCompleto.substring(nombreCompleto.length() - 3, nombreCompleto.length()));
        
        // En qué posición se encuentra el primer espacio
        System.out.println(nombreCompleto.indexOf(" "));
        
        // En qué posición se encuentra el segundo espacio
        int primerEspacio = nombreCompleto.indexOf(" ");
        int segundoEspacio = nombreCompleto.indexOf(" ", primerEspacio + 1);

        System.out.println(segundoEspacio);
    }
}
