import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        String asignatura;
        int nota1erEx, nota2doEx, notaMedia;

        Scanner lector = new Scanner(System.in);

        System.out.print("Asignatura: ");

        asignatura = lector.next();
        lector.nextLine();

        System.out.print("Nota del primer examen: ");

        nota1erEx = lector.nextInt();
        lector.nextLine();

        System.out.print("Nota del segundo examen: ");

        nota2doEx = lector.nextInt();
        lector.nextLine();

        notaMedia = (nota1erEx+nota2doEx)/2;

        System.out.println("Nota media: "+notaMedia);
    }
    

    
}
