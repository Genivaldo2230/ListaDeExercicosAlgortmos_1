package org.senac.ListaExerciciosAula_2;

//Escreva um programa que imprima todos os múltiplos de 7 menores que 200. Use o laço for
public class Exercicio_7 {
    public static void main(String[] args) {
        int x;
        for (x = 0; x < 200; x++) {
            if (x % 7 == 0) {
                System.out.println("Imprimar:\t" + x);
            }
        }
    }
}
