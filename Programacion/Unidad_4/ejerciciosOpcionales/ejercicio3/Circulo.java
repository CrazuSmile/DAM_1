package Programacion.Unidad_4.ejerciciosOpcionales.ejercicio3;

public class Circulo extends Figura{

    protected float radio;
    protected final float PI = (float) 3.14;
    
    public Circulo(float radio){
        this.radio = radio;
    }
    
    @Override
    public float area() {
        // TODO Auto-generated method stub
        return PI*radio*radio;
    }
    
}
