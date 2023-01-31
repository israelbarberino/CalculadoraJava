package org.example;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.text.DateFormatSymbols;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

import static org.example.Interactive.opcoes;
import static org.example.Temporizador.aguardando;
import static org.example.Temporizador.tempo;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        JButton button = new JButton("Clique aqui");
        frame.getContentPane().add(button, BorderLayout.CENTER);

        Border border = BorderFactory.createLineBorder(Color.BLACK, 4);
        button.setBorder(border);

        Font font = new Font("Arial", Font.BOLD, 20);
        button.setFont(font);

        button.addActionListener(e -> {
            LocalDate now = LocalDate.now();
            Scanner scn = new Scanner(System.in);
            DateFormatSymbols dfs = new DateFormatSymbols(new Locale("pt", "BR"));

            LocalDate agora = LocalDate.now();
            int dia = agora.getDayOfMonth();
            int mes = agora.getMonthValue();
            int ano = agora.getYear();

            String[] semanas = dfs.getWeekdays();
            String diaSemana = semanas[now.getDayOfWeek().getValue() + 1];

            System.out.println("Bem-vindo ao meu projeto em Java SE 8\n");
            tempo();
            System.out.println("Hoje é " + diaSemana + ", dia " + dia + "/" + mes + "/" + ano);
            tempo();

            System.out.print("\nQual seu nome? ");
            String nome = scn.nextLine();

            aguardando();
            tempo();
            System.out.println("\nOlá, " + nome + "\n");

            tempo();
            tempo();

            opcoes(scn);

            JOptionPane.showMessageDialog(frame, "Aplicação iniciada");
        });

        frame.setVisible(true);
    }
}