package com.senac.sp.algor1.ListaExerciciosAula_2;

import java.util.Scanner;

/*13. Faça um programa que leia um número natural N e calcule a soma abaixo (lembre-se de que tanto as divisões
        quanto o resultado devem ser decimais). Utilize o laço que lhe for mais conveniente.
        𝑆𝑆 = 1 + (1 ∗ 2)
        (1 ∗ 3)
        + (1 ∗ 2 ∗ 3)
        (1 ∗ 3 ∗ 5)
        + (1 ∗ 2 ∗ 3 ∗ 4)
        (1 ∗ 3 ∗ 5 ∗ 7)
        +. . . + (1 ∗ 2 ∗ 3 ∗. . .∗ 𝑁𝑁)
        1 ∗ 3 ∗ 5 ∗. . .∗ (2𝑁𝑁 − 1*/
public class Exercicio_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n;

        Scanner x = new Scanner(System.in);
        System.out.println("Escreva um número");
        int y = x.nextInt();
        for(int i = y; i>0;i--){//não pode fazer divisoes com zero
            if(y%i==0){
                System.out.println(i);
            }
        }
    }
}