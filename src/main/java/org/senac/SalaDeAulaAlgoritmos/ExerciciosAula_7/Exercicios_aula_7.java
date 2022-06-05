/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.senac.SalaDeAulaAlgoritmos.ExerciciosAula_7;

import java.util.Scanner;

/**
 *
 * @author gda_a
 */
public class Exercicios_aula_7 {

    public static void main(String[] args) {
        int i = 0, soma = 0, x;
        Scanner sc = new Scanner(System.in);

        while (i < 10) {
            System.out.println("â€œDigite o item â€? + i");
            x = sc.nextInt();
            if (x < 0) {
                System.out.println("â€œNumero invalido\n!");
                break;
            }
            soma = soma + x;
            i = i + 1;
        }
        System.out.println("TOTAL: â€? + soma");
    }
}
