package org.senac.ListaExerciciosAula_2;

import java.util.Scanner;

//Escreva um programa para ler a quantidade de alunos existentes em uma turma. Depois disso, o programa deve ler as
// notas de cada um destes alunos, calcular e mostrar na tela a média aritmética destas notas. Utilize o laço WHILE.
public class Exercicio_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int qtdAluno, notas = 0, media, qtdProva,somador;
        String nome;

        System.out.println("Digite a quantidade de aluno:");
        qtdAluno = input.nextInt();
        System.out.println(" digitea quantidade de provas:");
        qtdProva = input.nextInt();

        for (int dados = 1; dados <= qtdAluno; dados++) {
            System.out.println("\t" + (dados + 0) + "º" + "Nome do aluno:");
            nome = input.next();
            for (int i = 1; i <= qtdProva; i++) {
                System.out.println("\t" + "Nota da " + (i + 0) + "º" + "prova:");
                notas = input.nextInt();


            }   somador = notas*qtdProva;
            media= somador / qtdProva;
            System.out.println("A media aritmédica do" + media );

        }
    }
}