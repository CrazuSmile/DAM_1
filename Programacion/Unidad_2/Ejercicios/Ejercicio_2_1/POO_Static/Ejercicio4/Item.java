package Programacion.Unidad_2.Ejercicios.Ejercicio_2_1.POO_Static.Ejercicio4;

public class Item {
    private String name;
    private int ident;

    Item(String name, int ident) {
        this.name = name;
        this.ident = ident;
    }

    public String getName() {
        return name;
    }

    public int getIdent() {
        return ident;
    }

    static void crearItem(String name, int ident) {
        System.out.println(name + " " + ident);
    }
}
