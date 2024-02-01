package Programacion.Unidad_4.ejerciciosOpcionales.ejercicio2;

import Programacion.Unidad_4.ejerciciosOpcionales.ejercicio2.Instituto.Cargo;

public class TestApp {
    public static void main(String[] args) {
        Profesor profesor1 = new Profesor(Cargo.PROFESOR, "Juan Jose", "Sanz", null, 2020);

        System.out.println(
                "El profesor " + profesor1.getNombre() + " " + profesor1.getApellido1() + " " + profesor1.getApellido2()
                        + " que entro en el centro en el año " + profesor1.getAnyoIncorp() + " con el cargo de "
                        + profesor1.getUnCargo() + " y posee un nomina de " + profesor1.calcularNomina() + "€");
    }
}
