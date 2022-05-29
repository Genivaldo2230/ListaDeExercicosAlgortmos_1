/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.sp.algor1.ExerciciosAula_1;

import java.util.Scanner;

/**
 *
 * @author gda_a
 */
public class Entrada_de_dados_sc {
    public static void main(String[] args) {
        
Scanner entrada = new Scanner(System.in);

  System.out.println("Digite o primeiro valor");
            int nota1 = entrada.nextInt();

            System.out.println("Digite o valor");
            int nota2 = entrada.nextInt();

            System.out.println("Digite o valor");
            int nota3 = entrada.nextInt();

            System.out.println("Digite o valor");
            int nota4 = entrada.nextInt();

            int media = (nota1 + nota2 + nota3 + nota4) / 4;

            System.out.println("A nota media é:" + media);

    }
    
}
