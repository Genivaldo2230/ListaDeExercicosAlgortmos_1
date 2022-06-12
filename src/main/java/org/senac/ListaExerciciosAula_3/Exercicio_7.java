package org.senac.ListaExerciciosAula_3;

import java.util.Scanner;

//Faça uma função que recebe por parâmetro o raio (R) de uma esfera e calcula o seu volume, onde o
//volume é dado por:
//V = 3
//4 × π × R3
public  class Exercicio_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );


        //uma função que recebe por parâmetro o raio (R) de uma esfera
            double r, a, v, raio = 0;
            System.out.println( "Digite o raio da esfera: " );
            raio = sc.nextDouble();

            r = 3 * 3.14 * raio;
            a = 3.14 * Math.pow( raio, 3 );
            v = 3 / 4 * 3.14 * Math.pow( raio, 3 );

            System.out.println( "O valor do comprimento é: " + r );
            System.out.println( "O valor da área é: " + a );
            System.out.println( "O valor do volume: " + v );

        }
    }
