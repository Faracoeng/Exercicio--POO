package Poo;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int h, m, s;
        System.out.println("Hora?");
        h = teclado.nextInt();
        System.out.println("Minuto?");
        m = teclado.nextInt();
        System.out.println("Segundo?");
        s = teclado.nextInt();
        Tempo time = new Tempo(h, m, s);
    }
}
