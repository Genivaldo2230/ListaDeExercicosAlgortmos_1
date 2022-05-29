package org.senac.ListaExerciciosAula_1;

/*Leia 3 números decimais A, B e C e efetue o cálculo das raízes da equação de Bhaskara.
Se não for possível calcular as raízes, ou seja, caso haja uma divisão por 0 ou raiz de número negativo, mostre
a mensagem correspondente*/

import java.util.Scanner;

/**
 *
 * @author gda_a
 */
public class Exerc15 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a, b, c;
        System.out.println("Calculo de bhaskara");

        System.out.println("Digite o valor de A:");
        a = input.nextDouble();
        System.out.println("Digite o valor de B:");
        b = input.nextDouble();
        System.out.println("Digite o valor de C:");
        c = input.nextDouble();

        //calculo da raiz quadrada
        double raiz = (b * b) - 4 * a * c;

         if (raiz > 0 || a != 0) {
            double resultadoRaiz = Math.sqrt(raiz);
            double solucao1 = (-b + resultadoRaiz) / (2 * a);
            double solucao2 = (-b - resultadoRaiz) / (2 * a);
            System.out.println("Os valores das raizes sao: " + solucao1 + " e " + solucao2);
        } else {
            System.out.println("Imposs�vel calcular");
        }
    }
}

