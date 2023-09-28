
public class Ejercicio1 {
    public enum DiasSemana {
        Lunes, Martes, Miercoles, Jueves, Viernes, Sabado, Domingo
    }

    public static void main(String[] args) {
        DiasSemana martes = DiasSemana.Martes;
        DiasSemana domingo = DiasSemana.Domingo;

        System.out.println("El segundo dia de la semana es "+martes);
        System.out.println(" Y el domingo es el dia numero "+(domingo.ordinal()+1));
    }

}
