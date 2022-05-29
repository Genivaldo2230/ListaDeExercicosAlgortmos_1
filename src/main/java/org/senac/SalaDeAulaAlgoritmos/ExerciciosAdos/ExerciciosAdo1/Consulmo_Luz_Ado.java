/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.sp.algor1.ExerciciosAdos.ExerciciosAdo1;

import java.util.Scanner;

/**
 * @author gda_a
 */
public class Consulmo_Luz_Ado {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int kWh;
        float total = 0.00f;

        System.out.println("Digite o consumo em kWh atual: ");
        kWh = sc.nextInt();

        if (kWh <= 60) {

            total = (float) (kWh * 0.20);

            total = (float) (kWh * 0.20);
        } else if (kWh >= 150 && kWh < 500) {
            total = (float) (kWh * 0.25);
        } else {
            total = (float) (kWh * 0.30);

        }
        if (total <= 11.90) {
            total = (float) 11.90;
            System.out.println("Conta valor Minimo R$: " + total);

        }
        System.out.println("Valor da conta a pagar R$: " + total);
    }
}