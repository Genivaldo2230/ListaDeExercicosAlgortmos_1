/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.sp.algor1.ExerciciosAula_6;

/**
 * Faça um programa que mostre os números pares entre 1 e 100, inclusive. Use o
 * laço
 *
 * @author gda_a
 */
public class NewClass {

    public static void main(String[] args) {

        for (int i = 1; i < 9; i++) {

            System.out.println("\nTabuada do " + i);

            for (int n = 1; n <= 10; n++) {

                System.out.print(i + " x " + n + " = " + i * n);
            }
        }
    }
}