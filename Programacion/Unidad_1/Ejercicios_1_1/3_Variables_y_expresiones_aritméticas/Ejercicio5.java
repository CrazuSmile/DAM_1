public class Ejercicio5 {
    public static void main(String[] args) {
        int a, b;
        double resultadoA, resultadoB, resultadoC;

        a = 2;
        b = 4;

        resultadoA = -a + 5 % b - a * a;
        resultadoB = 5 + 3 % 7 * b * a - b % a;
        resultadoC = (a + 1) * (b + 1) - b / a;

        System.out.println("A: " + resultadoA + "\nB: " + resultadoB + "\nC: " + resultadoC);
    }
}
