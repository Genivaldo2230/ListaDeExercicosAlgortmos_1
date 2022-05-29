package org.senac.ListaExerciciosAula_3;

import java.util.Scanner;

//13. Faça uma função que recebe, por parâmetro, um valor inteiro e positivo e retorna o número de divisores
//desse valor.
public class Exercicio_13vazio {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );

        System.out.println( "Digite a entrada:" );
        int num = 0;
        num = sc.nextInt();
        int divisores = num;
        double div = 0.0;


        for (int i = num; i > 0; i--) {
            if (num % i == 0) div++;

        }

        System.out.println(div );
    }


    }
