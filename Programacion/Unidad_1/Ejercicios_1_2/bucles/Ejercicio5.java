package Programacion.Unidad_1.Ejercicios_1_2.bucles;

public class Ejercicio5 {
    public static void main(String[] args) {
        int par = 1, impar = 1, mul4 = 1, mul7 = 1;

        System.out.println("Los numeros pares de entre el 1 al 100 son: ");
        while (par < 100) {
            par++;
            if (par % 2 == 0) {
                System.out.print(par + ", ");
            }
        }

        System.out.println();
        System.out.println("-----------------------------------");
        System.out.println("Los numeros impares de entre el 1 al 100 son: ");
        while (impar < 100) {
            if (impar % 2 != 0) {
                System.out.print(impar + ", ");
            }
            impar++;

        }

        System.out.println();
        System.out.println("-----------------------------------");
        System.out.println("Los numeros multiplos de 4 entre el 1 al 100 son: ");
        while (mul4 < 100) {
            mul4++;
            if (mul4 % 4 == 0) {
                System.out.print(mul4 + ", ");
            }
        }

        System.out.println();
        System.out.println("-----------------------------------");
        System.out.println("Los numeros multiplos de 7 entre el 1 al 100 son: ");
        while (mul7 < 100) {
            mul7++;
            if (mul7 % 7 == 0) {
                System.out.print(mul7 + ", ");
            }
        }
    }
}
