package Programacion;

import Programacion.utils.InputOutputArrayUtils;

/**
 *
 * @author juasanlop2
 */
public class Pruebas {


    public static void main(String[] args) {

        int elementoBusqueda = 0;
        System.out.println("Búsqueda de elemento " + elementoBusqueda + " en vector. Inicialización.");
        int[] arrayTeclado = InputOutputArrayUtils.inicializarArrayTeclado();

        int posicion = InputOutputArrayUtils.buscarPrimeraAparicionElemento(arrayTeclado, elementoBusqueda);

        if (posicion >= 0) {
            System.out.println(
                    "Primera aparición del elemento " + elementoBusqueda + " en la posición " + (posicion + 1));
        } else {
            throw new RuntimeException("No hay ningún " + elementoBusqueda + " en el vector");
        }
    }
}
