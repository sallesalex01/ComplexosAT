package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    private static JTextField parteReal1 = new JTextField(5);
    private static JTextField parteImaginaria1 = new JTextField(5);
    private static JTextField parteReal2 = new JTextField(5);
    private static JTextField parteImaginaria2 = new JTextField(5);
    private static JTextArea resultado = new JTextArea(5, 20);

    public static void main(String[] args) {
        criarEMostrarTela();
        
    }
    private static void criarEMostrarTela() {
        JFrame frame = new JFrame("Calculadora");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,600);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6,2));
        
        resultado.setEnabled(false);
        resultado.setEditable(false);

        parteReal1.setFont((new Font("Arial", Font.PLAIN, 30)));
        parteImaginaria1.setFont((new Font("Arial", Font.PLAIN, 30)));
        parteImaginaria2.setFont((new Font("Arial", Font.PLAIN, 30)));
        parteReal2.setFont((new Font("Arial", Font.PLAIN, 30)));
        resultado.setFont((new Font("Arial", Font.PLAIN, 30)));

        JLabel label1 = new JLabel("Numero real 1:");
        label1.setFont((new Font("Arial", Font.BOLD, 30)));
        JLabel labelImaginario1 = new JLabel("Numero imaginario 1:");
        labelImaginario1.setFont((new Font("Arial", Font.BOLD, 30)));
        label1.setFont((new Font("Arial", Font.BOLD, 30)));
        JLabel label2 = new JLabel("Número 2:");
        label2.setFont((new Font("Arial", Font.BOLD, 30)));
        JLabel labelImaginario2 = new JLabel("Numero imaginario 2:");
        labelImaginario2.setFont((new Font("Arial", Font.BOLD, 30)));
        JLabel label3 = new JLabel("RESULTADO:");
        label3.setFont((new Font("Arial", Font.BOLD, 30)));

        panel.add(label1);
        panel.add(parteReal1);
        panel.add(labelImaginario1);
        panel.add(parteImaginaria1);
        panel.add(label2);
        panel.add(parteReal2);
        panel.add(labelImaginario2);
        panel.add(parteImaginaria2);
        panel.add(label3);
        panel.add(resultado);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JButton btnSoma = new JButton("soma");
        btnSoma.setFont(new Font("Arial", Font.PLAIN, 30));
        JButton btnSubtracao = new JButton("subtração");
        btnSubtracao.setFont(new Font("Arial", Font.PLAIN, 30));
        JButton btnModulo = new JButton("Modulo");
        btnModulo.setFont(new Font("Arial", Font.PLAIN, 30));
        buttonPanel.add(btnSoma);
        buttonPanel.add(btnSubtracao);
        buttonPanel.add(btnModulo);

        panel.add(buttonPanel);


        btnSoma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularOperacao("soma");
            }
        });

        btnSubtracao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularOperacao("subtracao");
            }
        });

        btnModulo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularOperacao("modulo");
            }
        });


        frame.add(panel);

        frame.setVisible(true);
    }

    private static void calcularOperacao(String operacao) {
        try {
            double real1 = Double.parseDouble(parteReal1.getText());
            double imaginaria1 = Double.parseDouble(parteImaginaria1.getText());
            double real2 = Double.parseDouble(parteReal2.getText());
            double imaginaria2 = Double.parseDouble(parteImaginaria2.getText());

            Complexo num1 = new Complexo(real1, imaginaria1);
            Complexo num2 = new Complexo(real2, imaginaria2);

            switch (operacao) {
                case "soma":
                    resultado.setText(CalculadoraComplexa.somar(num1, num2));
                    break;
                case "subtracao":
                    resultado.setText(CalculadoraComplexa.subtrair(num1, num2));
                    break;
                case "modulo":
                    resultado.setText(CalculadoraComplexa.modulo(num1));
                    break;
            }
        } catch (NumberFormatException ex) {
            resultado.setText("Erro: Insira números válidos.");
        }
    }
}