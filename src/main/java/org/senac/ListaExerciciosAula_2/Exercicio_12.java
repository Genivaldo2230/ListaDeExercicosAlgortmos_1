package com.senac.sp.algor1.ListaExerciciosAula_2;

import java.util.Scanner;

//12. Faça um programa que leia um número natural N e calcule a soma abaixo (lembre-se de que tanto as divisões
//quanto o resultado devem ser decimais). Utilize o laço que lhe for mais conveniente.
public class Exercicio_12 {
    public static <soma> void main(String[] args) {
        Scanner sc = new Scanner( System.in );


        Scanner ent = new Scanner( System.in );
        float N;
        float B;
       float soma;

        int cont = 0;
        do {
            System.out.println( "Digite um nº" );
            N = sc.nextFloat();
            B = sc.nextFloat();
           soma = B + N;


            for (int i = 0; i<B; i++) {
                B = N % i;
            }

            System.out.println( "Resultado  " + N + " = " + B );
            cont++;

        } while (cont < 1);
    }
    }

