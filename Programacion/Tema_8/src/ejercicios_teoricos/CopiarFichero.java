package ejercicios_teoricos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class CopiarFichero {
    public static void main(String[] args) {
        String nombreFichero = "Pruebas/Cosas.txt";
        String nombreFicheroS = "Pruebas/CosasCopia.txt";

        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new FileReader(nombreFichero));
            bw = new BufferedWriter(new FileWriter(nombreFicheroS));

            String lector = br.readLine();
            while (lector != null) {
                System.out.println(lector);
                bw.write(lector);
                bw.newLine();
                lector = br.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found: ");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error en la lectura del fichero.");
            System.out.println(e.getMessage());
        } finally {
            try {
                if (bw != null && br != null) {
                    bw.close();
                    br.close();
                }
            } catch (Exception e) {
                System.out.println("Error al cerrar el programa.");
                System.out.println(e.getMessage());
            }
        }
    }
}
