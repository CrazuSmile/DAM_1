package Programacion.Unidad_4.ejercicio1.ejercicio4;

public class SeguroDeceso extends Seguro {

    @Override
    public float calcularPrimaAnual() {
        // TODO Auto-generated method stub

        if (asegurado.edad() < 18) {
            return (float) 10.00;
        }
        if (asegurado.edad() >= 19 && asegurado.edad() <= 39) {
            return (float) 22.00;
        }
        if (asegurado.edad() >= 40 && asegurado.edad() <= 49) {
            return (float) 45.00;
        }
        if (asegurado.edad() >= 50 && asegurado.edad() <= 55) {
            return (float) 62.00;
        }
        if (asegurado.edad() >= 56 && asegurado.edad() <= 60) {
            return (float) 88.00;
        } else {
            return asegurado.edad() + 10;
        }
    }
}
