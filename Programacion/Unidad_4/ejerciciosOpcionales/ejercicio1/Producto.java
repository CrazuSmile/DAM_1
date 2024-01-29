package Programacion.Unidad_4.ejerciciosOpcionales.ejercicio1;

import java.util.Calendar;

public class Producto {
    private int codProducto;
    private String descripcion;
    private float precio;
    private Calendar fechaAlta;

    Producto(int codProducto, String descripcion, float precio, Calendar fechaAlta) {
        this.codProducto = codProducto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.fechaAlta = fechaAlta;
    }

    public int getCodProducto() {
        return codProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Calendar getFechaAlta() {
        return fechaAlta;
    }

    public float getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        if ( instanceof PC) {
            return "PC#" + codProducto;
        } else if (obj instanceof Movil) {
            return "Movil#" + codProducto;
        }
        return null;
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        if (obj instanceof Producto) {

            Producto objProducto = (Producto) obj;

            if (objProducto.getCodProducto() == this.getCodProducto()) {
                return true;
            }
        }
        return false;
    }
}
