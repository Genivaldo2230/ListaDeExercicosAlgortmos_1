/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.sp.algor1.ExerciciosAdos.ExerciciosAdo1;

import java.util.Scanner;

/**
 * @author gda_a
 */
public class Calcular_Soma_E_Add_150_Ado {

    public static void main(String[] args) {
        int a, b, c;

        System.out.println("Digite numero:");

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        System.out.println("Digite numero:");
        b = sc.nextInt();

        c = a + b;
        System.out.println("Resultado: =" + c);
        if (c >= 100) {
            System.out.println("Resultado final:" + (c + 150));

        } else {
            System.out.println(c);
        }
    }
}
