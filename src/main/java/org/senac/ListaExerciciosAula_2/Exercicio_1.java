package org.senac.ListaExerciciosAula_2;
// EXERCICIO #-1 PDF -2
// Faça um programa que mostre todos os números inteiros de 1 a 50. Use o laço WHILE.

public class Exercicio_1 {
    public static void main(String[] args) {

        System.out.println("Numeros de 0 a 50:   ");
        int num1 = 0, num2 = 0;

        while (num1 <= 50) {
            num1++;
            System.out.printf("%d\t", num1, num2);
        }

        System.out.printf("\n", "Os números inteiros é: ");
    }
}