package Programacion;

import java.util.Scanner;
import java.time.Year;
import java.util.Random;

/**
 *
 * @author juasanlop2
 */
public class Pruebas {
    public static void main(String[] args) {
        Date fecha = new Date();
        int year = Year.now().getValue();

        System.out.println(year);


    }
}
