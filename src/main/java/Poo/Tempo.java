package Poo;

public class Tempo {
    private int hora;
    private int minuto;
    private int segundo;

    public Tempo(int hora, int minuto, int segundo) {
        if(hora >= 23 || minuto >= 59 || segundo >= 59) {
            this.hora = 00;
            this.minuto = 00;
            this.segundo = 00;
            System.out.println("Horário incorreto");
        }else {
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        }
    }
    public String toString(){
        String s = hora + ":" + minuto + ":" + segundo;
        return s;
    }

}
