package Programacion.Unidad_3.ejercicios.ejercicio3;

public class Multimedia {
    public enum Formato {
        WAV, MP3, MP4, MPEG, MIDI, MOV, OGG
    }

    protected String titulo;
    protected String autor;
    protected int añoPublicacion;
    protected Formato miFormato;
    protected int hora;
    protected int minuto;
    protected int segundo;

    public Multimedia(String titulo, String autor, int añoPublicacion, Formato miFormato, int hora, int minuto,
            int segundo) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.miFormato = miFormato;
        if (hora >= 0) {
            this.hora = hora;
        }
        if (minuto > 0 && minuto < 60) {
            this.minuto = minuto;
        }
        if (segundo > 0 && segundo < 60) {
            this.segundo = segundo;
        } else {
            this.segundo = 1;
        }
    }

    public String getAutor() {
        return autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public int getHora() {
        return hora;
    }

    public Formato getMiFormato() {
        return miFormato;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public void setHora(int hora) {
        if (hora >= 0) {
            this.hora = hora;
        } else {
            System.out.println("ERROR: La duracion en horas no puede ser negativa.");
        }
    }

    public void setMiFormato(Formato miFormato) {
        this.miFormato = miFormato;
    }

    public void setMinuto(int minuto) {
        if (minuto > 0 && minuto < 60) {
            this.minuto = minuto;

        } else {
            System.out.println("ERROR: La duracion en minutos no puede ser negativa.");
        }
    }

    public void setSegundo(int segundo) {
        if (segundo > 0 && segundo < 60) {
            this.segundo = segundo;
        } else {
            System.out.println("ERROR: La duracion en segundos no puede ser negativa.");
        }
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Titulo: " + titulo + "." + miFormato + "\nAutor: " + autor + "\nAño de publicacion: " + añoPublicacion
                + "\nDuracion: " + hora + ":" + minuto + ":"
                + segundo;
    }
}
