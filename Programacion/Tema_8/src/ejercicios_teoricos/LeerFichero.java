package ejercicios_teoricos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class LeerFichero {
    public static void main(String[] args) {
        String nombreFichero = "Pruebas/Cosas.txt";

        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(nombreFichero);

            br = new BufferedReader(new FileReader(nombreFichero));

            int caract = fr.read();
            String texto = br.readLine();

            System.out.println();
            System.out.println("-----------------PRUEBA FILE READER-------------------");

            while (caract != -1) {
                System.out.print((char) caract);
                caract = fr.read();
            }
            System.out.println();
            System.out.println();
            System.out.println("-----------------PRUEBA BUFFERED READER---------------");

            while (texto != null) {
                System.out.println(texto);
                texto = br.readLine();

            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found: ");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error en la lectura del fichero.");
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fr != null && br != null) {
                    fr.close();
                    br.close();
                }
            } catch (Exception e) {
                System.out.println("Error al cerrar el programa.");
                System.out.println(e.getMessage());
            }
        }
    }
}
