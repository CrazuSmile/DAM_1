package Programacion.Unidad_6.Ejercicios_Excepciones3.ejercicio3;

public class NoFormaTrianguloEquilateroException extends Exception {

    NoFormaTrianguloEquilateroException(String message) {
        super(message);
    }

    public NoFormaTrianguloEquilateroException(String message, Throwable cause) {
        super(message, cause);
    }

}
