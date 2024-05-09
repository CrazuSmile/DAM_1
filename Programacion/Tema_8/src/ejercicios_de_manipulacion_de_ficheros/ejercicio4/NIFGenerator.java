package ejercicios_de_manipulacion_de_ficheros.ejercicio4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NIFGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el nombre del archivo: ");
        String nombreArchivo = scanner.nextLine();

        System.out.print("Numero inicial: ");
        int A = Integer.parseInt(scanner.nextLine());

        System.out.print("Numero final: ");
        int B = Integer.parseInt(scanner.nextLine());
        scanner.close();

        BufferedWriter writer = null;

        try {
            writer = new BufferedWriter(new FileWriter(nombreArchivo));

            for (int i = A; i <= B; i++) {

                String nif = String.format("%08d", i);
                char letra = calcularLetraNIF(nif);
                writer.write(nif + letra);
                writer.newLine();
            }
            System.out.println("Se ha generado el archivo exitosamente.");
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                System.err.println("Erro al cerrar el programa: " + e.getMessage());
            }
        }
    }

    public static char calcularLetraNIF(String nif) {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int numero = Integer.parseInt(nif);
        return letras.charAt(numero % 23);
    }
}
