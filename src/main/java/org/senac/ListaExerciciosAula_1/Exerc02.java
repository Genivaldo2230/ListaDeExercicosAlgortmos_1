/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.senac.ListaExerciciosAula_1;

import java.util.Scanner;

/**
 * Fazer um algoritmo que lê dois números, a base e o expoente, e imprime a potência 
(base elevada ao expoente). Dica: use a função matemática Math.pow().
 Exemplo: 5 elevado ao cubo ficaria Math.pow(5, 3). Você pode trocar esses números por variáveis.
 *
 * @author genivaldo.aanjos
 */
public class Exerc02 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da BASE: ");
        int valor1 = sc.nextInt();

        System.out.println("Digite o valor EXPOENTE: ");
        int valor2 = sc.nextInt();

        double resultado = Math.pow(valor2, valor1);
        System.out.println("O valor expoente é: " + resultado);
    }

}
