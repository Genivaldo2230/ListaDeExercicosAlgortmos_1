/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.sp.algor1.aulasalgoritimos_1.ExerciciosAula_2;

import java.util.Scanner;

/**
 * @author gda_a
 */
public class Exerc18 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double numeroA, numeroB, numeroC;

        System.out.println("Digite o primeiro numero");
        numeroA = sc.nextDouble();

        System.out.println("Digite o segundo número");
        numeroB = sc.nextDouble();

        System.out.println("Digite o terceiro número");
        numeroC = sc.nextDouble();

        if (numeroA >= numeroB + numeroC) {
            System.out.println("não forma triângulo");
        } else if (numeroA * numeroA == numeroB * numeroB + numeroC * numeroC) {
            System.out.println("TRIÂNGULO RETÂNGULO");
        } else if (numeroA * numeroA > numeroB * numeroB + numeroC * numeroC) {
            System.out.println("TRIÂNGULO OBTUSÂNGULO");
        } else if (numeroA * numeroA < numeroB * numeroB + numeroC * numeroC) {
            System.out.println("TRIANGULO ACUTÂNGULO");
        } else if (numeroA == numeroB & numeroA == numeroC & numeroC == numeroB) {
            System.out.println("TRIÂNGULO EQUILÁTERO");
        } else if (numeroA == numeroB & numeroA == numeroC && numeroB == numeroA & numeroB == numeroC && numeroC == numeroA & numeroC == numeroB) {
            System.out.println("TRIÂNGULO ISÓSCELES");

        }
    }
}