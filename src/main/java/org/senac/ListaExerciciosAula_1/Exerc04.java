/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.senac.ListaExerciciosAula_1;

import java.util.Scanner;

/**
 * Fazer um algoritmo que lê dois números inteiros e imprime os números consecutivos desses números.
 * (Por exemplo: se o usuário digitar 2 e -9, a saída deverá ser 3 e -8, porque 3 é consecutivo de 2. –8 é consecutivo de –9)
 *
 * @author gda_a
 */
public class Exerc04 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite primeiro valor: ");
        int valor1 = sc.nextInt();

        System.out.println("Digite segundo valor: ");
        int valor2 = sc.nextInt();

        int resultado1 = valor1 + 1;
        int resultado2 = valor2 + 1;


        System.out.println("O resultado 1 é " + resultado1);

        System.out.println("O resultado 2 é " + resultado2);

    }

}
