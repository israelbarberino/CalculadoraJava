package org.example;

import java.util.Scanner;

import static org.example.Operacoes.*;
import static org.example.Temporizador.aguardando;
import static org.example.Temporizador.tempo;
import static org.example.Validacao.validaOpcao;

public class Interactive {
    public static String msgMenu = "\nDIGITE A OPÇÃO DESEJADA: \n(C) --- CONTINUAR \n(M) --- MENU PRINCIPAL\n(S) --- SAIR";
    public static String msgOpcao = "\nDIGITE A OPÇÃO DESEJADA: \n(S) --- SIM \n(N) --- NÃO";
    static int opcao = 0;
    private static Scanner scn;

    public static void continuar(Scanner scn) {
        System.out.println(msgMenu);
        tempo();
        tempo();
        validaOpcao(scn);
    }

    public static void irMenu(Scanner scn){
        limpaTela();
        tempo();
        tempo();
        opcoes(scn);
    }

    public static void encerraPrograma() {
        aguardando();
        tempo();
        System.out.println("Encerrando aplicação.");
        tempo();
        System.out.println("Aplicação finalizada com sucesso!");
        tempo();
        tempo();
        System.exit(0);
    }

    private static void menu(){
        System.out.println(" Escolha a opção desejada ");
        System.out.println(" ------------------------- ");
        System.out.println("|                         |");
        System.out.println("|   1. ADIÇÃO             |");
        System.out.println("|   2. SUBTRAÇÃO          |");
        System.out.println("|   3. MULTIPLICAÇÃO      |");
        System.out.println("|   4. DIVISÃO            |");
        System.out.println("|   5. POTENCIAÇÃO        |");
        System.out.println("|   6. RADICIAÇÃO         |");
        System.out.println("|                         |");
        System.out.println("|   0. ENCERRAR           |");
        System.out.println("|                         |");
        System.out.println(" ------------------------- ");

    }

    public static void opcoes(Scanner scn) {
        menu();
        do {
            opcao = scn.nextInt();
            if (opcao < 0 || opcao > 6) {
                System.out.println("Opção inválida! Escolha novamente.");
            }
        } while (opcao < 0 || opcao > 6);
        switch (opcao) {
            case 1 -> programaSoma(scn);
            case 2 -> programaSub(scn);
            case 3 -> programaMulti(scn);
            case 4 -> programaDivide(scn);
            case 5 -> programaQuad(scn);
            case 6 -> programaRaiz(scn);
            case 0 -> encerraPrograma();
        }
    }

    public static void verificaOperacao(Scanner scn) {
        if (opcao == 1) {
            programaSoma(scn);
        } else if (opcao == 2) {
            programaSub(scn);
        } else if (opcao == 3) {
            programaMulti(scn);
        } else if (opcao == 4) {
            programaDivide(scn);
        } else if (opcao == 5) {
            programaQuad(scn);
        } else if (opcao == 6) {
            programaRaiz(scn);
        }
    }

    public static String bainha1 = "\n===========================\n";
    public static String bainha2 = "\n===========================\n";

    public static void cabecalho(Scanner scn){
        Interactive.scn = scn;
        String programa;
        if (opcao == 1){
            programa = "ADIÇÃO";
            System.out.println(bainha1);
            System.out.printf("SISTEMA DE %s INICIADO", programa);
            System.out.println(bainha2);
        } else if (opcao == 2) {
            programa = "SUBTRAÇÃO";
            System.out.println(bainha1);
            System.out.printf("SISTEMA DE %s INICIADO", programa);
            System.out.println(bainha2);
        } else if (opcao == 3) {
            programa = "MULTIPLICAÇÃO";
            System.out.println(bainha1);
            System.out.printf("SISTEMA DE %s INICIADO", programa);
            System.out.println(bainha2);
        } else if (opcao == 4) {
            programa = "DIVISÃO";
            System.out.println(bainha1);
            System.out.printf("SISTEMA DE %s INICIADO", programa);
            System.out.println(bainha2);
        } else if (opcao == 5) {
            programa = "POTENCIAÇÃO";
            System.out.println(bainha1);
            System.out.printf("SISTEMA DE %s INICIADO", programa);
            System.out.println(bainha2);
        } else if (opcao == 6) {
            programa = "RADICIAÇÃO";
            System.out.println(bainha1);
            System.out.printf("SISTEMA DE %s INICIADO", programa);
            System.out.println(bainha2);
        }
    }

    public static void limpaTela() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

        //COMANDO COM ANSI QUE NÂO ESTA FUNCIONANDO NO INTELLIJ - VERIFICAR OPCAO DEPOIS
        //System.out.print("\033[H\033[2J");
        //System.out.flush();
    }

}