package org.senac.SalaDeAulaAlgoritmos.ExerciciosAula_6;
// data 10-05-2022 aula
import java.util.Scanner;
public class EncontraFuncoes {
    /**
     *  @author gda_a
     */
    public static class EncontraMenor {
        static int soma(int a, int b) {
            System.out.println("*--Soma--");
            return a + b;
        }
        static int menor(int a, int b) {
            System.out.println("*--Menor--*");
            if (a <= b)
                return a;
            else
                return b;
        }
        static int entradaDados() {
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite um número");
            int n = sc.nextInt();
            return n;
        }
        public static void main(String[] args) {

            int n1 = entradaDados();
            int n2 = entradaDados();
            int r = soma(n1, n2);
            int n = menor(n1, n2);
            System.out.println("resultado " + r);
            System.out.println("menor " + n);
        }
    }
}
