package ejercicios_teoricos.stream.ejemplo1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class SerialEscribe {
    public static void main(String[] args) {
        try {
            FileOutputStream f = new FileOutputStream("prueba.dat");

            ObjectOutputStream ost = new ObjectOutputStream(f);
            Persona persona = new Persona("Juan Jose", 23);
            Date fecha = new Date();
            ost.writeObject(persona);
            ost.writeObject(fecha);
            ost.writeInt(13);
            ost.flush();
            ost.close();

        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
