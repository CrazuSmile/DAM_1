public class Ejercicio2 {

    public static void main(String[] args) {
        double ingreso = 2000, plazoFijo = 2.75, haceinda = 18, resultado;

        resultado = (ingreso + (((ingreso * plazoFijo) / 100) / 2)) - (ingreso * haceinda / 100);

        System.out.println("El banco te pagara: " + resultado + "€");
    }
}