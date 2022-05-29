package org.senac.ListaExerciciosAula_3;
//9. Faça uma função que recebe a idade de uma pessoa em anos, meses e dia s e retorna essa idade
//expressa em dias .
import java.util.Scanner;

public class Exercicio_09 {
    public static void main(String[] args) {

        int anos, meses, dias;
        int idadeEmDias;
        Scanner sc = new Scanner( System.in );

        System.out.println("Dgite a idade em anos : ");
        anos =sc.nextInt();
        System.out.println("Dgite a idade em meses : ");
        meses =sc.nextInt();
        System.out.println("Dgite a idade em disa : ");
        dias =sc.nextInt();

        idadeEmDias = anos * 365 + meses * 30 +dias;
        System.out.println("Exercicio_09 em dias : "+ idadeEmDias);

    }
}
