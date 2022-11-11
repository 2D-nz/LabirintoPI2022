package charadas;
import java.util.ArrayList;
import java.util.Scanner;

public class Fase5 {
	public static String funcao4_charada() {

		Scanner input = new Scanner (System.in);

		int charada, i = 0;
		String retorno = null;

		System.out.println("CHARADA\n\nO que é, o que é?\nOcorre uma vez a cada minuto, duas vezes a cada momento, mas jamais a cada quinhentos anos.");
		System.out.println("\n1. Letra M\n2. A vida\n3. Estrela cadente");
		System.out.println("Alternativa:\n");
		charada = input.nextInt();

		do {
			if(charada == 1) {
				retorno = "Estudos comprovam: o tempo realmente passa mais devagar fora da Terra.\nSe aceitar um conselho: vai reto, mas saiba que é melhor virar à direita.";
				i = 4;}
			else {
				i++;
				retorno = "Resposta errada. Você ainda tem " + (3-i) + " tentativas.";
				if (i == 3) {
					retorno = "Você perdeu!";
				}
			}
		} while(i < 3);
		return retorno;
	}
	
    public static int main() {
        ArrayList<Integer> fase = new ArrayList<Integer>();
        fase.add(23);
        fase.add(12);
        fase.add(21);
        fase.add(22);
        fase.add(31);
        fase.add(33);
        fase.add(41);
        fase.add(42);
        fase.add(43);
        fase.add(53);
        fase.add(14);
        fase.add(15);
        fase.add(16);
        fase.add(17);
        fase.add(18);
        fase.add(54);
        fase.add(55);
        fase.add(56);
        fase.add(57);
        int contParede = 0;
        Scanner input = new Scanner(System.in);
        int pos = 23;
        int nextPos = 1;
        while (pos != fase.get((fase.size() - 1))) {
            System.out.println("Para onde ir agora?");
            System.out.println("1 - Cima");
            System.out.println("2 - Direita");
            System.out.println("3 - Baixo");
            System.out.println("4 - Esquerda");
            nextPos = input.nextInt();

            switch (nextPos) {
                case 1:
                    nextPos = pos - 10;
                    break;
                case 2:
                    nextPos = pos + 01;
                    break;
                case 3:
                    nextPos = pos + 10;
                    break;
                case 4:
                    nextPos = pos - 01;
                    break;
            }

            for (int i = 0; i < fase.size(); i++) {
                if (nextPos == fase.get(i)) {
                    System.out.println("Você andou com cuidado...");
                    System.out.println("--------------------------");
                    i = 50;
                    pos = nextPos;
                    if (pos == fase.get(17)) {
                        ;
                        
                        funcao4_charada();
                        
                    }

                    if (pos == fase.get(1)) {
                        System.out.println("| X |   | X |   |   |   |   |   |   |   |");
                        System.out.println("|   |   |   |   | X | X | X | X | X | X |");
                        System.out.println("|   | X |   | X | X | X | X | X | X | X |");
                        System.out.println("|   |   |   | X | X | X | X | X | X | X |");
                        System.out.println("| X | X |   |   |   |   | X | X | X | X |");

                    }

                } else if (i == (fase.size() - 1)) {
                    System.out.println("Você acertou uma parede");
                    contParede += 1;
                    if (contParede == 8) {
                        return 0;
                    }
                }
            }
        }
        System.out.println("Parabéns, você passou de fase");
        return 1;

    }
}
