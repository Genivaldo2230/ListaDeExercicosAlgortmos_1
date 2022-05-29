package org.senac.ListaExerciciosAula_2;
//Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura
// de senha incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente
// deve ser impressa a mensagem "Acesso Permitido" e o algoritmo encerrado.
// Considere que a senha correta é o valor 2002. Utilize o laço que lhe for mais conveniente
//      user = "Senac";
//        pwd = 2002;
import java.util.Scanner;

public class Exercicio_19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String usuario, user;
        int senha, pwd;

        user = "senac";
        pwd = 2002;

        for (int i = 1; i <= 3; i++) {
            System.out.println("Usuario: ");
            usuario = sc.next();
            System.out.println("Senha: ");
            senha = sc.nextInt();

            if (usuario.equals(user) && senha == pwd) {
                System.out.println("Acesso Permitido : ");
                break;
            } else {
                System.out.println("Tente novamente? ");
                System.out.println(" Senha Invalida " + (3 - 1) + " chances ");
            }
        }
        System.out.println("Fim");

    }
}
