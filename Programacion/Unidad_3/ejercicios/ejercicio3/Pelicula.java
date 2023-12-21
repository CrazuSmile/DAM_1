package Programacion.Unidad_3.ejercicios.ejercicio3;

public class Pelicula extends Multimedia {

    protected String actorPrincipal;
    protected String actrizPrincipal;

    Pelicula(String titulo, String autor, int añoPublicacion, Formato miFormato, int hora, int minuto, int segundo,
            String actorPrincipal, String actrizPrincipal) {
        super(titulo, autor, añoPublicacion, miFormato, hora, minuto, segundo);
        this.actorPrincipal = actorPrincipal;
        this.actrizPrincipal = actrizPrincipal;

    }

    public String getActorPrincipal() {
        return actorPrincipal;
    }

    public String getActrizPrincipal() {
        return actrizPrincipal;
    }

    public void setActorPrincipal(String actorPrincipal) {
        this.actorPrincipal = actorPrincipal;
    }

    public void setActrizPrincipal(String actrizPrincipal) {
        this.actrizPrincipal = actrizPrincipal;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "Reparto: " + actorPrincipal + ", " + actrizPrincipal;
    }
}
