package Programacion.Unidad_4.ejerciciosOpcionales.ejercicio1;

public class TestApp {
    public static void main(String[] args) {
        Producto producto1 = new PC(36096, "Prueba 1", 12, null, 8, 250, "Windows", 1023);
        Producto producto2 = new Movil(36096, null, 0, null, null, null);

        System.out.println("¿Son iguales? "+producto1.equals(producto2));
    }
}
