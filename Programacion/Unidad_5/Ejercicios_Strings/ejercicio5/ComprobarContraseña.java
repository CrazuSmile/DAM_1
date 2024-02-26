package Programacion.Unidad_5.Ejercicios_Strings.ejercicio5;

import java.util.Scanner;

public class ComprobarContraseña {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String passwd = "1234554321";
        String contraseña;
        boolean comprobar = true;

        System.out.print("Introduce la contraseña: ");
        contraseña = scn.nextLine();

        comprobar(scn, passwd, contraseña, comprobar);
    }

    private static void comprobar(Scanner scn, String passwd, String contraseña, boolean comprobar) {
        while (comprobar) {
            if (contraseña.equals(passwd)) {
                System.out.println("La contraseña es correcta, bienvenido.");
                comprobar = false;

            } else {
                System.out.println("La contraseña es erronea");
                if (contraseña.length() < passwd.length()) {
                    System.out.println("La contraseña introducida es menor a la correcta");
                } else {
                    System.out.println("La contraseña introducida es mayor a la correcta");
                }
                System.out.print("Introduce la contraseña: ");
                contraseña = scn.nextLine();
            }
        }
    }
}
