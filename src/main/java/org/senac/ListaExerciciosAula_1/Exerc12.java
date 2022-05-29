/*Fazer um algoritmo que leia dois números L e R. O programa deve verificar a maior área entre um quadrado
de lado L e um círculo de raio R. Imprimir na tela qual o maior: "Quadrado" ou "Círculo".
*/
package org.senac.ListaExerciciosAula_1;

import java.util.Scanner;

/**
 *
 * @author gda_a
 */
public class Exerc12 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double l, r, areaL, areaR;

        System.out.println("Qual a maior área entre o quadrado e o Círculo?");
        System.out.println("Informe o valor de L (lado do quadrado):");
        l = input.nextDouble();
        System.out.println("Informe o valor de R (raio do circulo):");
        r = input.nextDouble();

        areaL = l * l;

        double pi = 3.14;
        areaR = pi * (r * r);

        if (areaL > areaR) {
            System.out.println("A area maior é do Quadrado");
        } else {
            System.out.println("A area maior é do Círculo");
        }
    }
}
