import java.util.Scanner;

public class Suma {

    public static void main(String[] args) {
        int valor1, valor2, resultado;    
        Scanner lector = new Scanner(System.in);

        System.out.print("Introduzaca un numero: ");
        
        valor1 = lector.nextInt();

        lector.nextLine();

        System.out.print("Introduzca un segundo numero: ");

        valor2 = lector.nextInt();

        lector.nextLine();

        resultado = valor1 + valor2;

        System.out.println("La suma es: "+valor1+" + "+valor2+" = "+resultado );


    }
}