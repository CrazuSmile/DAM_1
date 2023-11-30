package Programacion.Unidad_2.MediaDeN.ejercicio6;


public class MediaApp {
    public static void main(String[] args) {
        Media media1 = new Media(3);

        System.out.println("¿Cuantos valores para el sumatorio?");
        System.out.println(media1.getN());

        media1.mediaN();

        System.out.println("El sumatorio de los "+media1.getN()+" valores es "+media1.getResultado());

    }
}
