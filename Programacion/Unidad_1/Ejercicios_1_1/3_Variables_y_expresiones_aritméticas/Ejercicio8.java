public class Ejercicio8 {

    public static void main(String[] args) {
        double resultado, interes, haceinda, interesHacienda, ingreso;

        ingreso = 2000;

        interes = ((ingreso * 2.75) / 100) / 2;

        System.out.println("Primero se calcula el interes: " + interes);

        haceinda = (interes * 18) / 100;

        System.out.println("Ahora, se calcula el 18% de hacienda: " + haceinda);

        interesHacienda = interes - haceinda;

        System.out.println("Se calcula el total de intereses: " + interesHacienda);

        resultado = interesHacienda + ingreso;

        System.out.println("Por ultimo se suma lo que el banco te pagara: " + resultado + "€");
    }

}
