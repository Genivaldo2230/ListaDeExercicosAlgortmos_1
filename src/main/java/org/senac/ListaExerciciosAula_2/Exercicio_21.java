package org.senac.ListaExerciciosAula_2;

import java.util.Scanner;

public class Exercicio_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite Entrada");
        int N = sc.nextInt();
        int X = 0, soma;

        for (int i = 0; i < N; i++) {
            soma = 0;
            X = sc.nextInt();
            for (int j = 1; j < X; j++) {
                if (X % j == 0) soma += j;
            }
            if (soma == X)
                System.out.println(X + " È Perfeito");
            else System.out.println(X + " Não é Perfeito");
        }
    }
}