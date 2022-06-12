package org.senac.ListaExerciciosAula_4;

import java.util.Scanner;

public class Exercicio_08 {

    public static class Exercicio8 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Tamanho: ");
            int t = sc.nextInt();
            int num;
            int[] v = new int[t];
            for (int i = 0; i < v.length; i++) {
                System.out.printf("vetor [%d]: \n", i);
                v[i] = sc.nextInt();
            }
            System.out.println("Digite um valor para procurar no vetor");
            num = sc.nextInt();

            // leitura do vetor
            for (int i = 0; i < v.length; i++) {

                // se existir no vetor o número digitado
                if (v[i] == num) {
                    System.out.println("O índice do número digitado é " + i);
                    break;
                    // se não existir...
                } else if (i == v.length - 1) {
                    System.out.println("Número não encontrado no vetor");
                }
            }
        }
    }

}
