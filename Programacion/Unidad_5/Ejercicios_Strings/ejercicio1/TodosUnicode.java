package Programacion.Unidad_5.Ejercicios_Strings.ejercicio1;

public class TodosUnicode {
    public static void main(String[] args) {
        for (int codePoint = 0x0000; codePoint <= 0xFFF; codePoint++) {
            String xxxx = Integer.toHexString(codePoint);
            System.out.println("\\u" + xxxx + ": " + (char) codePoint);
        }
    }
}
