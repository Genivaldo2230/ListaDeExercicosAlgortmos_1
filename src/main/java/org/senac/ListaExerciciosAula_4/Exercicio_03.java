package com.mycompany.exerciciovetores;

import java.util.Scanner;

public class Exercicio_03 {

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
        int maior = v[0];

        for (int i = 0; i < v.length; i++) {
            if (v[i] > maior) {
                maior = v[i];
            }
        }
        for (int i = 0; i < v.length; i++) {
            System.out.print("Vetor [" + i + "]: " + v[i]);
            if (v[i] == maior) {
                System.out.print(" é o maior.");
            }
            System.out.println("");
        }
    }
}
