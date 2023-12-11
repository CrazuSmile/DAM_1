package Programacion.Unidad_3.ejercicios.ejericicio2;

public class Punto {
    private float x;
    private float y;

    Punto() {
        x = 0;
        y = 0;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getX() {
        return x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getY() {
        return y;
    }

    public float distancia(float x1, float y1, float x2, float y2) {
        float distancia = 0;

        distancia = (((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)))
                * (((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
        return distancia;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "("+x+","+y+")";
    }

}
