package org.senac.ListaExerciciosAula_2;

import javax.swing.*;

public class Exercicio_20 {
    public static void main(String[] args) {

        int numero;
        double saldoAltual;
        double valorOperacao;
        double novoSaldo;

        System.out.println("Informa o numero da Sua Conta ");
        numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero da sua conta "));

        System.out.println("Informe o numero da sua conta ");
        saldoAltual = Integer.parseInt(JOptionPane.showInputDialog("Informe o seu saldo atual"));


        System.out.println("Informe o tipo de operção: 1  Depósito " + " 2 Saque ");
        numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o tipo de Operação: 1 Depósito." + "2 Saque"));

        System.out.println("Informe o valor da Operação");
        valorOperacao = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor da operação "));
        if (numero == 1) {

            novoSaldo = (saldoAltual + valorOperacao);
            System.out.println("O seu saldo é :" + novoSaldo);
        }else{
            novoSaldo = (saldoAltual - valorOperacao);
            System.out.println("O novo saldo é : "+ novoSaldo);
            if(novoSaldo <= 0){
                System.out.println("Conta Saldo Negativo");

            }
        }

    }
}
