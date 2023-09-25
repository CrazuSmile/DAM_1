public class Ejercicio6 {

    public static void main(String[] args) {
        double altura, ancho, area, perimetro;

        altura = 15;
        ancho = 25;

        area = altura * ancho;

        perimetro = 2 * (altura + area);

        System.out.println("El perimetro del rectangulo es: " + perimetro + " y el area: " + area);
    }

}