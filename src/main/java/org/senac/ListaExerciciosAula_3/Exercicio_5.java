package org.senac.ListaExerciciosAula_3;
import java.util.Scanner;
//Fazer uma função que tem como parâmetros de entrada três números reais a , b , c e fornece como saída a
//maior raiz da equação do 2º grau:
//ax2 + bx + c
//Nesta questão, você deverá utilizar a fórmula de Báskara . Se não houver raízes reais, a função deve
//retornar o número −1.
public class Exercicio_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );

        int a, b, c;

        System.out.print("a : ");
        a = sc.nextInt();

        System.out.print("b : ");
        b = sc.nextInt();

        System.out.print("c : ");
        c = sc.nextInt();

        double delta;
        delta = Math.pow(b, 2) - (4 * a * c);

        if(delta < 0)
            System.out.println("Não exitem resultado  reais ");
        if(delta == 0){
            double x;
            x = -b / (2 * a);
            System.out.printf(" x' e x'' = %.2f\n", x);
    }
        if(delta > 0){
            double x1, x2;
            x1 = -b / (2 * a);
            x2 = -b / (2 * a);
        System.out.printf(" x' = %.2f\n", x1);
        System.out.printf(" x' = %.2f\n", x2);
        }


}
}
