public class Ejercicio7 {
    public static void main(String[] args) {
        double alto, diametro, area, perimetro;
        final double PI = 3.1415926536;

        alto = 15.5;
        diametro = 42.2;

        perimetro = 2 *PI * (diametro / 2);

        area = 2 * PI * (diametro / 2) * ((diametro / 2) + alto);

        System.out.println("El perimetro del cilindor es: "+perimetro+" y el area: "+area);

    }
}
