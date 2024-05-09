package ejercicios_de_manipulacion_de_ficheros.ejercicio7_1;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Agenda {
    public static void main(String[] args) {
        leerRegistros();
    }

    public static void leerRegistros() {
        DataInputStream inputStream = null;
        try {
            inputStream = new DataInputStream(
                    new FileInputStream("Tema_8\\src\\ejercicios_de_manipulacion_de_ficheros\\Pruebas\\agenda.dat"));

            while (inputStream.available() >= 0) {
                String nombre = inputStream.readUTF();
                String direccion = inputStream.readUTF();
                String telefono = inputStream.readUTF();
                String email = inputStream.readUTF();

                System.out.println("Nombre: " + nombre);
                System.out.println("Dirección: " + direccion);
                System.out.println("Teléfono: " + telefono);
                System.out.println("Email: " + email);
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            System.err.println("Fichero no encontrado: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                System.err.println("Error al cerrar el fichero: " + e.getMessage());
            }
        }
    }
}
