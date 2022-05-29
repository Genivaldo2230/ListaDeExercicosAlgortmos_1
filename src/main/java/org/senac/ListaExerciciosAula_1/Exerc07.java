/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.sp.algoritimo1.Aula_02;

import java.util.Scanner;

/**
 * Fazer um algoritmo que leia os dois lados A e B de um triângulo retângulo e calcula a hipotenusa do triângulo. Para esse caso, considere que ℎ𝑖𝑝𝑜𝑡𝑒𝑛𝑢𝑠𝑎 = √𝐴2+𝐵2. Dica: nesse programa, você deve usar a função matemática Math.sqrt(). Por exemplo, a raiz de 121 ficaria Math.sqrt(121).
 *
 * @author gda_a
 */
public class Exerc07 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, h;
        System.out.println("Calculo da hipotenusa");
        System.out.println("Informe o valor de A:");
        a = sc.nextFloat();
        System.out.println("Informe o valor de B:");
        b = sc.nextFloat();

        double raiz = (a * a) + (b * b);
        h = Math.sqrt(raiz);

        System.out.println("Hipotenusa: " + h);
    }
}
