package ExerciciosAula_8_Funcoes;

//Exercicio em aula 24/05/2022

import java.util.Scanner;

//funçoes e vetores 24/05/2022 aula 08
public class Exercicio_1_funcoes_24_5 {

    static int tamanhoVetor() {
        Scanner sc = new Scanner( System.in );
        System.out.println( "Tamanho " );
        int t = sc.nextInt();
        return t;
    }

    static int[] criarVetor(int t) {
        Scanner sc = new Scanner( System.in );
        //intanciando vetor V como tamanho t
        int[] v = new int[t];
        for (int i = 0; i < t; i++) {
            System.out.printf( "vetor[%d]: ", i + 1 );
            v[i] = sc.nextInt();

        }
        return v;
    }

    static void imprimirDadosVetor(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.printf( "vetor[%d]: \n", i, v[i] );
        }
    }

    //escreva uma função que receba um vetor
    //o maior elemento
    static int encontraMaior(int[] v) {
        int maior = v[0];
        for (int i = 0; i < v.length; i++) {
            if (v[i] >= maior) {
                maior = v[i];
            }
        }
        return maior;
    }

    //ESCREVA UMA FUNÇÃO QUE RECEBA UM VETORE
    //RETORNE UM NOVO VETOR COM OS NÚMERO
    static void obterPares(int[] v) {
        int cont = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] % 2 == 0) {
                cont++;
            }
        }
        int[] novoVetor = new int[cont];
        cont = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] % 2 == 0) {
                novoVetor[cont] = v[i];
                cont++;
            }
        }
    }

    public static void main(String[] args) {
        int t = tamanhoVetor();
        int[] v = criarVetor( t );
        imprimirDadosVetor( v );

    }

}
