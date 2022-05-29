package org.senac.ListaExerciciosAula_3;

import java.util.Scanner;

public class New {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite: ");
      int x = 0;
      int f = x;
      x = sc.nextInt();

        while(x > -1){
            f = f * x;
           x++;
        } System.out.println("SAIDA :" + f  );

       /* int N = 5;
        int resultado = 1;
        for (int i = 1; i <= N; i++) {
            resultado = resultado * N;
        }}*/


}
}