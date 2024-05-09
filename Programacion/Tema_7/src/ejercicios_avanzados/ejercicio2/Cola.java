package ejercicios_avanzados.ejercicio2;

import java.util.LinkedList;

public class Cola<T> {
    private LinkedList<T> lista;

    public Cola() {
        lista = new LinkedList<>();
    }

    public void encolar(T elemento) {
        lista.addLast(elemento);
    }

    public T desencolar() {
        if (estaVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }
        return lista.removeFirst();
    }

    public boolean estaVacia() {
        return lista.isEmpty();
    }

    public int tamaño() {
        return lista.size();
    }

    public static void main(String[] args) {
        Cola<Integer> cola = new Cola<>();

        // Añadiendo elementos a la cola
        cola.encolar(1);
        cola.encolar(2);
        cola.encolar(3);

        // Desencolando elementos
        while (!cola.estaVacia()) {
            System.out.println("Desencolando: " + cola.desencolar());
        }
    }
}
