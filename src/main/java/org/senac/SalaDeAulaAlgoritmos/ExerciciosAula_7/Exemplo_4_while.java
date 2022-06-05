/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.senac.SalaDeAulaAlgoritmos.ExerciciosAula_7;

import java.util.Scanner;

/**
 *
 * @author genivaldo.aanjos
 */
public class Exemplo_4_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x, soma =0, i =0;
        
          while(true){ //ele e faço no teste
              
        //while(i <10){
            System.out.println("Número:");
            
            x = sc.nextInt();
            if(x<0){
                break;
            }
            soma += x;  //soma=soma+x;
            i++;
        }
        System.out.println("Total: "+ soma);
    }
    
    
}
