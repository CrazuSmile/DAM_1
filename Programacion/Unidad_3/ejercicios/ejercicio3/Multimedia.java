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

    Multimedia(String titulo, String autor, int añoPublicacion, Formato miFormato, int hora, int minuto, int segundo) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.miFormato = miFormato;
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;

    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return titulo+"."+miFormato+", "+autor+", " +", "+añoPublicacion+", "+ hora + ":" + minuto + ":" + segundo;
    }
}
