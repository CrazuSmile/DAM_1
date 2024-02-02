package Programacion.Unidad_4.ejerciciosOpcionales.ejercicio3;

public class Cuadrado extends Figura {

    protected float lado;

    public Cuadrado(float lado){
        this.lado = lado;
    }

    @Override
    public float area() {
        // TODO Auto-generated method stub
        return lado*lado;
    }
    
}
