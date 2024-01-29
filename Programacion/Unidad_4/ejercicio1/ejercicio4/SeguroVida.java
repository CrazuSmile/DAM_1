package Programacion.Unidad_4.ejercicio1.ejercicio4;

public class SeguroVida extends Seguro {
    @Override
    public float calcularPrimaAnual() {
        // TODO Auto-generated method stub
        if (asegurado.edad() <= 25) {
            return asegurado.edad() * 1;
        }
        if (asegurado.edad() >= 26 && asegurado.edad() <= 34) {
            return (float) (asegurado.edad() * 1.1);
        }
        if (asegurado.edad() >= 35 && asegurado.edad() <= 44) {
            return (float) (asegurado.edad() * 1.2);
        }
        if (asegurado.edad() >= 45 && asegurado.edad() <= 54) {
            return (float) (asegurado.edad() * 1.3);
        }
        if (asegurado.edad() >= 55 && asegurado.edad() <= 64) {
            return (float) (asegurado.edad() * 1.4);
        }
        else {
            System.out.println("No se puede contrata seguro de vida.");
            return 0;
        }

    }

    @Override
    public int compararSeguro() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compararSeguro'");
    }
}
