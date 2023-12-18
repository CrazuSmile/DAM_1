package Programacion.Unidad_3.ejercicios.ejercicio2;

public class Triangulo {
    private float x1;
    private float y1;

    private float x2;
    private float y2;

    private float x3;
    private float y3;

    Triangulo(float x1, float x2, float x3, float y1, float y2, float y3) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
    }

    public void trasladar(float xi, float yi) {
        x1 = x1 + xi;
        x2 = x2 + xi;
        x3 = x3 + xi;

        y1 = y1 + yi;
        y2 = y2 + yi;
        y3 = y3 + yi;
    }

    public void escalar(float xi, float yi) {
        x1 = x1 + xi;
        x2 = x2 + xi;
        x3 = x3 + xi;

        y1 = y1 + yi;
        y2 = y2 + yi;
        y3 = y3 + yi;

    }
}
