import java.util.Scanner;

public class Suma {

    public static void main(String[] args) {
        double valor1, valor2;    
        Scanner lector = new Scanner(System.in);

        System.out.print("Introduzaca un numero: ");
        
        valor1 = lector.nextDouble();

        lector.nextLine();

        System.out.print("Introduzca un segundo numero: ");

        valor2 = lector.nextDouble();

        lector.nextLine();

        System.out.println("La suma es: "+valor1+" + "+valor2+" = "+(valor1+valor2) );


    }
}