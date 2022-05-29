/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.sp.algor1.aulasalgoritimos_1.ExerciciosAula_1;

import java.util.Scanner;

/**
 *aula data-05-04-2022
 * @author gda_a
 */
public class SistemadeDecisao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        float n1, n2;
        int faltas;
        System.out.println("Informe o valor da primeira nota:");
        n1 = sc.nextInt();
        System.out.println("Informa o valor da segunda nota:");
        n2 = sc.nextInt();
        
        System.out.println("Informe a Quantidade de faltas:");
        faltas = sc.nextInt();
        
        //calcular media
        float media = (n1+n2)/2;
        
        if(media>=6 && faltas<=18){
            System.out.println("Aprovado");
        }else if(18<=faltas){
            System.out.println("Reprovado");
        }
        else if (faltas<18){
            System.out.println("Realizar exame (prova substitutiva)");
            System.out.println("Digite o valor da prova substitutiva");
            float sub = sc.nextFloat();
            // calculo da media com a subtitutiva
        float mSub = (media+sub)/2;
        if(mSub>=6){
            System.out.println("Aprovado");
            
        }else{
            System.out.println("Reprovado");
        }
        }
        
    }
    
}
