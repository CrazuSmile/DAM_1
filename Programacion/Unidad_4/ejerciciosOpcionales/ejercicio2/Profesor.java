package Programacion.Unidad_4.ejerciciosOpcionales.ejercicio2;

import java.time.Year;

public class Profesor extends Instituto {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int anyoIncorp;

    Profesor(Cargo unCargo, String nombre, String apellido1, String apellido2, int anyoIncorp) {
        super(unCargo);

        if (nombre == null || "".equals(nombre) || apellido1 == null || "".equals(apellido1) || anyoIncorp == 0) {
            System.out.println("Todos los atributos, menos el segundo apellido, son obligatorios");
        } else {
            this.nombre = nombre;
            this.apellido1 = apellido1;
            this.apellido2 = apellido2;
            this.anyoIncorp = anyoIncorp;
        }
    }

    public int getAnyoIncorp() {
        return anyoIncorp;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setAnyoIncorp(int anyoIncorp) {
        if (anyoIncorp == 0) {
            System.out.println("El año de incorporacion es obligatorio");
        } else {
            this.anyoIncorp = anyoIncorp;

        }
    }

    public void setApellido1(String apellido1) {
        if (apellido1 == null || "".equals(apellido1)) {
            System.out.println("El primer apellido es obligatorio");
        } else {
            this.apellido1 = apellido1;
        }

    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public void setNombre(String nombre) {
        if (nombre == null || "".equals(nombre)) {
            System.out.println("El nombre es obligatorio");
        } else {
            this.nombre = nombre;
        }
    }

    @Override
    public float calcularNomina() {
        // TODO Auto-generated method stub
        nomina = 1500;
        int i;
        int year = Year.now().getValue();
        int anyosTrabajados = 0;
        anyosTrabajados = year - anyoIncorp;
        for (i = 0; i < anyosTrabajados; i++) {
            anyosTrabajados = anyosTrabajados - 3;
        }

        if (unCargo.equals(Cargo.PROFESOR)) {
            return nomina + (25 * i);
        } else if (unCargo.equals(Cargo.SECRETARIA)) {
            return nomina + 100 + (25 * i);
        } else if (unCargo.equals(Cargo.JEFATURA)) {
            return nomina + 200 + (25 * i);
        } else if (unCargo.equals(Cargo.DIRECCION)) {
            return nomina + 300 + (25 * i);
        }
        return 0;
    }

}
