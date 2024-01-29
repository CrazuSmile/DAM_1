package Programacion.Unidad_4.ejerciciosOpcionales.ejercicio1;

import java.util.Calendar;

public class Producto {
    private int codProducto;
    private String descripcion;
    private float precio;
    private Calendar fechaAlta;

    Producto(int codProducto, String descripcion, float precio, Calendar fechaAlta){
        this.codProducto = codProducto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.fechaAlta = fechaAlta;
    }

}
