package Programacion.Unidad_3.teoria.ejemplo2;

public class Coche extends Vehiculo {
    protected int ruedas = 4;
    protected int gasolina;

    protected void repostar(int litros){
        gasolina += litros;
    }
}
