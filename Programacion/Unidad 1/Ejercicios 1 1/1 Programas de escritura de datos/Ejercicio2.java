import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        String nombre1, nombre2, apellido1, apellido2;
        int diaNa, mesNa, añoNa;
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Escribe tu nombre: ");
        nombre1 = lector.next();
        nombre2 = lector.next();
        lector.nextLine();

        System.out.print("Primer apellido: ");
        apellido1 = lector.next();

        lector.nextLine();

        System.out.print("Segundo apellido: ");
        apellido2 = lector.next();
        lector.nextLine();

        System.out.println("Fecha de naciminto");
        diaNa = lector.nextInt();
        mesNa = lector.nextInt();
        añoNa = lector.nextInt();

        System.out.println("Tu nombre completo es "+nombre1+" "+nombre2+" "+apellido1+" "+apellido2+"\nFecha De Naciemiento: "+diaNa+"/"+mesNa+"/"+añoNa);
        

    }
    
}