package Exercicios_Aula_7_Array_vetor;
import java.util.Scanner;

/**
 * @author gda_a
 */
public class Exercicio_2_Vetor_17_5 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o Tamanho: ");

            int t = sc.nextInt();
            int[] v = new int[t];

            //popula o vetor v
            for (int i = 0; i < v.length; i++) {
                System.out.printf("vetor[%d]: \n", i);
                v[i] = sc.nextInt();
            }

            for (int i = 0; i < v.length; i++) {
                System.out.printf("vetor[%d]: \n", i, v[i]);

            }
            int soma = 0;
            int maior = v[0];
            int menor = v[0];
            for(int i = 0; i<v.length; i++){
                soma = soma + v [i];
                if(v[i]>maior){
                }
                if (v [i] < menor){
                    menor = v [i];
                }
            }
            for(int i = 0; i <v.length; i++){
                System.out.print("v [" + i+"]:\n" + v[i]);
                if (v[i] == menor)
                    System.out.println(" <-- menor");
                else if(v[i]==maior)
                    System.out.println("");
            }
            System.out.println(" Soma: " + soma);
        }

    }