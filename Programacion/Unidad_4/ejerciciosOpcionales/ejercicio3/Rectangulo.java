package Programacion.Unidad_4.ejerciciosOpcionales.ejercicio3;

public class Rectangulo extends Figura{

    protected float largo;
    protected float ancho;

    public Rectangulo(float largo, float ancho){
        this.largo = largo;
        this.ancho = ancho;
    }
    
    @Override
    public float area() {
        // TODO Auto-generated method stub
        return largo*ancho;    
    }
    
}
