package Programacion.Unidad_3.teoria.ejemplo2;

/**
 * Vehiculo
 */
public class Vehiculo {
    protected int velocidad;
    protected int ruedas;
    protected float distancia;

    protected void parar() {
        velocidad = 0;
    }

    protected void acelerar(int kmh) {
        velocidad += kmh;
    }

    protected void avanzar(int km) {
        distancia = km;
    }

    protected void imprimir() {
        System.out.println("Un vehiculo de " + ruedas + " ruedas va a una velocidad de " + velocidad
                + " km/h y recorre un distancia de " + distancia + " km");
    }
}