public class Ejercicio2 {

    public static void main(String[] args) {
        double resultado, interes, haceinda, interesHacienda;

        interes = ((2000 * 2.75) / 100) / 2;

        haceinda = (interes * 18) / 100;

        interesHacienda = interes - haceinda;

        resultado = interesHacienda + 2000;

        System.out.println("El banco te pagara: " + resultado + "€");
    }
}