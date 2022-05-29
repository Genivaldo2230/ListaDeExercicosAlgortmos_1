package org.senac.ListaExerciciosAula_3;
//Faça uma função que recebe, por parâmetro, a altura (alt) e o sexo de uma pessoa, e retorna o seu peso
//ideal.
//Para homens, você calcular o peso ideal usando a fórmula: P = 72,7 * altura - 58.
//Para mulheres, utilize a fórmula: P = 62,1 * altura – 44,7.
import java.util.Scanner;

public class Exercicio_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double altura, pesoIdeal;
        String sexo;

        System.out.println("Calculo peso Ideal : ");
        System.out.println(" Informe sua altura : ");
        altura = sc.nextDouble();
        System.out.println("Informaseu sexo (M- Masculino; F- Feminino; ");
        sexo = sc.next();

        if (sexo.equals( "F" )) {
            pesoIdeal = 62.1*altura-44.17;// no codigo usar ( . )no numeros real na execução usar( , )
        }else{
            pesoIdeal = 72.7*altura-58;// no codigo usar( . ) no numeros real na execução usar ( , )
        }
        System.out.println("Seu peso ideal é de  " +pesoIdeal);
    }
}
