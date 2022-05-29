package org.senac.ListaExerciciosAula_4;

public class Exercicio_2 {
    public static void main(String[] args) {

        int i ;
        int o = 0;
        int[] numA = new int[6];
        int[] numB = new int[5];

        for (i = 0; i < numA.length; i++) {
            int soma;
            soma = numB[o] + numA[i];
        }

       for (o = 0; o < numB.length; o++) {
            System.out.println(numA[i] + numB[o]);
           // System.out.println(numB[o]);
        }
    }
}
