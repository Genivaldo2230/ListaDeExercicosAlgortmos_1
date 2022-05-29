package org.senac.ListaExerciciosAula_3;
//Fazer uma função que tem como parâmetro de entrada três números inteiros a, b, c e devolve (retorna)
//menor dentre os três números.
import java.util.Scanner;

//Fazer uma função que tem como parâmetro de entrada três números inteiros a, b, c e devolve (retorna)
//menor dentre os três números.
public class Exercicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        System.out.println( "Digte os numero : " );
        int x = 0, y = 0, z = 0;
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        int menor, maior;
        if (x > y) {
            maior = x;
        } else {
            maior = y;
        }
        if (z > maior) {
            maior = z;
        }
        if (x < y) {
            menor = x;
        } else {
            menor = y;
        }
        if (z < menor) {
            menor = z;

        }

        System.out.println( "Esse numero Menor : " + menor );
    }
}

