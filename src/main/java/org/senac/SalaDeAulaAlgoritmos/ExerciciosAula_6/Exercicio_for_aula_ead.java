/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.senac.SalaDeAulaAlgoritmos.ExerciciosAula_6;

import java.util.Scanner;

/**
 *
 * @author gda_a
 */
public class Exercicio_for_aula_ead {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String usuario, user;
        int senha, pwd;

        user = "Teste123";
        pwd = 2002;

        for (int i = 1; i <= 3; i++) {
            System.out.println("Usuario: ");
            usuario = sc.next();
            System.out.println("Senha: ");
            senha = sc.nextInt();

            if (usuario.equals(user) && senha == pwd) {
                System.out.println("Acesso Permitido : ");
                break;
            } else {
                System.out.println("Tente novamente? ");
                System.out.println(" Senha Invalida " + (3 - 1) + " chances ");
            }
        }
        System.out.println("Fim");

    }

}