/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.senac.ListaExerciciosAula_1;

import java.util.Scanner;

/**
 * Fazer um algoritmo que lê dois números e imprime a soma dos quadrados dos dois números. O quadrado de um número A é representado por A2 = A * A.
 *
 * @author gda_a
 */
public class Exerc03 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        System.out.println("Digite o valor da BASE: ");
        int valor1 = numero.nextInt();
        int SomaQuadrada2 = valor1 * valor1;

        System.out.println("Digite o valor EXPOENTE: ");
        int valor2 = numero.nextInt();
        int SomaQuadrada = valor2 * valor2;

        int resultado = SomaQuadrada + SomaQuadrada2;

        System.out.println("Soma dos quadrados é: " + resultado);


    }

}
