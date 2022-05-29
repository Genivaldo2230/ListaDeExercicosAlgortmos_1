/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.sp.algor1.aulasalgoritimos_1.ExercicicosAula_7;

import java.util.Scanner;

/**
 *
 * @author genivaldo.aanjos
 */
public class Exemplo3_Dowhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int op;

        do {
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divição");
            System.out.println(" Opção: ");
            op = sc.nextInt();
        }while(op > 4 || op < 1);
        System.out.println("Resultado: ");
        
        
    }
}
