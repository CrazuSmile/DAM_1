package Programacion.Unidad_4.ejerciciosOpcionales.ejercicio3;

public class TestApp {
    public static void main(String[] args) {
        Figura circulo1 = new Circulo((float) 13.4);
        Figura rectangulo1 = new Rectangulo(12, 43);
        Figura cuadrado1 = new Cuadrado(30);

        circulo1.area();
        rectangulo1.area();
        cuadrado1.area();

        System.out.println(circulo1.esMayorQue(cuadrado1));
        System.out.println(circulo1.esMenorQue(cuadrado1));
        System.out.println(circulo1.esIgualQue(cuadrado1));
    }
}
