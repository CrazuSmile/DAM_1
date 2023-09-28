import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        float precioLitro1, pagado1, km1;
        float precioLitro2, pagado2;
        float km3;
        float litros1, litros2, consumo100, precioKM;

        Scanner tcl = new Scanner(System.in);

        System.out.println("Introduce precio/litro, la cantidad pagada y los kilometros realizado: ");
        precioLitro1 = tcl.nextFloat();
        pagado1 = tcl.nextFloat();
        km1 = tcl.nextFloat();

        System.out.println("Introduce precio/litro, la cantidad pagada: ");
        precioLitro2 = tcl.nextFloat();
        pagado2 = tcl.nextFloat();

        System.out.println("Introduce los kilometros: ");
        km3 = tcl.nextFloat();

        litros1 = pagado1 / precioLitro1;
        litros2 = pagado2 / precioLitro2;

        consumo100 = 100 * (litros1 + litros2) / (km1 + km3);

        precioKM = (pagado1 + pagado2) / (km1 + km3);

        System.out.println("Consumo por 100km: " + consumo100);
        System.out.println("Precio KM: " + precioKM);

    }
}
