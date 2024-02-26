package Programacion.Unidad_5.Ejercicios_Strings.ejercicio2;

public class ConcatencionCadena {
    public static void main(String[] args) {
        String nombre = "Juan Jose";
        String apellido1 = new String("Sanz");
        String apellido2 = "Lopez";

        String nombreCompleto = nombre + " " + apellido1 + " " + apellido2;

        System.out.println(nombreCompleto);
        System.out.println("Longitud del nombre completo: " + nombreCompleto.length());

    }
}
