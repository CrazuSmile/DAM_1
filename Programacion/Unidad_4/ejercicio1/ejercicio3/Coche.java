package Programacion.Unidad_4.ejercicio1.ejercicio3;

public class Coche extends Vehiculo implements IAvanzar{
    protected float kmRecorrido;

    public Coche(String marca, String modelo, int anyoFabricacion) {
        super(marca, modelo, anyoFabricacion);
        // TODO Auto-generated constructor stub
    }

    public float getKmRecorrido() {
        return kmRecorrido;
    }

    @Override
    public void avanzar(float km) {
        // TODO Auto-generated method stub
        kmRecorrido += km;
    }

    public void reset(){
        kmRecorrido = 0;
    }
}
