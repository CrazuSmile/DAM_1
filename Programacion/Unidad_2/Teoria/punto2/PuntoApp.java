package Programacion.Unidad_2.Teoria.punto2;

import java.util.Scanner;

public class PuntoApp {
    public static void main(String[] args) {
        int coorX, coorY;
        Punto punto1 = new Punto();
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese coordenada X: ");
        coorX = teclado.nextInt();
        // punto1.x=coorX; dona error per ser private;
        System.out.print("Ingrese coordenada Y: ");
        coorY = teclado.nextInt();
        punto1.setCoordenadas(coorX, coorY);

        System.out.println("Tenemos el punto ( " + punto1.getCoordenadaX() + " , " + punto1.getCoordenadaY() + " ) ");
        punto1.imprimirCuadrante();

        Punto punto2 = new Punto(-7);
        System.out.println("Tenemos el punto ( " + punto1.getCoordenadaX() + " , " + punto2.getCoordenadaY() + " ) ");
        punto1.imprimirCuadrante();

        Punto punto3 = new Punto(4, -2);
        System.out.println("Tenemos el punto ( " + punto1.getCoordenadaX() + " , " + punto3.getCoordenadaY() + " ) ");
        punto1.imprimirCuadrante();
    }
}
