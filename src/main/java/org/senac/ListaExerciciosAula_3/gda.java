package org.senac.ListaExerciciosAula_3;

import java.util.Scanner;

//Faça uma função que recebe a média final de um aluno por parâmetro e retorna o seu conceito, conforme
//a tabela abaixo:Nota Conceito
//de 0,0 a 4,9 D
//de 5,0 a 6,9 C
//de 7,0 a 8,9 B
//de 9,0 a 10,0 A
//12.
public class gda{

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );

        double media = 0;
        System.out.println( "Digite a nota do Aluno: " );
        media = sc.nextDouble();
        media = media;
        String nota = "";
        System.out.println( nota);
        while (media > 0.0) {

            if ((media >= 0.0) && (media <= 4.9)) {
                nota = "D";
                break;

            } else if ((media >= 5.0) && (media <= 6.9)) {
                nota = "C";
                break;

            } else if ((media >= 7.0) && (media <= 8.9)) {
                nota = "B";
                break;

            } else if ((media > 9.0) && (media <= 10.0)) {
                nota = "A";
                break;
            }else if ("A".equals( nota )) {
                System.out.println( "Sua nota foi : A " );
                break;
            } else {
                if ("B".equals( nota )) {
                    System.out.println( "Sua nota foi : B " );
                    break;

                } else if ("C".equals( nota )) {
                    System.out.println( "Sua nota foi :C " );
                    break;


                } else if ("D".equals( nota )) {
                    System.out.println( "Sua nota foi :D " );
                }
            }

        }

    }
}