package org.senac.ListaExerciciosAula_2;
//Faça um programa que leia um número natural N e calcule a soma abaixo (lembre-se de que tanto as divisões quanto o
// resultado devem ser decimais). Utilize o laço que lhe for mais conveniente.
// �?���?��=1−12+13−14+15−...+1�?�?�?�?

import java.util.Scanner;

public class Exercicio_11 {

        public static void main(String[] args) {
            Scanner input= new Scanner(System.in);
            int N;
            System.out.println("Digite o valor de N:");
            N=input.nextInt();

            int numerador = 1;
            float resposta = 0;
            for (int denominador = 1; denominador <= N; denominador++) {
                numerador = numerador + 2;
                resposta = resposta + (numerador / denominador);
            }

            System.out.printf("%f",+ resposta);
        }
}
