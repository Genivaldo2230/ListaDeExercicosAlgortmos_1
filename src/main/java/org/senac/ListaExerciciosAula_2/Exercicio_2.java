package org.senac.ListaExerciciosAula_2;

import java.util.Scanner;

//Faça um programa que leia um número N do usuário, some todos os números
// inteiros de 1 a N, e mostre o resultado obtido. Use o laço WHILE.
public class Exercicio_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N;
        System.out.println("Digite o valor de N:");
        N = input.nextInt();

        int numerador = 1;
        float resposta = 0;

        for (int denominador = 1; denominador <= N; denominador++) {
            numerador = numerador + 2;
            resposta = resposta + (numerador + denominador);
        }

        System.out.printf("%f", +resposta);
    }
}
