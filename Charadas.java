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
/*regras função: sempre fora do main (porque dentro do main a função fará parte do programa principal,
 *  estando fora só inicia quando for chamada) 
 * inicia com public static void 
 * 
 */
public class fase_charada {

	private static final String String = null;

	public static void main(String[] args) {
		funcao1_charada();
		funcao2_charada();
		funcao3_charada();

	} 
	public static void funcao1_charada() {
		Scanner input = new Scanner (System.in);

		String charada = null;
		int i = 0;

		do {
			System.out.println("CHARADA\nO que é, o que é?\nÉ feito de água, mas se for colocado dentro da água morrerá.");
			System.out.println("Responda:\n");
			charada = input.next();
			charada = charada.toLowerCase();

			if(charada.equals("gelo") == true){
				System.out.println("Será que existe água por aqui? Enfim...\nParabéns! Você passou para a próxima fase!");
				i = 4;}
			else{
				i++;
				System.out.println("Resposta errada. Você ainda tem " + (3-i) + " tentativas.");
				if (i == 3) {
					System.out.println("Você perdeu!");
				}
			} 
		} while (i < 3);
		System.out.println("______________________________________________________________________________");
	}
	public static void funcao2_charada() {
		Scanner input = new Scanner (System.in);

		int charada;
		int i = 0;

		do {
			System.out.println("CHARADA\nO que o astronauta disse quando o chamaram?");
			System.out.println("\n\n1: Desculpe, estava no shopping! \n2: Desculpe, estava no mundo da Lua! \n3: Me deixa em paz!");  
			charada = input.nextInt();

			if(charada == 2) {
				System.out.println("Você sabia? A Lua é um satélite natural da Terra.\nAh é, e você também passou para a próxima fase!");
				i = 4;}
			else {
				i++;
				System.out.println("Resposta errada. Você ainda tem " + (3-i) + " tentativas.");
				if (i == 3) {
					System.out.println("Você perdeu!");
				}
			}

		}  while (i < 3);
		System.out.println("______________________________________________________________________________");
	} 
	public static void funcao3_charada() {

		Scanner input = new Scanner (System.in);
		String charada = null;
		int i = 0;

		do {
			System.out.println("CHARADA\nPertence a você, mas outras pessoas usam mais.");
			charada = input.next();

			if (charada.equals("nome") == true || charada.equals("meu nome") == true) {
				System.out.println("Gosto do seu nome, e gosto de pessoas espertas.\nÉ isso mesmo: você passou para a próxima fase!");
				i= 4;} 
			else {
				i++;
				System.out.println("Resposta errada. Você ainda tem " + (3-i) + " tentativas.");
				if (i == 3) {
					System.out.println("Você perdeu!");
				}
			}
		} while ( i < 3);
	}
}

