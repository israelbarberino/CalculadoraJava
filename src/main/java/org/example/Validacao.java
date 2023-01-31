package org.example;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

import static org.example.Interactive.*;
import static org.example.Operacoes.*;


public class Validacao {

    public static String opcao = "";
    public static String resposta = "";

    public static void validaOpcao(Scanner scn) {

        do {
            opcao = scn.next().toLowerCase();
            if (!(opcao.equals("c") || opcao.equals("s") || opcao.equals("m"))) {
                System.out.println("Opção inválida." + msgMenu);
            }
        } while (!(opcao.equals("c") || opcao.equals("s") || opcao.equals("m")));
        switch (opcao) {
            case "m" -> irMenu(scn);
            case "s" -> encerraPrograma();
            case "c" -> verificaOperacao(scn);
            default -> throw new IllegalStateException("Unexpected value: " + opcao);
        }
    }


    //metodos de validação dos numeros
    public static int validaNumero(Scanner scn) {
        int numero = scn.nextInt();
        while (numero < 0 || numero > 9999999) {
            System.out.println("Número inválido. Digite um número de 1 a 10:");
            numero = scn.nextInt();
        }
        return numero;
    }

    public static void validaOpcaoDivisao(@NotNull Scanner scn) {
        do {
            resposta = scn.next().toLowerCase();
            if (!(resposta.equals("s") || resposta.equals("n"))) {
                System.out.println("Opção inválida." + msgOpcao);
            }
        } while (!(resposta.equals("s") || resposta.equals("n")));
        switch (resposta) {
            case "n" -> programaDivide(scn);
            case "s" -> programaDivideDouble(scn);
            default -> throw new IllegalStateException("Unexpected value: " + resposta);
        }
    }
}
