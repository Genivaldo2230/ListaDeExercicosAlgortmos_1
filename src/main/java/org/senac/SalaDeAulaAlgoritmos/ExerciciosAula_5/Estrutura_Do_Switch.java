/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.sp.algor1.aulasalgoritimos_1.ExerciciosAula_5;

/**
 *
 * @author gda_a
 */
public class Estrutura_Do_Switch {

    public static void main(String[] args) {

        char grade = 'C';
        switch (grade) {
            case 'A':
                System.out.println("Excelente !!");
                break;
            case 'B':
            case 'C':
                System.out.println("Bem Feito!!!");
                break;
            case 'D':
                System.out.println("Você passou!!");
            case 'E':
                System.out.println("Melhor tentar novamente !");
                break;
            default:
                System.out.println("Conceito Invalido");
        }
    }
}