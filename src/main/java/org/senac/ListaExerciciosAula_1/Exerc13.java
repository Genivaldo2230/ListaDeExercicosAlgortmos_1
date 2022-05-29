//Fazer um algoritmo que leia três números e imprime o maior deles.
package com.senac.sp.algor1.aulasalgoritimos_1.ExerciciosAula_2;

import java.util.Scanner;

/**
 *
 * @author gda_a
 */
public class Exerc13 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero1, numero2, numero3;

        System.out.println("O maior numero entre os três");
        System.out.println("Digite o primeiro numero:");
        numero1 = input.nextInt();
        System.out.println("Digite o segundo numero:");
        numero2 = input.nextInt();
        System.out.println("Digite o terceiro numero:");
        numero3 = input.nextInt();

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println(numero1);
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println(numero2);
        } else {
            System.out.println(numero3);

        }
    }
}
