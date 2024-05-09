package ejercicios_de_manipulacion_de_ficheros.ejercicio2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class UnionFicherosTabulada {

    public static void mergeTextFiles(String file1, String file2, String outputFile) {
        try {
            BufferedReader reader1 = new BufferedReader(new FileReader(file1));
            BufferedReader reader2 = new BufferedReader(new FileReader(file2));

            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            String line1, line2;
            String separator = "\n\t";

            while ((line1 = reader1.readLine()) != null) {
                writer.write(line1);

                reader2 = new BufferedReader(new FileReader(file2));
                while ((line2 = reader2.readLine()) != null) {
                    writer.write(separator + line2);
                }
                reader2.close();

                writer.newLine();

            }

            reader1.close();
            writer.close();

            System.out.println("Los archivos se han fusionado correctamente.");
        } catch (IOException e) {
            System.err.println("Error al fusionar los archivos: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Introduce el nombre del primer archivo de origen: ");
            String file1 = reader.readLine();

            System.out.print("Introduce el nombre del segundo archivo de origen: ");
            String file2 = reader.readLine();

            System.out.print("Introduce el nombre del archivo de destino: ");
            String outputFile = reader.readLine();

            mergeTextFiles(file1, file2, outputFile);

            reader.close();
        } catch (IOException e) {
            System.err.println("Error al leer la entrada del usuario: " + e.getMessage());
        }
    }
}
