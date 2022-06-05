/*Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele
no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas,
calcular e imprimir o total a receber no final do mês.*/
package org.senac.ListaExerciciosAula_1;

import java.util.Scanner;

/**
 *
 * @author gda_a
 */
public class Exerc10 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome;
        double salarioFixo, totalVendas, comissao;

        System.out.println("Calculo do salário final do vendedor");
        System.out.println("Informe o nome do vendedor:");
        nome = input.nextLine();
        System.out.println("Informe o seu salário fixo:");
        salarioFixo = input.nextDouble();
        System.out.println("Informe o valor total de vendas efetuadas no mês:");
        totalVendas = input.nextDouble();
        comissao = 0.15;

        double comissaoFuncionario = comissao * totalVendas;
        double salarioFinal = comissaoFuncionario + salarioFixo;

        System.out.println("O funcionário " + nome + " " + "irá receber no final do mês R$" + salarioFinal);


    }

}
