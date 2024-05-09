package ejercicios_de_manipulacion_de_ficheros.ejercicio1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class UnionFicheros {
    public static void mergeTextFiles(String file1, String file2, String outputFile, char separator) {
        try {
            BufferedReader reader1 = new BufferedReader(new FileReader(file1));
            BufferedReader reader2 = new BufferedReader(new FileReader(file2));

            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            String line1, line2;

            while ((line1 = reader1.readLine()) != null && (line2 = reader2.readLine()) != null) {
                writer.write(line1);

                writer.write(separator);

                writer.write(line2);

                writer.newLine();
            }

            reader1.close();
            reader2.close();
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

            System.out.print("Introduce el carácter de separación: ");
            char separator = reader.readLine().charAt(0);

            mergeTextFiles(file1, file2, outputFile, separator);

            reader.close();
        } catch (IOException e) {
            System.err.println("Error al leer la entrada del usuario: " + e.getMessage());
        }
    }
}
