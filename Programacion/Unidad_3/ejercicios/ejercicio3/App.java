package Programacion.Unidad_3.ejercicios.ejercicio3;

import Programacion.Unidad_3.ejercicios.ejercicio3.Multimedia.Formato;

public class App {
    public static void main(String[] args) {
        Pelicula pelicula1 = new Pelicula("La comunidad del Anillo", "Tolkien", 2001, Formato.MP4, 0, 0, 0,
                "Elijah Wood", null);
        System.out.println(pelicula1.toString());    }
}
