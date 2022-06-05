/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.senac.ListaExerciciosAula_1;

import java.util.Scanner;

/**
 * a) a área do triângulo retângulo que tem A por base e C por altura. b) a área do círculo de raio C. (π = 3.14159) c) a área do trapézio que tem A e B por bases e C por altura. d) a área do quadrado que tem lado B. e) a área do retângulo que tem lados A e B. f) o perímetro do retângulo que tem lados A e B.
 *
 * @author gda_a
 */
public class Exerc06 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c, pi, raio;
        System.out.println("Informe valor de a: ");
        a = sc.nextDouble();
        System.out.println("Informe valor de b: ");
        b = sc.nextDouble();
        System.out.println("Informe o valor de c: ");
        c = sc.nextDouble();

        //a area do triangulo e retangulo que tem a por base e C por altura.
        double trianguloRetangulo = (a * c) / 2;
        System.out.println("Area do triangulo retangulo: " + trianguloRetangulo);

        // Area do circulo de raio C.
        pi = 3.14159;
        raio = c;
        double areaCirculo = pi * (raio * raio);
        System.out.println("Area do circulo : " + areaCirculo);

        //area do trapezio que tem a e b por base e c por altura
        double areaTrapezio = (a + b) * c / 2;
        System.out.println("Area do Trapezio: " + areaTrapezio);

        //area do quadrado que tem lado B
        double areaQuadrado = b * b;
        System.out.println("Areado Quadrado : " + areaQuadrado);

        // area do retangulo que tem lados A e B.
        double perimetroRetangulo = (a + b) * 2;
        System.out.println("Perimetro so retangulo: " + perimetroRetangulo);

    }
}
