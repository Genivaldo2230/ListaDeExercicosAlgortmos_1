//Fazer um algoritmo que leia dois números e imprime a divisão do maior pelo menor.
package org.senac.ListaExerciciosAula_1;

import java.util.Scanner;

/**
 *
 * @author gda_a
 */
public class Exerc14 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Divisão do numero maior pelo menor");
        System.out.println("Dgite o primeiro numero:");
        float numero1 = input.nextFloat();
        System.out.println("Digite o segundo numero:");
        float numero2 = input.nextFloat();
        float resultado;

        if (numero1 >= numero2) {
            System.out.println("Resultado da divisão:");
            resultado = numero1 / numero2;
            System.out.println(resultado);
        } else {
            System.out.println("Resultado da divisão:");
            resultado = numero2 / numero1;
            System.out.println(resultado);
        }
    }
}
