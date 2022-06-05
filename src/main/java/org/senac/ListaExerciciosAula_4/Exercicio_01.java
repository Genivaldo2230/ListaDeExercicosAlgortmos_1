package org.senac.ListaExerciciosAula_4;
//Dado um vetor de números inteiros, fazer um programa que imprime todos os elementos do vetor.
import java.util.Scanner;

public class Exercicio_01 {

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
    }
}
