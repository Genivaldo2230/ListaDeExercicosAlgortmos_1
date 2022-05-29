package org.example;

// Faça um programa que gere a seguinte série: 10, 20, 30, 40, ..., 990, 1000. Use o laço While.
public class Exercicio_4 {

    private static int i;

    public static void main(String[] args) {
        System.out.println("Números: ");

        for (int i = 10; i < 1000; i = i + 10) {
            System.out.println(i);
        }
    }

}