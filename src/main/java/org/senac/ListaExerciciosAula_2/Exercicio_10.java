package org.senac.ListaExerciciosAula_2;

//Faça um programa que calcule e imprima o resultado da soma abaixo (lembre-se de que tanto as divisões quanto o resultado
// devem ser decimais). Utilize o laço que lhe for mais conveniente.
// �?���?��=1+12+13+14+...+120
public class Exercicio_10 {
    public static void main(String[] args) {

        int numerador = 1;

        float resposta = 0;

        for (int denominador = 1; denominador <= 20; denominador++) {

            numerador = numerador + 2;
            resposta = resposta + (numerador / denominador);
        }

        System.out.printf("%f",+ resposta);
    }


}
