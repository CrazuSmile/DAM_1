package ejercicios_teoricos.stream.ejemplo1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;

public class SerialLee {
    public static void main(String[] args) {
        try {
            FileInputStream f = new FileInputStream("prueba.dat");

            ObjectInputStream ost = new ObjectInputStream(f);
            Persona persona = (Persona) ost.readObject();
            Date fecha = (Date) ost.readObject();
            int entero = ost.readInt();
            System.out.println(persona);
            System.out.println(fecha);
            System.out.println(entero);
            ost.close();

        } catch (IOException e) {
            System.err.println(e);
        } catch (ClassNotFoundException e) {
            System.err.println(e);
        }
    }
}
