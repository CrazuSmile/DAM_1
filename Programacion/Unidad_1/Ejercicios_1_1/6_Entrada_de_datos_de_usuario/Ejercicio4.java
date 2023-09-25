import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        double ingreso, interes, plazo, interesTotal, interesHacienda, total;
        Scanner tcl = new Scanner(System.in);

        System.out.print("Cuanto has ingresado: ");

        ingreso = tcl.nextDouble();

        System.out.print("Con cuanto interes: ");

        interes = tcl.nextDouble();

        System.out.print("Con un plado de ");

        plazo = tcl.nextDouble();

        interesTotal = ((ingreso * interes) / 100) * plazo;

        interesHacienda = interesTotal - ((interesTotal * 18) / 100);

        total = ingreso + interesHacienda;

        System.out.println("El banco le devolvera en un plazo de " + plazo + " años un total de " + total + " €");

    }
}
