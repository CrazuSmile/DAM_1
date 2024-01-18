package Programacion.Unidad_4.ejercicio1.ejercicio4;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Asegurado asegurado1 = new Asegurado(null, null, null, 0);
        SeguroDeceso seguroDeceso1 = new SeguroDeceso();
        seguroDeceso1.asegurado = asegurado1;
        SeguroVida seguroVida1 = new SeguroVida();
        seguroVida1.asegurado = asegurado1;

        Scanner tcl = new Scanner(System.in);

        String name;
        String firstLastName;
        String secondLastName;
        int yearBorn;
        int tipoSeguro;

        System.out.print("Introduce tu nombre: ");
        name = tcl.nextLine();
        asegurado1.setNombre(name);

        System.out.print("Introduce tu primer apellido: ");
        firstLastName = tcl.nextLine();
        asegurado1.setApellido1(firstLastName);

        System.out.print("Introduce tu segundo apellido: ");
        secondLastName = tcl.nextLine();
        asegurado1.setApellido2(secondLastName);

        System.out.print("Introduce de año de nacimiento: ");
        yearBorn = tcl.nextInt();
        asegurado1.setAñoNacimiento(yearBorn);

        System.out
                .print("Hay dos tipos de seguro:\n\t1. Seguro de vida. \n\t2. Seguro de decesos.\nEscoge su seguro: ");
        tipoSeguro = tcl.nextInt();

        if (tipoSeguro == 1) {
            System.out.println("El asegurado " + asegurado1.getNombre() + " " + asegurado1.apellido1 + " "
                    + asegurado1.apellido2 + " nacido en el año " + asegurado1.getAñoNacimiento()
                    + " tiene que pagar una prima anual de " + seguroVida1.calcularPrimaAnual()
                    + "€ de su seguro de vida.");
        } else if (tipoSeguro == 2) {
            System.out.println("El asegurado " + asegurado1.getNombre() + " " + asegurado1.apellido1 + " "
                    + asegurado1.apellido2 + " nacido en el año " + asegurado1.getAñoNacimiento()
                    + " tiene que pagar una prima anual de " + seguroDeceso1.calcularPrimaAnual()
                    + "€ de su seguro de deceso.");
        } else {
            System.out.println("Escoge un seguro valido.");
        }

    }
}
