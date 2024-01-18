package Programacion.Unidad_4.ejercicio1.ejercicio3;

public abstract class Vehiculo implements IAvanzar{
    protected String marca;
    protected String modelo;
    protected int anyoFabricacion;

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnyoFabricacion() {
        return anyoFabricacion;
    }

    public Vehiculo(String marca, String modelo, int anyoFabricacion){
        this.marca = marca;
        this.modelo = modelo;
        this.anyoFabricacion = anyoFabricacion;
    }
}
