package org.senac.ListaExerciciosAula_3;
//Modificar a função do Exercício 5 da seguinte forma: além dos parâmetros de entrada reais a , b , c , um
//quarto parâmetro d deve ser adicionado.
//Esse parâmetro poderá ter dois valores: 1 ou 2.
//Ele será responsável para decidir se a saída da função vai ser a maior ou a menor raiz (no caso de raízes
//iguais, considere a maior raiz). Considere que 1 serve para obter a maior raiz e 2 para obter a menor raiz.
//Novamente, se não houver raízes reais, a função deve retornar o número −1.
import java.util.Scanner;

import static java.lang.Math.*;


public class Exercicio_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );

        int a, b, c;

        System.out.print("a : ");
        a = sc.nextInt();

        System.out.print("b : ");
        b = sc.nextInt();

        System.out.print("c : ");
        c = sc.nextInt();

        System.out.println();
        System.out.printf("%s\n", toString( a, b, c ));
    }

    public static double delta(int a, int b, int c) {
        return (pow(b, 2 ) - (4 * a * c));
    }
    public static String toString(int a, int b, int c){
        String result;

        double d;
        d = delta(a, b, c);

        result = String.format("Coeficientes {a; %d; b: %d; c: %d }\n", a, b, c) +
                String.format("Discriminante (delta): %.2f\n", d);
        if(d < 0)
           result = result + " nao exixtem resultados reais\n";

        if(d == 0){
            double x;
            x = -b /(2*a);
            result = result + String.format(" x' e x'' = %.2f\n", x);
        }
        if(d > 0){
            double x1, x2;
            x1 = (-b + sqrt( d )) / (2*a);
            x2 = (-b - sqrt( d )) / (2*a);
            result = result + String.format("x' = %.2f\n", x1)+
                              String.format("x' = %.2f\n", x2);
        }

        return (result);
    }

}

