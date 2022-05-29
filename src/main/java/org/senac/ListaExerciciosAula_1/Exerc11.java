/*Fazer um algoritmo que lê um número e verifica se ele é negativo. Se for negativo, imprimir na tela a
mensagem "Numero negativo"*/
package org.senac.ListaExerciciosAula_1;

import java.util.Scanner;

/**
 *
 * @author gda_a
 */
public class Exerc11 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;
        System.out.println("Verificação do numero se ele é negativo");
        System.out.println("Informe o número:");
        numero = input.nextInt();

        if (numero < 0) {
            System.out.println("Número negativo");
        }
    }
}
