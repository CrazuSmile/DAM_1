package Programacion.Unidad_4.ejercicio1.ejercicio3;

public class App {
    public static void main(String[] args) {
        Vehiculo coche1 = new Coche(null, null, 0);
        System.out.println(((Coche)coche1).getKmRecorrido());
        coche1.avanzar(20);
        System.out.println(((Coche)coche1).getKmRecorrido());
        ((Coche)coche1).reset();
        System.out.println(((Coche)coche1).getKmRecorrido());

    }
}
