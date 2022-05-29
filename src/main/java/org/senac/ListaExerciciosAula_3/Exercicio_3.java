package org.senac.ListaExerciciosAula_3;

import java.util.Scanner;

//Fazer uma função chamada fatorial que tem como parâmetro de entrada um número inteiro positivo n
//e fornece como saída o fatorial desse número.
//Exemplo: se N for 5, a função deve retornar 120, que é a multiplicação de 1 * 2 * 3 * 4 * 5
//4.
public class Exercicio_3 {


    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );

        System.out.println( "Digite Entrada : " );

        int j = 0, n = 0;
        n = sc.nextInt();

        int mult = 0;

        for (int i = 1; i >=mult; i++) {
            if(i ==n) {
                mult = n * j;
                System.out.println( "O fatorial de " + " é "+ n );
            }

        }
    }


}
