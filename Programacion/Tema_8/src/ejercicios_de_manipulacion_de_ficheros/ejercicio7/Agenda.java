package ejercicios_de_manipulacion_de_ficheros.ejercicio7;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Agenda {
    public static void main(String[] args) {
        escribirRegistro("Juan Perez", "Calle Principal 123", "123456789", "juan@example.com");
        escribirRegistro("María López", "Avenida Central 456", "987654321", "maria@example.com");
    }

    public static void escribirRegistro(String nombre, String direccion, String telefono, String email) {
        DataOutputStream outputStream = null;
        try {
            outputStream = new DataOutputStream(new FileOutputStream("agenda.dat", true));
            outputStream.writeUTF(nombre);
            outputStream.writeUTF(direccion);
            outputStream.writeUTF(telefono);
            outputStream.writeUTF(email);
            outputStream.writeBytes(System.lineSeparator());
            System.out.println("Registro agregado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        } finally {
            try {
                if (outputStream != null) {
                    outputStream.close();
                }
            } catch (IOException e) {
                System.err.println("Error al cerrar el fichero: " + e.getMessage());
            }
        }
    }
}
