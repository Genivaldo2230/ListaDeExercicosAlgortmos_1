/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.senac.SalaDeAulaAlgoritmos.ExerciciosAula_7;

import java.util.Scanner;

/**
 *
 * @author genivaldo.aanjos
 */
public class Exemplo2_While {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("i: ");
        int i = sc.nextInt();
        System.out.println("Fim: ");
        int f = sc.nextInt();
        
        if (i < f) {
            System.out.printf("%d dever ser maior do que %d \n", i, f);
        } else {

            while (i >= f) {
             if(i%2 ==0){
                System.out.println("i:" + i);
            }
                i--;
            }
        }
        System.out.println("Fora do Laço");
    }
}