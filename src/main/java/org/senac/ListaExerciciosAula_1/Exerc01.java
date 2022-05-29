/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.sp.algor1.aulasalgoritimos_1.ExerciciosAula_2;

import java.util.Scanner;

/**
 * Fazer um algoritmo que leia dois números e imprima na tela o produto
 * (multiplicação) dos dois números.
 *
 * @author genivaldo.aanjos
 */
public class Exerc01 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o  primeiro valor");
        int valor1 = entrada.nextInt();

        System.out.println("Digite o segundo valor");
        int valor2 = entrada.nextInt();

        int produto = valor1 * valor2;

        System.out.println("Os valores sao: " + produto);

    }

}
