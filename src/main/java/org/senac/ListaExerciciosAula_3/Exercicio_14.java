package org.senac.ListaExerciciosAula_3;

import java.util.Scanner;

//Faça uma função que receba dois números inteiros: um valor A e um valor N. Imprimir a soma dos N
//números a partir de A (inclusive). Se N for negativo ou ZERO, a função deve retornar -1.
//Exemplo: se A for 3 e N for 2, o resultado deverá ser 7, pois é a soma de 3 + 4.
//2
public class Exercicio_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        System.out.println( "Entre com numero : " );

        int a, n, soma = 0;
        a = sc.nextInt();
        System.out.println( "Numero entrada: " );
        n = sc.nextInt();
        System.out.println( "Numero entrada: " );
        soma = n + a;
        if (soma != n +a- 1) ;
        System.out.println( "Saida :" + soma );
    }
}
