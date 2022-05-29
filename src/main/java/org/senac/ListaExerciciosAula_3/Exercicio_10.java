package org.senac.ListaExerciciosAula_3;

import java.util.Scanner;

//Faça uma função que recebe a idade de um nadador por parâmetro e retorna , também por parâmetro, a
//categoria desse nadador (tipo String) de acordo com a tabela abaixo:Idade Categoria
//5 a 7 anos Infantil A
//8 a 10 anos Infantil B
//11-13 anos Juvenil A
//14-17 anos Juvenil B
//Maiores de 18 anos (inclusive) Adulto
public class Exercicio_10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );

        String nadador = new String();
        System.out.println( new StringBuilder().append( "Digite seu Nome:  " ).append( nadador ).toString() );
        nadador = sc.next();
        nadador.equals(nadador);

        int idade;
        System.out.println("Qual sua Idade: ");
        idade = sc.nextInt();

        while (idade >= 0) {
            if ((idade >= 0) && (idade <= 4)) {
                System.out.println( "Proibido a nadar na picina!!" + "Anos: " + idade );
                return;
            } else if ((idade >= 5) && (idade <= 7)) {
                System.out.println( "Nadador Classes (A) Infantil " + "Anos: " + idade );
                break;
            } else if ((idade >= 8) && (idade <= 10)) {
                System.out.println( "Nadador Classes ( B ) Infantil " + "Anos: " + idade );
                break;
            } else if ((idade >= 11) && (idade <= 13)) {
                System.out.println( "Nadador Classes (A) Juvenil " + "Anos: " + idade );
                break;
            } else if ((idade >= 14) && (idade <= 17)) {
                System.out.println( "Nadador Classes (B) Juvenil  " + "Anos: " + idade );
                break;
            } else if (idade >= 18) {
                System.out.println( "Nadador Classes Adultos " + "Anos:" + idade );
                break;

            }
        }

    }


}
