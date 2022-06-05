package org.senac.ListaExerciciosAula_4;

import java.util.Scanner;

public class Exercicio_04 {

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
        int menor = v[0];

        for (int i = 0; i < v.length; i++) {
            if (v[i] < menor) {
                menor = v[i];
            }
        }
        for (int i = 0; i < v.length; i++) {
            System.out.print("Vetor [" + i + "]: " + v[i]);
            if (v[i] == menor) {
                System.out.print(" é o menor.");
            }
            System.out.println("");
        }
    }
}
