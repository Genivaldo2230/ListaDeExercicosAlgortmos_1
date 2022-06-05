package org.senac.SalaDeAulaAlgoritmos.ExerciciosAula_7;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );

        // System.out.println("Digite numero : ");

        int[] a = new int[3];
        int b, soma;
        int maior = 0;

        for (int i = 0; i < a.length; i++) {
            System.out.println( "Digite Entrada: " + (i + 1) + "° " );
            soma = sc.nextInt();
            if (soma > maior) {
                maior = soma;

            }

        }
        System.out.println( "Maior é :" + maior );

    }
}