/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode 
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas. Veja 
abaixo alguns exemplos.*/
package org.senac.ListaExerciciosAula_1;

import java.util.Scanner;

/**
 *
 * @author gda_a
 */
public class Exerc16 {

    private static String dura�aoJogo;
    private static double aoJogo;

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

          double horaInicial, horaFinal, dura�aoJogo;

        System.out.println("Duração do jogo");
        System.out.println("Digite a hora inicial: ");
        horaInicial = sc.nextDouble();
        System.out.println("Digite a hora final: ");
        horaFinal = sc.nextDouble();

         dura�aoJogo = 24 - (24 + horaInicial - horaFinal) % 24;
        if (horaInicial == horaFinal) {
            System.out.println("O JOGO DUROU 24 HORAS : ");
        } else {

            System.out.println("O JOGO DUROU %d HORAS\n: " + dura�aoJogo);
        }
    }
}
