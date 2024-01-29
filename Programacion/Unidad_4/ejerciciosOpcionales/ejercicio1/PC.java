package Programacion.Unidad_4.ejerciciosOpcionales.ejercicio1;

import java.util.Calendar;

public class PC extends Producto {
    private float ram;
    private float discoDuro;
    private String os;
    private float cpu;

    PC(int codProducto, String descripcion, float precio, Calendar fechaAlta, float ram, float discoDuro, String os,
            float cpu) {
        super(codProducto, descripcion, precio, fechaAlta);
        this.ram = ram;
        this.discoDuro = discoDuro;
        this.os = os;
        this.cpu = cpu;
    }
}
