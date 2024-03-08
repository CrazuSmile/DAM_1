package ejercicio3;

public class U02Ejercicio19 {
    public static void main(String[] args) {
        float precioLitro1, pagado1, km1;
        float precioLitro2, pagado2;
        float km3;
        float litros1, litros2, consumo100, precioKm;

        java.util.Scanner lector = new java.util.Scanner(System.in);

        System.out.println("Introduce el precio/litro, la cantidad pagada, y los kilometros realizados: ");
        precioLitro1 = lector.nextFloat();
        pagado1 = lector.nextFloat();
        km1 = lector.nextFloat();

        System.out.println("Introduce el precio/litro, la cantidad pagada: ");
        precioLitro2 = lector.nextFloat();
        pagado2 = lector.nextFloat();

        System.out.println("Introduce el cuenta kilometros: ");
        km3 = lector.nextFloat();

        litros1 = pagado1 / precioLitro1;
        litros2 = pagado2 / precioLitro2;
        if ((km3 - km1) > 0) {
            consumo100 = 100 * (litros1 + litros2) / (km3 - km1);
        } else {
            throw new RuntimeException("No se puede dividir entre cero y no puede ser negativo");
        }

        if ((km3 - km1) > 0) {
            precioKm = (pagado1 + pagado2) / (km3 - km1);
        } else {
            throw new RuntimeException("No se puede dividir entre cero y no puede ser negativo");
        }

        System.out.println("\nConsumo por cada 100Km: " + consumo100 + "L");
        System.out.println("Coste por Km: " + precioKm + "€");

    }
}
