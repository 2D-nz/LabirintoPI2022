/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author denis.lsilva9
 */
package charadas;

import java.util.Scanner;

public class fase_charada {

	private static final String String = null;

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);

		String charada = null;
		int i = 0;

		do {
			System.out.println("O que é, o que é: É feito de água, mas se for colocado dentro da água morrerá.");
			System.out.println("Responda:\n");
			charada = input.next();
			charada = charada.toLowerCase();

			if(charada.equals("gelo") == true){
				System.out.println("Passou para a próxima fase!");
				i = 4;}
			else{
				i++;
				System.out.println("Resposta errada. Você ainda tem " + (3-i) + " tentativas");
				if (i == 3) {
					System.out.println("Você perdeu!");
				}
			} 
		} while (i < 3);
	} 
