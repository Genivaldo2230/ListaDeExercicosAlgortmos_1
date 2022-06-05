/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.senac.SalaDeAulaAlgoritmos.ExerciciosAula_6;

/**
 * 1. Faça um programa que mostre todos os números inteiros de 1 a 50. 
 * Use o laço WHILE.
 * @author gda_a
 */
public class Aula_loop_whil {

    public static void main(String[] args) {

        System.out.println("Numeros de 0 a 50:  ");
        int num1 = 0, num2 = 0;
       
        while(num1 <= 50) {
            num1 += num2++;
            num2++;
        }
        System.out.printf("%d\n", num2);

        System.out.printf("Os números inteiros é: ");

    }

}
