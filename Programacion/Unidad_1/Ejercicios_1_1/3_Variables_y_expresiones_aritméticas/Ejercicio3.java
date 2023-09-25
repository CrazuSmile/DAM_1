public class Ejercicio3 {

    public static void main(String[] args) {
        double resultado, interes, haceinda, interesHacienda;

        interes = ((2000 * 2.75) / 100) / 2;

        System.out.println("Primero se calcula el interes: " + interes);

        haceinda = (interes * 18) / 100;

        System.out.println("Ahora, se calcula el 18% de hacienda: " + haceinda);

        interesHacienda = interes - haceinda;

        System.out.println("Se calcula el total de intereses: " + interesHacienda);

        resultado = interesHacienda + 2000;

        System.out.println("Por ultimo se suma lo que el banco te pagara: " + resultado + "€");
    }

}
