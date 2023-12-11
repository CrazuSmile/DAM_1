package Programacion.Unidad_3.teoria.ejemplo2;

public class Coche extends Vehiculo {
    protected int ruedas = 4;
    protected float gasolina;
    protected float consumo;

    protected void repostar(int litros) {
        gasolina += litros;
    }

    /*
     * protected int avanzar() {
     * float gasolinaConsumida = gasolina;
     * int km = 0;
     * while (gasolinaConsumida > 0) {
     * km = km + velocidad;
     * gasolinaConsumida -= consumo;
     * }
     * return km;
     * }
     */

    public void avanzar() {
        while (this.gasolina > 0) {
            this.gasolina -= consumo;
            this.distancia++;
        }
    }

    protected void imprimir() {
        System.out.println("\nUn vehiculo de " + ruedas + " ruedas va a una velocidad de " + gasolina
                + " litros \nConsume " + consumo
                + " litros por hora y avanza " + distancia + " km antes de que se agote la gasolina.\n");

    }
}
