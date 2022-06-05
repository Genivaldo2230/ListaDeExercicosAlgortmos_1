package org.senac.ListaExerciciosAula_2;

//Faça um programa para imprimir os números pares entre 100 e 1, em ordem decrescente,
// Ou seja, o laço deve iniciar em 100 e encerrar em 1. Use o laço FOR.
public class Exercicio_5 {
    public static void main(String[] args) {

        for (int i = 100; i >= 0; i--) {

            if (i % 2 == 0) {

                System.out.println("Núm pares decrecente: " + i);
            }


        }
    }
}