import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        double triangulo, area, perimetro;
        Scanner tcl = new Scanner(System.in);

        System.out.println("Introduce la longitud de un lado del triangulo: ");
        
        triangulo = tcl.nextDouble();

        perimetro = 3*triangulo;
        area = (triangulo*triangulo)/2;

        System.out.println("El perimetro del triangulo es: "+perimetro+" y el area: "+area);

    }
}
