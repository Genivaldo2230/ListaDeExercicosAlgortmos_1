package org.senac.ListaExerciciosAula_3;
//Faça uma função que recebe por parâmetro um valor inteiro e positivo e retorna Verdadeiro caso o valor
//seja primo, e Falso , caso contrário. Para isso, você terá que usar o tipo de retorno boolean .
import java.util.Scanner;

public class Exercicio_08 {
    public static int main(String[] args ) {
        Scanner scanner = new Scanner( System.in );

        System.out.println("Digite Entrada ");
        int Primo;
        int numero = 0;
        int p = 1;
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                p = 0;
            }
        }
        return p;
    }

    int main() {
        Scanner sc = new Scanner( System.in );
        int Num, Resultado;
        System.out.printf( "Digite um numero:" );
        Num = sc.nextInt();

        Resultado = Primo( Num );

        System.out.printf("%d\n",Resultado);

        if (Resultado == 1) {
            System.out.printf( "Numero primo.\n" );
            int primo;
        } else {
            System.out.printf( "Numero nao e primo.\n" );
            int primo;
        }

        return 0;
        }
        private int Primo(int num) {
        return num;
    }
}