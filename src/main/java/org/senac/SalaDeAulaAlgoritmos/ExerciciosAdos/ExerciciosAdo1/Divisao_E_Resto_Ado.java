/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.sp.algor1.aulasalgoritimos_1.ExerciciosAdos.ExerciciosAdo1;

import java.util.Scanner;

/**
 * @author gda_a
 */
public class Divisao_E_Resto_Ado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite primero num");
        int n1 = sc.nextInt();
        System.out.println("Digite segundo num");
        int n2 = sc.nextInt();
        // System.out.println("Digite primero num");

        int resutado = n1 / n2;
        int resto = n1 % n2;

        System.out.println("Resposta:" + " = " + n1 / n2);
        if (resto > 0) {
            System.out.println("O resto é: " + " = " + resto);
        } else {
            System.out.println("O resto da divisao exata:" + " = " + n1 % n2 + resto);

        }
    }
}
