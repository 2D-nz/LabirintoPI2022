/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author denis.lsilva9
 */

import java.io.*;
import java.lang.Thread;
import java.util.Scanner;
   
public class Main {
    
    public static void main(String[] args) {
        
        menu();
       
        
    }
     public static void menu(){
        
        System.out.println("LABIRINTO"); 
        System.out.println("1 - Jogar");
        System.out.println("2 - Instruções");
        System.out.println("3 - Créditos");
        System.out.println("4 - Sair");
        Scanner input = new Scanner(System.in);
        int option = input.nextInt();
        int i = 0;
        while (i != 10){
        switch(option){
            
            case 2:
                System.out.println("-----------------");
                System.out.println("Como jogar:");
                System.out.println("Serão sempre lhe dadas opções de para onde andar");
                System.out.println("Dependendo de sorte, você pode ter uma armadilha, ou charada");
                System.out.println("Charadas podem te dar dicas");
                System.out.println("Armadilhas podem te ajudar ou atrapalhar");
                System.out.println("Passa-se de fase, descobrindo o caminho até o final");
                System.out.println("Ganha-se o jogo, ao passar da última fase");
                System.out.println("-----------------");
                menu();
                
            case 3:
                System.out.println("-----------------");
                System.out.println("Feito por:");
                System.out.println("Lorena Mafra");
                System.out.println("Denis Silva");
                System.out.println("Robson Figueiredo");
                System.out.println("Simone Colaco");
                System.out.println("-----------------");
                menu();
                
            case 4:
                System.out.println("Fim do programa!");
                i = 10;
        }
        
        }
     }
}

