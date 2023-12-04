package Programacion.Unidad_2.Balance.ejercicio5;

public class Balanza {
    private int peso;
    private long pesoIntento;

    public int getPeso() {
        return peso;
    }

    public long getPesoIntento() {
        return pesoIntento;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int equilibrar() {
        int numIntentos = 0;
        while (peso > 0) {
            numIntentos++;
            pesoIntento = Math.round(Math.random() * 100);

            peso -= pesoIntento;
            System.out.printf("\tIntento=%d\tPeso añadido=%2d\tQueda por equilibrar=%3d\n", numIntentos, pesoIntento,
                    peso);
            if (peso == 0)
                System.out.println("Peso balanceado");

        }
        return numIntentos;
    }
}
