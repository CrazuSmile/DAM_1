package Programacion.Unidad_2.MediaDeN.ejercicio5;

import java.util.Scanner;

public class Media {
    private int n;
    private float resultado;

    public void setN(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public float getResultado() {
        return resultado;
    }

    public void mediaN() {
        Scanner tcl = new Scanner(System.in);
        float valor = 0;
        int i;

        for (i = 1; i <= n; i++) {
            resultado = resultado + valor;
            System.out.print("      Introduce el valor " + i + ": ");
            valor = tcl.nextFloat();
        }
        resultado = resultado + valor;
        resultado = resultado / i;
    }
}
