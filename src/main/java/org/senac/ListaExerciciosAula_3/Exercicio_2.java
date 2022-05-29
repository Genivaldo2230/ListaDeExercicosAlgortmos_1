package org.senac.ListaExerciciosAula_3;

import java.util.Scanner;

//Fazer uma função chamada somatoria que tem como parâmetro de entrada um número inteiro positivo
//N e fornece como saída a soma de todos os números inteiros positivos menores ou iguais a N.
//Exemplo: se N for 3, a função deve retornar 6, que é a soma de 1 + 2 + 3.
public class Exercicio_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite Entrada : ");

        int N, somatoria;

        System.out.println(" Digite um número inteiro: ");
        N = sc.nextInt();
        somatoria = soma(N);
        System.out.println("a soma dos números até N é: " + somatoria);
    }

    public static int soma(int n) {
        if (n == 1) {
            return n;
        } else {
            return n + soma(n - 1);
        }
    }
}
