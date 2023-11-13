package Programacion.Unidad_2.Ejercicios.Ejercicio_2_1.EJercicio3;

public class PuntoApp {
    public static void main(String[] args) {
        Punto punto1 = new Punto();
        Punto punto2 = new Punto(5, 3);
        Punto punto3 = new Punto(2, -1);
        Punto punto4 = new Punto(((punto2.getCoordX() + punto3.getCoordX()) / 2),
                ((punto2.getCoordY() + punto3.getCoordY()) / 2));
        Punto punto5 = new Punto(4, 3);

        System.out.println("( " + punto1.getCoordX() + " , " + punto1.getCoordY() + " ) , ( " + punto2.getCoordX()
                + " , " + punto2.getCoordY() + " ) , ( " + punto3.getCoordX() + " , " + punto3.getCoordY() + " ) , ( "
                + punto4.getCoordX() + " , " + punto4.getCoordY() + " )");

        punto5.distancia(punto5.getCoordX(), punto5.getCoordY(), punto2.getCoordX(), punto2.getCoordY());
        punto5.distancia(punto5.getCoordX(), punto5.getCoordY());

    }
}
