package Programacion.Unidad_2.Ejercicios.Ejercicio_2_1.POO_Static.Ejercicio2;

public class PruebaPunto {
    public static void main(String[] args) {
        Punto punto1 = new Punto(3, 4);
        Punto punto2 = new Punto(0, 4);
        Punto punto3 = new Punto(2, -1);
    

        punto1.distancia(punto1.getCoordX(), punto1.getCoordY(), Punto.origenX, Punto.origenY);
        punto2.distancia(punto2.getCoordX(), punto2.getCoordY(), Punto.origenX, Punto.origenY);
        punto3.distancia(punto3.getCoordX(), punto3.getCoordY(), Punto.origenX, Punto.origenY);
    }
}
