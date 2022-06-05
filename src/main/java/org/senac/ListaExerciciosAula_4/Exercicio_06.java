package org.senac.ListaExerciciosAula_4;

import java.util.Scanner;

public class Exercicio_06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        System.out.println( "Tamanho: " );
        int t = sc.nextInt();
        int[] v = new int[t];
        for (int i = 0; i < v.length; i++) {
            System.out.printf( "vetor [%d]: \n", i );
            v[i] = sc.nextInt();
        }
        for (int i = 0; i < v.length; i++) {
        }
        int produto = 0;

        for (int i = 0; i < v.length; i++) {
            produto = produto + v[i];
        }
        for (int i = 0; i < v.length; i++) {
            System.out.print( "Vetor [" + i + "]: " + v[i] );
            System.out.println();
        }
        System.out.println( "Produto: " + produto );
    }
}
