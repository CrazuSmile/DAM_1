package Programacion.Unidad_2.Ejercicios.Ejercicio_2_1.POO.Ejercicio4;

public class RelojApp {
    public static void main(String[] args) {
        Reloj reloj1 = new Reloj();
        Reloj reloj2 = new Reloj(23, 60, 60);

        reloj1.daHora();
        reloj2.daHora();
        reloj1.daHora24();
        reloj2.daHora24();
        reloj1.daHora12();
        reloj2.daHora12();
        reloj1.dimeHora24();
        reloj2.dimeHora24();
        reloj1.dimeHora12();
        reloj2.dimeHora12();
    }
}
