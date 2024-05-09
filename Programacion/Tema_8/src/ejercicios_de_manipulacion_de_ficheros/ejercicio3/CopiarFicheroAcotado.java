package ejercicios_de_manipulacion_de_ficheros.ejercicio3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CopiarFicheroAcotado {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Introduce el nombre del archivo de origen: ");
        String file1 = SCANNER.nextLine();

        System.out.print("Introduce el nombre del archivo de destino: ");
        String outputFile = SCANNER.nextLine();

        System.out.print("Numero de caracteres minimo: ");
        int min = Integer.parseInt(SCANNER.nextLine());

        try {
            copiarAcotando(file1, outputFile, min);
        } catch (Exception e) {

            System.err.println("Error al leer la entrada del usuario: " + e.getMessage());
        }

    }

    private static void copiarAcotando(String file, String outputFile, int min) {
        BufferedReader reader1 = null;
        BufferedWriter writer1 = null;
        try {
            reader1 = new BufferedReader(new FileReader(file));

            writer1 = new BufferedWriter(new FileWriter(outputFile));

            String reader = reader1.readLine();
            while (reader != null) {
                if (reader.length() >= min) {
                    writer1.write(reader);
                    writer1.newLine();
                    reader = reader1.readLine();
                } else {
                    reader = reader1.readLine();
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("El archivo no ha sido encontrado: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error al copiar el fichero: " + e.getMessage());
        } finally {
            try {
                if (reader1 != null && writer1 != null) {
                    reader1.close();
                    writer1.close();
                }
            } catch (IOException e) {
                System.err.println("Error al cerrar los archivos: " + e.getMessage());
            }
        }
    }
}