import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        String nombre, apellido1, apellido2;
        int diaNa, mesNa, añoNa;
        Scanner lector = new Scanner(System.in);

        System.out.print("Escribe tu nombre: ");
        nombre = lector.nextLine();

        System.out.print("Primer apellido: ");
        apellido1 = lector.next();

        lector.nextLine();

        System.out.print("Segundo apellido: ");
        apellido2 = lector.next();
        lector.nextLine();

        System.out.println("Fecha de naciminto");
        System.out.print("Dia: ");
        diaNa = lector.nextInt();

        System.out.print("Mes: ");
        mesNa = lector.nextInt();

        System.out.print("Año: ");
        añoNa = lector.nextInt();

        System.out.println("Tu nombre completo es " + nombre + " " + apellido1 + " " + apellido2
                + "\nFecha De Naciemiento: " + diaNa + "/" + mesNa + "/" + añoNa);

    }

}
