package Programacion.Unidad_4.ejerciciosOpcionales.ejercicio2;

public abstract class Instituto {
    public enum Cargo {
        PROFESOR, SECRETARIA, JEFATURA, DIRECCION;

        public static Cargo fromStringToCargo(String cargo) {

            if ("PROFESOR".equalsIgnoreCase(cargo))
                return Cargo.PROFESOR;
            else if ("SECRETARIA".equalsIgnoreCase(cargo))
                return Cargo.SECRETARIA;
            else if ("JEFATURA".equalsIgnoreCase(cargo))
                return Cargo.JEFATURA;
            else if ("DIRECCION".equalsIgnoreCase(cargo))
                return Cargo.DIRECCION;

            else
                return null;

        }
    }

    protected Cargo unCargo;
    protected float nomina;

    Instituto(Cargo unCargo) {
        this.unCargo = unCargo;
    }

    public Cargo getUnCargo() {
        return unCargo;
    }

    public void setUnCargo(Cargo unCargo) {
        this.unCargo = unCargo;
    }

    public abstract float calcularNomina();
}
