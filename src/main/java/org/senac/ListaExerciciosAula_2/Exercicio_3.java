/*
Escreva um programa que leia um conjunto de 10 números inteiros positivos. Seu programa
deve determinar e imprimir o maior deles. Use o laço FOR.
 */
package org.senac.ListaExerciciosAula_2;

import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] x = new int[10];
        int i, soma;
        int maior = 0;

        for (i = 0; i < x.length; i++) {

            System.out.print("\t" + (i + 1) + "º" + "Digite numero:");

            soma = sc.nextInt();
            if (soma > maior) {
                maior = soma;
            }
        }
        System.out.println("Maior é: " + maior);
    }

}
