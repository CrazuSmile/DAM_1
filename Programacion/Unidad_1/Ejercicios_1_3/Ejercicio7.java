package Programacion.Unidad_1.Ejercicios_1_3;

import java.util.Scanner;

public class Ejercicio7 {
    static void lineasCaracter(String ejemplo, int veces, int lineas){
        int contadorVeces = 0, contadorLineas = 0;
        while (contadorLineas < lineas) {
            while (contadorVeces < veces) {
                System.out.print(ejemplo+" ");
                contadorVeces++;                
            }
            System.out.println();
            contadorVeces = 0;
            contadorLineas++;
        }
    }
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String prueba;
        int numVeces, numeLineas;
        
        System.out.print("Escribe algo: ");
        prueba = lector.nextLine();
        System.out.print("Cuantas veces por linea: ");
        numVeces = lector.nextInt();
        System.out.print("Cuantas lineas: ");
        numeLineas = lector.nextInt();

        lineasCaracter(prueba, numVeces, numeLineas);
    }
}
