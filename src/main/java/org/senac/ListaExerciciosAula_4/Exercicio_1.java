package org.senac.ListaExerciciosAula_4;
//Dado um vetor de números inteiros, fazer um programa que imprime todos os elementos do vetor.
//2.
import java.util.Scanner;

public class Exercicio_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num = 5;
        int[] numero = new int[num];

        for(int i = 0; i < num; ++i){
            System.out.println("Insira a numero do " + (i+1) );
            numero[i] = input.nextInt();
        }

        for(int i = 0; i < num; ++i){
            System.out.println("-> " + numero[i] );
        }

    }
}