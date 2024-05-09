package ejercicios_avanzados.ejercicio1;

import java.util.LinkedList;

public class Pila<T> {
    private LinkedList<T> lista;

    public Pila() {
        lista = new LinkedList<>();
    }

    public void apilar(T elemento) {
        lista.addFirst(elemento);
    }

    public T desapilar() {
        if (estaVacia()) {
            throw new IllegalStateException("La pila está vacía");
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
        Pila<Integer> pila = new Pila<>();

        // Añadiendo elementos a la pila
        pila.apilar(1);
        pila.apilar(2);
        pila.apilar(3);

        // Desapilando elementos
        while (!pila.estaVacia()) {
            System.out.println("Desapilando: " + pila.desapilar());
        }
    }
}
