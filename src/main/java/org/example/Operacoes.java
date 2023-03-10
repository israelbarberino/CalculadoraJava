package org.example;

import java.util.Scanner;

import static org.example.Interactive.*;
import static org.example.Temporizador.tempo;
import static org.example.Validacao.validaNumero;

public class Operacoes {

    public static void programaSoma(Scanner scn){
        try {
            limpaTela();
            tempo();
            cabecalho(scn);
            int n1, n2;
            System.out.println(Interactive.msg1);
            n1 = validaNumero(scn);
            System.out.println(Interactive.msg2);
            n2 = validaNumero(scn);
            int soma = n1 + n2;
            System.out.println(n1 + " + " + n2 + " = " + soma);
            continuar(scn);
        } catch (Exception e) {
            System.out.println(Interactive.errorMsg);
        }
    }

    public static void programaSub(Scanner scn){
        try {
            limpaTela();
            cabecalho(scn);
            int n1, n2;
            System.out.println(Interactive.msg1);
            n1 = validaNumero(scn);
            System.out.println(Interactive.msg2);
            n2 = validaNumero(scn);
            int resto = n1 - n2;
            System.out.println(n1 + " - " + n2 + " = " + resto);
            continuar(scn);
        } catch (Exception e) {
            System.out.println(Interactive.errorMsg);
        }
    }

    public static void programaMulti(Scanner scn){
        try {
            limpaTela();
            cabecalho(scn);
            int n1, n2;
            System.out.println(Interactive.msg1);
            n1 = validaNumero(scn);
            System.out.println(Interactive.msg2);
            n2 = validaNumero(scn);
            int produto = n1 * n2;
            System.out.println(n1 + " x " + n2 + " = " + produto);
            continuar(scn);
        } catch (Exception e) {
            System.out.println(Interactive.errorMsg);
        }
    }

    public static void programaDivide(Scanner scn) {
        try {
            limpaTela();
            cabecalho(scn);
            int n1, n2;

            System.out.println(Interactive.msg1);
            n1 = validaNumero(scn);
            System.out.println(Interactive.msg2);
            n2 = validaNumero(scn);

            if (n1 == 0) {
                System.out.println("O numerador n??o pode ser zero.");
                continuar(scn);
                return;
            }

            double d1 = n1;
            double d2 = n2;
            double restoDivisao = d1 / d2;

            System.out.printf("%.4f%n", restoDivisao);
            continuar(scn);
        }
        catch (Exception e) {
            System.out.println(Interactive.errorMsg);
        }
    }

    public static void programaDivideDouble(Scanner scn) {
        try {
            limpaTela();
            cabecalho(scn);
            int n1, n2;

            System.out.println(Interactive.msg1);
            n1 = validaNumero(scn);
            System.out.println(Interactive.msg2);
            n2 = validaNumero(scn);

            if (n1 == 0) {
                System.out.println("O numerador n??o pode ser zero.");
                continuar(scn);
                return;
            }

            if (n2 == 0) {
                System.out.println("N??o ?? poss??vel dividir por zero.");
                continuar(scn);
            }


        }
        catch (Exception e) {
            System.out.println(Interactive.errorMsg);
        }
    }

    public static void programaQuad(Scanner scn){
        try {
            limpaTela();
            cabecalho(scn);
            int n1;
            System.out.print("Digite um n??mero para saber o quadrado: ");
            n1 = validaNumero(scn);
            int quadrado = (int) Math.pow(n1, 2);
            System.out.println("O quadrado de " + n1 + " ??: " + quadrado);
            continuar(scn);
        } catch (Exception e) {
            System.out.println(Interactive.errorMsg);
        }
    }

    public static void programaRaiz(Scanner scn){
        try {
            limpaTela();
            cabecalho(scn);
            System.out.print("Digite um n??mero para saber a raiz: ");
            int n1 = validaNumero(scn);
            while (Math.sqrt(n1) % 1 != 0) {
                System.out.println("Este n??mero n??o tem raiz inteira.");
                System.out.print("Digite outro numero: ");
                n1 = validaNumero(scn);
            }
            int raiz = (int) Math.sqrt(n1);
            System.out.println("A ra??z quadrada de " + n1 + " ?? :" + raiz);
            continuar(scn);
        } catch (Exception e) {
            System.out.println(Interactive.errorMsg);
        }
    }
}
