package Programacion.Unidad_1.Ejercicios_1_2.bucles;

import java.util.Random;

public class Ejercicio12 {
    public static void main(String[] args) {
        Random random = new Random();
        int d6 = random.nextInt(6) + 1, i;
        double porcentajeCara1 = 0, porcentajeCara2 = 0, porcentajeCara3 = 0, porcentajeCara4 = 0, porcentajeCara5 = 0,
                porcentajeCara6 = 0;
        ;

        for (i = 0; i <= 1000000; i++) {
            if (d6 == 1) {
                porcentajeCara1++;
            }
            if (d6 == 2) {
                porcentajeCara2++;
            }
            if (d6 == 3) {
                porcentajeCara3++;
            }
            if (d6 == 4) {
                porcentajeCara4++;
            }
            if (d6 == 5) {
                porcentajeCara5++;
            }
            if (d6 == 6) {
                porcentajeCara6++;
            }
            d6 = random.nextInt(6) + 1;
        }
        porcentajeCara1 /= 10000;
        porcentajeCara2 /= 10000;
        porcentajeCara3 /= 10000;
        porcentajeCara4 /= 10000;
        porcentajeCara5 /= 10000;
        porcentajeCara6 /= 10000;
        System.out.println("El porcentaje de cada cara son: \n1: " + porcentajeCara1 + "% \n2: " + porcentajeCara2
                + "% \n3: " + porcentajeCara3 + "% \n4: " + porcentajeCara4 + "% \n5: " + porcentajeCara5 + "% \n6: "
                + porcentajeCara6+"%");
    }
}
