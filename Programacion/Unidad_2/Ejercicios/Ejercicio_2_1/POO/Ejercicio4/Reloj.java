package Programacion.Unidad_2.Ejercicios.Ejercicio_2_1.POO.Ejercicio4;

public class Reloj {
    private int hora, minuto, segundo;

    Reloj() {
        hora = 0;
        minuto = 0;
        segundo = 0;
    }

    Reloj(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public void daHora() {
        System.out.println(this.hora + ":" + this.minuto + ":" + this.segundo);
    }

    public void daHora24() {
        if (this.hora >= 0 && this.hora < 24 && this.minuto >= 0 && this.minuto < 60 && this.segundo >= 0
                && this.segundo < 60) {
            System.out.println(this.hora + ":" + this.minuto + ":" + this.segundo);
        } else {
            System.out.println("ERROR");
        }
    }

    public void daHora12() {
        if (this.hora >= 0 && this.hora < 24 && this.minuto >= 0 && this.minuto < 60 && this.segundo >= 0
                && this.segundo < 60) {
            if (this.hora > 12) {
                System.out.println((this.hora - 12) + ":" + this.minuto + ":" + this.segundo + " pm");

            } else {
                System.out.println(this.hora + ":" + this.minuto + ":" + this.segundo + " am");

            }
        } else {
            System.out.println("ERROR");
        }
    }

    public void dimeHora24() {
        if (this.hora >= 0 && this.hora < 24) {
            if (this.hora >= 0 && this.hora < 24) {
                if (this.minuto >= 0 && this.minuto < 60) {
                    if (this.segundo >= 0 && this.segundo < 60) {
                        System.out.println(this.hora + ":" + this.minuto + ":" + this.segundo);
                    } else {
                        System.out.println(this.hora + ":" + (this.minuto + 1) + ":" + (this.segundo - 60));
                    }
                } else {
                    if (this.segundo >= 0 && this.segundo < 60) {
                        System.out.println((this.hora + 1) + ":" + (this.minuto - 60) + ":" + this.segundo);
                    } else {
                        System.out.println((this.hora + 1) + ":" + (this.minuto + 1 - 60) + ":" + (this.segundo - 60));
                    }
                }
            } else {
                if (this.minuto >= 0 && this.minuto < 60) {
                    if (this.segundo >= 0 && this.segundo < 60) {
                        System.out.println((this.hora - 24) + ":" + this.minuto + ":" + this.segundo);
                    } else {
                        System.out.println((this.hora - 24) + ":" + (this.minuto + 1) + ":" + (this.segundo - 60));
                    }
                } else {
                    if (this.segundo >= 0 && this.segundo < 60) {
                        System.out.println(((this.hora - 24) + 1) + ":" + (this.minuto - 60) + ":" + this.segundo);
                    } else {
                        System.out
                                .println(((this.hora - 24) + 1) + ":" + (this.minuto + 1 - 60) + ":"
                                        + (this.segundo - 60));
                    }
                }
            }
        } else {
            System.out.println("Error");
        }
    }

    public void dimeHora12() {
        if (this.hora >= 0 && this.hora < 24) {
            if (this.hora >= 0 && this.hora < 12) {
                if (this.minuto >= 0 && this.minuto < 60) {
                    if (this.segundo >= 0 && this.segundo < 60) {
                        System.out.println(this.hora + ":" + this.minuto + ":" + this.segundo + " am");
                    } else {
                        System.out.println(this.hora + ":" + (this.minuto + 1) + ":" + (this.segundo - 60) + " am");
                    }
                } else {
                    if (this.segundo >= 0 && this.segundo < 60) {
                        System.out.println((this.hora + 1) + ":" + (this.minuto - 60) + ":" + this.segundo + " am");
                    } else {
                        System.out.println(
                                (this.hora + 1) + ":" + (this.minuto + 1 - 60) + ":" + (this.segundo - 60) + " am");
                    }
                }
            } else {
                if (this.minuto >= 0 && this.minuto < 60) {
                    if (this.segundo >= 0 && this.segundo < 60) {
                        System.out.println((this.hora - 12) + ":" + this.minuto + ":" + this.segundo + " am");
                    } else {
                        System.out.println(
                                (this.hora - 12) + ":" + (this.minuto + 1) + ":" + (this.segundo - 60) + " am");
                    }
                } else {
                    if (this.segundo >= 0 && this.segundo < 60) {
                        System.out.println(
                                ((this.hora - 12) + 1) + ":" + (this.minuto - 60) + ":" + this.segundo + " am");
                    } else {
                        System.out
                                .println(((this.hora - 12) + 1) + ":" + (this.minuto + 1 - 60) + ":"
                                        + (this.segundo - 60)
                                        + " am");
                    }
                }
            }
        } else {
            System.out.println("Error");
        }
    }
}
