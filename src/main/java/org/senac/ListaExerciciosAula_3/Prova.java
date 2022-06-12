package org.senac.ListaExerciciosAula_3;

public class Prova {
    public static int[] main(String[] args) {
         int[] f1;
       int[] v = new int[0];
            int[] vetor = new int[3];
            int s = 0;
            int x = v[0];
            int y = v[0];
            for(int i=0; i<v.length; i++){
                s += v[i];
                if(v[i] < x){
                    x = v[i];
                }
                if(v[i] > y){
                    y = v[i];
                }
            }

            vetor[0] = x;
            vetor[1] = y;
            vetor[2] = s;

            return vetor;
        }
    }

