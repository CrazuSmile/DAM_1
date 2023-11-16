package Programacion.Unidad_2.Ejercicios.Ejercicio_2_1.POO_Static.Ejercicio3;

public class Elemento {
    enum Nombre {
        HIDROGENO, OXIGENO, PLATA, ORO
    }

    static Nombre numNombre;

    Elemento(Nombre numNombre) {
        this.numNombre = numNombre;
    }

    static void numeroDeElementos() {
        numNombre.values();
    }

}
