package Programacion.Unidad_3.teoria.ejemplo2;

/**
 * Vehiculo
 */
public class Vehiculo {
    protected int velocidad;
    protected int ruedas;
    protected int distancia;

    protected void parar() {
        velocidad = 0;
    }

    protected void acelerar(int kmh){
        velocidad += kmh;
    }

    protected void avanzar(int km){
        distancia = 0;
        while (distancia < km) {
            distancia += velocidad;            
        }
    }

    protected void imprimir(){
        System.out.println("Un vehiculo de "+ruedas+" ruedas va a una velocidad de "+velocidad+" km/h");
    }
}