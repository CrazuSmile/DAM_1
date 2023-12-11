package Programacion.Unidad_3.ejercicios.ejercicio1;

public class ExamenApp {
    public static void main(String[] args) {
        Examen examen1 = new Examen();
        Fecha fecha1 = new Fecha(24, 2, 2023);
        Hora hora1 = new Hora(12, 21);

        examen1.setAsignatura("Programacion");
        examen1.setAula(2);

        System.out.println("El examen de la asigantura de " + examen1.getAsignatura() + " es en el aula "
                + examen1.getAula() + ", el dia " + fecha1.toString() + " a las " + hora1.toString());
    }
}
