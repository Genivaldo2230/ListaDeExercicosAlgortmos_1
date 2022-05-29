package com.mycompany.exerciciovetores;

import java.util.Scanner;

public class Exercicio_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tamanho: ");
        int t = sc.nextInt();
        int[] v = new int[t];
        for (int i = 0; i < v.length; i++) {
            System.out.printf("vetor [%d]: \n", i);
            v[i] = sc.nextInt();
        }
        for (int i = 0; i < v.length; i++) {
            System.out.printf("vetor[%d]: %d \n", i, v[i]);
        }
        int soma = 0;

        for (int i = 0; i < v.length; i++) {
            soma = soma + v[i];

        }
        System.out.println("Soma: " + soma);
    }
}
