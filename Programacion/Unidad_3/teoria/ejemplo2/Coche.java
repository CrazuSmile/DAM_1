package Programacion.Unidad_3.teoria.ejemplo2;

public class Coche extends Vehiculo {
    protected int ruedas = 4;
    protected int gasolina;
    protected int consumo;

    protected void repostar(int litros) {
        gasolina += litros;
    }

    protected int avanzar() {
        int gasolinaConsumida = gasolina;
        int km = 0;
        while (gasolinaConsumida > 0) {
            km = km + velocidad;
            gasolinaConsumida -= consumo;
        }
        return km;
    }

    protected void imprimir() {
        System.out.println("Un vehiculo de " + ruedas + " ruedas va a una velocidad de " + velocidad
                + " km/h con una cantidad de gasolina de " + gasolina + " litros \nConsume " + consumo
                + " litros por hora y avanza en una hora " + avanzar() + " km");

    }
}
