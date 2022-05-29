package com.mycompany.exerciciovetores;

import java.util.Scanner;

public class Exercicio_05 {

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
        }
        int media = 0;
        int count = 0;
        int soma = 0;

        for (int i = 0; i < v.length; i++) {
            soma = soma + v[i];
            count = count + 1;
        }
        for (int i = 0; i < v.length; i++) {
            System.out.print("Vetor [" + i + "]: " + v[i]);
            System.out.println("");
        }
        media = soma / count;
        System.out.println("Média: " + media);
    }
}
