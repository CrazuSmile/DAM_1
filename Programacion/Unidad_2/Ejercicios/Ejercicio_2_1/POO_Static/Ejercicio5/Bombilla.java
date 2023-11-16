package Programacion.Unidad_2.Ejercicios.Ejercicio_2_1.POO_Static.Ejercicio5;

public class Bombilla {
    private boolean interruptor, interruptorGeneral;

    Bombilla() {
        interruptor = false;
        interruptorGeneral = false;
    }

    Bombilla(boolean interruptor, boolean interruptorGeneral) {
        this.interruptor = interruptor;
        this.interruptorGeneral = interruptor;
    }

    public boolean getInterruptor() {
        return interruptor;
    }

    public boolean getInterruptorGeneral() {
        return interruptorGeneral;
    }

    public void setInterruptor() {
        if (this.interruptor) {
            this.interruptor = false;
        } else {
            this.interruptor = true;
        }
    }

    public void setInterruptorGeneral() {
        if (this.interruptorGeneral) {
            this.interruptorGeneral = false;
        } else {
            this.interruptorGeneral = true;
        }
    }

    static void luceBombilla(boolean onOffGeneral, boolean onOff) {
        if (onOffGeneral && onOff) {
            System.out.println("La bombilla esta encendida");
        } else {
            System.out.println("La bombilla esta apagada");
        }
    }

}
