package org.senac.ListaExerciciosAula_3;
//Fazer um programa que lê um número inteiro positivo N e imprime a divisão do produto dos n primeiros
//números positivos pela soma dos n primeiros números positivos.

//Em outras palavras, você deve dividir o fatorial pela somatoria do número. Obrigatório utilizar as
//funções elaboradas nos exercícios 2 e 3.
public class Exercicio_4 {
    public static void main (String args[]){

        double x = 69;
        double f = x;

        while (x > 1){
            f = f *(x-1);
            x--;
            System.out.println(f);
        }
    }
}
