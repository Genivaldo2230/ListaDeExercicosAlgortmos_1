/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.senac.SalaDeAulaAlgoritmos.ExerciciosAdos.ExerciciosAdo2;

/**
 * Exerciocio # 01 Faça um programa que mostre os números pares entre 1 e 100,
 * inclusive. Use o laço
 *
 * @author gda_a
 */
public class Ado_Exercicio_1 {

    public static void main(String[] args) {
        System.out.println("Números pares!! ");

        int i = 0;

        for (i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.printf("%d:Nun Pares\n", i);
            }

        }

    }
}