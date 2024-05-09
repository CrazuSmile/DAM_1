package ejercicios_teoricos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ListarFichero {

    private static final Scanner READ = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Escriba una ruta: ");
        String path = READ.nextLine();

        File file = new File(path);

        if (file.exists()) {
            if (file.delete()) {
                System.out.println("El archivo a sido eliminado exitosamente");
            } else {
                System.out.println("No se pudo eliminar el archivo");
            }
        }

        try {
            if (file.createNewFile()) {
                System.out.println("Se ha creado el fichero exitosamente.");
            } else {
                System.out.println("No se pudo crear al archivo.");
            }
        } catch (IOException e) {
            System.out.println("Ocurrio un error al crear el archivo " + e.getMessage());
        }
        READ.close();
    }
}
