/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package org.senac.SalaDeAulaAlgoritmos.ExerciciosAdos.ExerciciosAdo1;

import java.util.Scanner;

/**
 * @author gda_a
 */
public class Calcular_imc_Ado4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite Altura Mt 0,00 ?: ");
        float altura = sc.nextFloat();

        System.out.println("Digite seu Peso KL 0,00 ?:");
        float peso = sc.nextFloat();

        float imc = peso / (altura * altura);

        if (imc < 26) {
            System.out.println("Sua massa é " + imc + "e voce esta Normal");
        } else if (imc > 26 && imc < 30) {
            System.out.println("Sua massa é " + imc + "e voce esta Obeso");
        } else {
            System.out.println("Sua massa é " + imc + "e voce esta em Obesidade Morbida");
        }

    }
}