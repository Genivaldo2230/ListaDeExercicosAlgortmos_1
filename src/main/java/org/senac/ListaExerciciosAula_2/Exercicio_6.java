/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.senac.ListaExerciciosAula_2;

import java.util.Scanner;

/**
 *
 * @author gda_a
 */
public class Exercicio_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade = 0, x = 0, maior = 0, ordem = 0;
        String nome = null;
        String nomeF = null;
        char sexo = 0;
        char sexoF = 0;
        do {
            x++;
            if (idade <= maior) {

                ordem = ordem + 1;
                System.out.println(ordem + " - Digite o Nome do Aluno : ");
                nome = sc.next();
                System.out.println("Digite a Idade do Aluno : ");
                idade = sc.nextInt();
                System.out.println("Informe o sexo \nF - Feminino \nM - Masculino ");
                sexo = sc.next().charAt(0);
                maior = idade;
                nomeF = nome;
                sexoF = sexo;
            }
        } while (x < 5);
        System.out.println("O aluno mais velho é este abaixo!!!");
        System.out.println(nomeF);
        System.out.println(maior + " anos de idade");
        System.out.println("Sexo : " + sexoF);

    }
}