package Programacion.Unidad_2.Ejercicios.Ejercicio_2_1.EJercicio3;

public class Punto {
    private int x, y;

    Punto() {
        y = 0;
        x = 0;
    }

    Punto(int x, int y) {
        this.y = y;
        this.x = x;
    }

    public int getCoordX() {
        return x;
    }

    public int getCoordY() {
        return y;
    }

    public void distancia(int x, int y) {
        int resultado = (x+y) ^ (1 / 2);
        System.out.println("La distancia es de " + resultado);
    }

    public void distancia(int x, int y, int a, int b) {
        int restaX = x - a;
        int restaY = y - b;
        int resultado = (restaX + restaY) ^ (1 / 2);
        System.out.println("La distancia es de " + resultado);
    }
}
