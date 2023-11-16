package Programacion.Unidad_2.Ejercicios.Ejercicio_2_1.POO_Static.Ejercicio4;

public class ItemApp {
    public static void main(String[] args) {
        Item uno = new Item("Paraguas", 1);
        Item dos = new Item("Sombrero", 2);
        Item tres = new Item("Bocadillo", 3);

        System.out.println("Item uno");
        Item.crearItem(uno.getName(), uno.getIdent());
        System.out.println("-------------");

        System.out.println("Item dos");
        Item.crearItem(dos.getName(), dos.getIdent());
        System.out.println("-------------");

        System.out.println("Item tres");
        Item.crearItem(tres.getName(), tres.getIdent());
    }
}
