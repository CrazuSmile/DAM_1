/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package private_class;

import java.util.Scanner;

/**
 * Escribe una aplicación en la que:
 * 
 * a. Se cree un triángulo en (0, 0), (4, 3), (-1, 7).
 * b. Muestre la información del triángulo por pantalla.
 * c. Muestre el perímetro del triángulo por pantalla.
 * d. Solicite al usuario un desplazamiento a realizarle al triángulo.
 * e. Muestre la información del triángulo por pantalla.
 * f. Solicite al usuario un escalado a realizarle al triángulo.
 * g. Muestre la información del triángulo por pantalla.
 * 
 * @author jsanm
 */
public class TestApp {

    private static final Scanner TECLADO = new Scanner(System.in);

    public static void main(String[] args) {

        Triangulo tr = new Triangulo(0, 0, 0, 0, 0, 0);

        System.out.println("El triángulo inicial es");
        System.out.println(tr);

        System.out.println("Y su perímetro");
        System.out.println(tr.perimetro());

        System.out.print("Indique un desplazamiento en el eje de coordenadas horizontal: ");
        float despX = TECLADO.nextFloat();
        TECLADO.nextLine();

        System.out.print("Indique un desplazamiento en el eje de coordenadas vertical: ");
        float despY = TECLADO.nextFloat();
        TECLADO.nextLine();

        tr.trasladar(despX, despY);
        System.out.println("Triángulo tras el traslado");
        System.out.println(tr);

        System.out.print("Indique ahora un factor de escala para el triangulo: ");
        double factorEscalar = TECLADO.nextDouble();

        tr.escalar(factorEscalar);
        System.out.println("Triángulo tras el escalado");
        System.out.println(tr);
    }
}
