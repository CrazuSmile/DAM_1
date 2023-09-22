
public class Ejercicio1 {
    public static void main(String[] args) {

        double deportivas = 85.00;
        double descuento;

        System.out.println("Las deportivas cuestan: " + deportivas + "€");

        descuento = deportivas - ((deportivas * 15) / 100);

        System.out.println("Con descuento cuestan: " + descuento + "€");

    }
}
