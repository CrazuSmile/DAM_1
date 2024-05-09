package ejercicios_de_manipulacion_de_ficheros.ejercicio5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DeleteNIF {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        BufferedReader reader = null;
        BufferedWriter writer = null;

        System.out.print("De que archivo quieres eliminar un NIF: ");
        String original = SCANNER.nextLine();

        System.out.print("Archivo final: ");
        String output = SCANNER.nextLine();

        System.out.print("Que NIF quieres eliminar: ");
        String nif = SCANNER.nextLine();

        SCANNER.close();

        try {
            reader = new BufferedReader(new FileReader(original));
            writer = new BufferedWriter(new FileWriter(output));

            String line;

            while ((line = reader.readLine()) != null) {
                String nifEnArchivo = line.substring(0, 8);
                if (!nifEnArchivo.equals(nif)) {
                    writer.write(line);
                    writer.newLine();
                }
            }

            java.io.File archivoOriginal = new java.io.File(original);
            java.io.File archivoTemp = new java.io.File(output);
            archivoTemp.renameTo(archivoOriginal);

        } catch (FileNotFoundException e) {
            System.err.println("Archivo no encontrado: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error al copiar fichero: " + e.getMessage());
        } finally {
            try {
                if (reader != null && writer != null) {
                    reader.close();
                    writer.close();

                }
            } catch (IOException e) {
                System.err.println("Error al cerrar el archivo: " + e.getMessage());
            }
        }
    }
}
