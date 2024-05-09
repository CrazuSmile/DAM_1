package ejercicios_de_manipulacion_de_ficheros.ejercicio6;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class ToUpperCaseFile {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        RandomAccessFile raf = null;

        System.out.print("Nombre del archivo: ");
        String file = SCANNER.nextLine();
        while (true) {
            System.out.print("Posicion del caracter: ");
            String carcater = SCANNER.nextLine();
            if (carcater.equalsIgnoreCase("EOF")) {
                break;
            }
            try {
                raf = new RandomAccessFile(file, "rw");
                long position = Long.parseLong(carcater);
                raf.seek(position);

                if (raf.getFilePointer() < raf.length()) {
                    byte pos = raf.readByte();

                    char carcaterMayus = Character.toUpperCase((char) pos);
                    System.out.println("Carácter en la posición " + pos + ": " + carcaterMayus);

                    raf.seek(raf.getFilePointer() - 1);
                    raf.write(carcaterMayus);
                }
            } catch (FileNotFoundException e) {
                System.err.println("Archivo no encontrado: " + e.getMessage());
            } catch (IOException e) {
                System.err.println("Error al modificar el archivo: " + e.getMessage());
            } finally {
                try {
                    if (raf != null) {
                        raf.close();
                    }
                } catch (IOException e) {
                    System.err.println("Error al cerrar el archivo: " + e.getMessage());
                }
            }
        }
        SCANNER.close();

    }
}
