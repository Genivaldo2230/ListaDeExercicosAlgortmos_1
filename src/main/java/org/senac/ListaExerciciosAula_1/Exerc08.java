/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.sp.algoritimo1.Aula_02;

import java.util.Scanner;

/**
 * Fazer um algoritmo que leia quatro números e imprime a média aritmética dos quatro números.
 *
 * @author gda_a
 */
public class Exerc08 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite i primero numero: ");
        int n1 = sc.nextInt();

        System.out.println("Digite o segundo numero: ");
        int n2 = sc.nextInt();

        System.out.println("digite o terceiro numero: ");
        int n3 = sc.nextInt();

        System.out.println("Digite o quarto numero: ");
        int n4 = sc.nextInt();

        int resultado = (n1 + n2 + n3 + n4) / 4;

        System.out.println("A média Aritmética é " + resultado);

    }

}
