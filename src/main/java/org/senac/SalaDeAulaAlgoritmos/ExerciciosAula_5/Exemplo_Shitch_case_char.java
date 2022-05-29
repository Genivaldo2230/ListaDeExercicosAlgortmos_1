package com.senac.sp.algor1.aulasalgoritimos_1.ExerciciosAula_5;

import java.util.Scanner;

public class Exemplo_Shitch_case_char {
    public static void main(String[] args) {

        float nota1, nota2, media;

        Scanner sc = new Scanner(System.in);

        char grande;
        System.out.println("Digite a Primeira nota : ");
        nota1 = sc.nextFloat();
        System.out.println("Digite a Segunda nota :");
        nota2 = sc.nextFloat();

        media = (nota1 + nota2) / 2;
        System.out.println("A media é " + media + " ");

        if (media >= 9) {
            grande = 'A';
        } else if (media >= 8 && media < 9) {
            grande = 'B';
        } else if (media >= 7 && media < 8) {
            grande = 'C';
        } else if (media >= 6 && media < 7) {
            grande = 'D';
        } else {
            grande = 'E';

            switch (grande) {

                case 'A':
                    System.out.println("Conceito A");
                    break;
                case 'B':
                    System.out.println("Conceito B");
                    break;
                case 'C':
                    System.out.println("Conceito C");
                    break;
                case 'D':
                    System.out.println("Conceito D");
                    break;
                case 'E':
            }
            System.out.println("Conceito E");
        }
    }
}