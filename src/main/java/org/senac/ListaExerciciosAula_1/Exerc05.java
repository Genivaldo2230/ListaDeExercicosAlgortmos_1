/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.sp.algor1.aulasalgoritimos_1.ExerciciosAula_2;

import java.util.Scanner;

/**
 * Fazer um algoritmo que leia um valor L e calcula a área de um quadrado de lado L.
 *
 * @author gda_a
 */
public class Exerc05 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int n1 = entrada.nextInt();

        System.out.println("Digite segundo numero: ");
        int n2 = entrada.nextInt();

        int resultado = n1 * n2;

        System.out.println("a área de um quadrado de lado " + n1 + n2 + " deu: " + resultado);
    }


}
