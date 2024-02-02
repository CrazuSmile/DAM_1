package Programacion.Unidad_4.ejerciciosOpcionales.ejercicio3;

public abstract class Figura implements Relacionable{

    public abstract float area();
    
    @Override
    public boolean esMayorQue(Relacionable a) {
        // TODO Auto-generated method stub
        if (a instanceof Figura) {

            Figura aFigura = (Figura) a;

            if (aFigura.area() > this.area()){
                return true;
            }

        }
        return false;
    }

    @Override
    public boolean esMenorQue(Relacionable a) {
        // TODO Auto-generated method stub
        if (a instanceof Figura) {

            Figura aFigura = (Figura) a;

            if (aFigura.area() < this.area()){
                return true;
            }

        }
        return false;
    }

    @Override
    public boolean esIgualQue(Relacionable a) {
        // TODO Auto-generated method stub
        if (a instanceof Figura) {

            Figura aFigura = (Figura) a;

            if (aFigura.area() == this.area()){
                return true;
            }

        }
        return false;
    }
    
}
