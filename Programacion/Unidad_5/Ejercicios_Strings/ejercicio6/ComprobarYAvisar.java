package Programacion.Unidad_5.Ejercicios_Strings.ejercicio6;

import java.util.Scanner;

public class ComprobarYAvisar {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String passwd = "1234554321";
        String contraseña;

        StringBuilder feedback = new StringBuilder();

        System.out.print("Introduce la contraseña: ");
        contraseña = scn.nextLine();

        comprobar(scn, passwd, contraseña);

        retroalimentacion(passwd, contraseña, feedback);
    }

    private static void retroalimentacion(String passwd, String contraseña, StringBuilder feedback) {
        for (int i = 0; i < passwd.length() && i < contraseña.length(); i++) {
            if (passwd.charAt(i) == contraseña.charAt(i)) {
                feedback.append(passwd.charAt(i));
            } else {
                feedback.append("*");
            }
        }
        for (int i = feedback.length(); i < passwd.length(); i++) {
            feedback.append("*");
        }
        System.out.println("Retroalimentación: " + feedback);
    }

    private static void comprobar(Scanner scn, String passwd, String contraseña) {

        if (contraseña.equals(passwd)) {
            System.out.println("La contraseña es correcta, bienvenido.");

        } else {
            System.out.println("La contraseña es erronea");
            if (contraseña.length() < passwd.length()) {
                System.out.println("La contraseña introducida es menor a la correcta");
            } else {
                System.out.println("La contraseña introducida es mayor a la correcta");
            }

        }

    }
}
