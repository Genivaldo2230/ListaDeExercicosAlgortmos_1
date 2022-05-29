package com.senac.sp.algor1.CodigoQueFizSozinhoEstudando;

import java.util.Scanner;

public class MediaAlunoEstud {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );

        String Nome = null;
        System.out.println( "Digite o nome do aluno " );
        Nome = sc.nextLine();

        System.out.println( "Digite A Notas do Alunos??" );

        float n1;
       // float n2;
       // float n3;
        float n4, media = 6;

        System.out.println( "Nota aluno 1" );
        n1 = sc.nextInt();
        //System.out.println( "Nota Aluno 2" );
       // n2 = sc.nextInt();
       // System.out.println( "Nota aluno 3" );
      //  n3 = sc.nextInt();
        System.out.println( "nota Aluno 4" );
        n4 = sc.nextInt();

        media = (n1 + /*n2 + n3 +*/ n4) / 2;

        if (media >= 6) {
        System.out.println( "APROVADO: \n"+ Nome+" Sua Média de nota é :" + media );
    }else if(media <= media)
        System.out.println( "REPROVADO: \n"+ Nome+" Sua Média de nota é :" + media  );


    }


}