package Programacion.Unidad_2.Ejercicios.Ejercici_2_1.Ejercicio1;

public class Coche {
    private String modelo;
    private String color;
    private String matricula;

    private enum tipoCoche {
        MINI, UTILITARIO, FAMILIAR, DEPORTIVO
    }

    private enum seguro {
        TERCEROS, A_TODO_RIESGO
    }

    private boolean pintura;
    private int año;

    public void imprimeCoche(String nomModelo, String nomColor, boolean metalico) {
        modelo = nomModelo;
        color = nomColor;
        pintura = metalico;

        if (metalico) {
            System.out.print(modelo + " " + color + " metalico");
        } else {
            System.out.print(modelo + " " + color + " no metalico");
        }
    }
}
