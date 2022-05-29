package ListaDeExercicios_03;

import java.util.Scanner;

public class Exercicio_Arrays_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );

        System.out.println( "Tamanho: " );

        int t = sc.nextInt();

        int[] vetor = new int[t];

        for (int i = 0; i <vetor.length; i++) {
            System.out.printf( "vetor [%d]: \n", i );
            vetor[i] = sc.nextInt();
            System.out.println(" ");
        }

        for (int i = 0; i <vetor.length; i++) {
            if(vetor [i]%2 == 0)

                System.out.printf( "vetor [%d]: %d \n", i, vetor[i] );
        }

    }

}