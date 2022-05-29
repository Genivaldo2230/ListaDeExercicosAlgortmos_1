/*Escreva um programa que leia o número de cadastro de um funcionário, seu número de horas trabalhadas,
o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre na tela o número e o
salário do funcionário.*/
package org.senac.ListaExerciciosAula_1;

import java.util.Scanner;

/**
 *
 * @author gda_a
 */
public class Exerc09 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double horas, valorHora;
        int cadastro;
        System.out.println("Cálculo do salário do funcionário");
        System.out.println("Informe numero de cadastro do funcionario:");
        cadastro = input.nextInt();
        System.out.println("Informe as horas trabalhadas:");
        horas = input.nextDouble();
        System.out.println("Informe o valor que recebe por hora:");
        valorHora = input.nextDouble();

        double salario = horas * valorHora;
        System.out.println("Funcionário: " + cadastro + "\n" + "Salário: " + "R$" + salario);


    }

}
