package Programacion.Unidad_4.ejerciciosOpcionales.ejercicio1;

import java.util.Calendar;

public class Movil extends Producto {
    private String marca;
    private String modelo;

    Movil(int codProducto, String descripcion, float precio, Calendar fechaAlta, String marca, String modelo){
        super(codProducto, descripcion, precio, fechaAlta);
        this.marca = marca;
        this.modelo = modelo;
    }
}
