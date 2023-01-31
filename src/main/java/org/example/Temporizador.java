package org.example;

public class Temporizador {

    public static void tempo() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void aguardando() {
        System.out.print("Aguarde");
        tempo();
        System.out.print(".");
        tempo();
        System.out.print(".");
        tempo();
        System.out.print(".");
        tempo();
        System.out.print("\n");
    }
}
