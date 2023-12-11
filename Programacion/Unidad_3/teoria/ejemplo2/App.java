package Programacion.Unidad_3.teoria.ejemplo2;

public class App {
    public static void main(String[] args) {
        Coche coche1 = new Coche();
        Vehiculo vehiculo1 = new Vehiculo();

        coche1.acelerar(80);
        coche1.repostar(12);
        coche1.consumo = 0.67f;
        coche1.avanzar();

        coche1.imprimir();

        vehiculo1.ruedas = 2;
        vehiculo1.avanzar(200);
        vehiculo1.acelerar(100);

        vehiculo1.imprimir();

    }
}
