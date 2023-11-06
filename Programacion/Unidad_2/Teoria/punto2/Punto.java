package Programacion.Unidad_2.Teoria.punto2;

public class Punto {
    private int x, y;

    public Punto() {
        x = 0;
        y = 0;
    }

    public Punto(int a, int b) {
        x = a;
        y = b;
    }

    public Punto(int a) {
        x = a;
        y = a;
    }

    public void setCoordenadas(int a, int b) {
        x = a; // o bien this.x=a;
        y = b; // o bien this.y=b;
    }

    public void setCoordenadaX(int a) {
        x = a; // o bien this.x=a;

    }

    public void setCoordenadaY(int a) {
        y = a; // o bien this.y=a;
    }

    public int getCoordenadaX() {
        return x;
    }

    public int getCoordenadaY() {
        return y;
    }

    void imprimirCuadrante() {
        if (x > 0 && y > 0) {
            System.out.println("Se encuentra en el primer cuadrante.");
        } else {
            if (x < 0 && y > 0) {
                System.out.println("Se encuentra en el segundo cuadrante.");
            } else {
                if (x < 0 && y < 0) {
                    System.out.println("Se encuentra en el tercer cuadrante.");
                } else {
                    if (x > 0 && y < 0) {
                        System.out.println("Se encuentra en el cuarto cuadrante.");
                    } else {
                        System.out.println("Se encuentra en el quinto cuadrante.");
                    }
                }
            }
        }
    }
}
