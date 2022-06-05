package org.senac.SalaDeAulaAlgoritmos.ExerciciosAula_7;

import java.util.Scanner;

public class Exercicios_Vetor_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o Tamanho: ");
        int t = sc.nextInt();
        int[] v =new int[t];

        //polula o vetor V
        for(int i =0; i< v.length; i++){
            System.out.printf("Vetor[%d]: \n", i);
            v[i] =  sc.nextInt();
        }
        for(int i =0; i<v.length; i++){
            System.out.printf("Vetor[%d]: %d \n ", i, v[i]);
        }
        int soma =0;
        int maior = v[0];
        int menor = v[0];

        for(int i =0; i< v.length; i++){
            soma = soma + v[i];
            if(v[i]>maior){
                maior = v[i];
           }
            if(v[i]< menor){
              menor = v[i];

            }
        }
        for(int i=0; i< v.length; i++){
            System.out.print(" v [" + i +"]:"+ v[i]);
            if(v[i]== menor)
            System.out.print(" <-- menor");
            else if (v[i] == maior)
                System.out.print(" <--mior");
            System.out.println("");
        }
        System.out.println("Soma :" + soma);
    }
}
