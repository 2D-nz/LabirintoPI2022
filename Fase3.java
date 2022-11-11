package charadas;
import java.util.ArrayList;
import java.util.Scanner;

public class Fase3 {
	public static String funcao2_charada() {
		Scanner input = new Scanner (System.in);

		int charada, i = 0;
		String retorno = null;

		do {
			System.out.println("CHARADA\n\nO que o astronauta disse quando o chamaram?");
			System.out.println("\n1: Desculpe, estava no shopping!\n2: Desculpe, estava no mundo da Lua!\n3: Me deixa em paz!");  
			System.out.println("Alternativa:\n");
			charada = input.nextInt();

			if(charada == 2) {
				retorno = "Você sabia? A Lua é um satélite natural da Terra.\nAh, e se quiser avançar mais saiba que é melhor subir 2x\nSó não lembro se é pela esquerda ou direita...";
				i = 4;}
			else {
				i++;
				retorno = "Resposta errada. Você ainda tem " + (3-i) + " tentativas.";
				if (i == 3) {
					retorno = "Você perdeu!";
				}
			}

		}  while (i < 3);
		return retorno;
		
	}
	
    public static int main() {
        ArrayList<Integer> fase = new ArrayList<Integer>();
        fase.add(61);
        fase.add(62);
        fase.add(52);
        fase.add(53);
        fase.add(43);
        fase.add(44);
        fase.add(34);
        fase.add(35);
        fase.add(25);
        fase.add(15);
        fase.add(36);
        fase.add(46);
        fase.add(47);
        fase.add(57);
        fase.add(58);
        fase.add(68);
        int contParede = 0;
        Scanner input = new Scanner(System.in);
        int pos = 65;
        int nextPos = 1;
        while (pos != fase.get((fase.size() - 1))) {
            System.out.println("Para onde ir agora?");
            System.out.println("1 - Cima");
            System.out.println("2 - Direita");
            System.out.println("3 - Baixo");
            System.out.println("4 - Esquerda");
            nextPos = input.nextInt();

            switch(nextPos){
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
                    if (pos == fase.get(9)){
                        
                    	funcao2_charada();
                    }
                    if (pos == fase.get(7)){
                        System.out.println("Você encontrou um espelho na parede...");
                        System.out.println("Embaixo do espelho está escrito:");
                        System.out.println("Tudo que vai... volta...");
                    }

                    if (pos == fase.get(9)){
                        System.out.println("| X | X | X | X |   | X | X | X |");
                        System.out.println("| X | X | X | X |   | X | X | X |");
                        System.out.println("| X | X | X |   |   |   | X | X |");
                        System.out.println("| X | X |   |   | X |   |   | X |");
                        System.out.println("| X |   |   | X | X | X |   |   |");
                        System.out.println("|   |   | X | X | X | X | X |   |");
                    }
                } else if (i == (fase.size() - 1)) {
                    System.out.println("Você acertou uma parede");
                    contParede += 1;
                    if(contParede == 8){
                        return 0;
                    }
                }
            }
        }
        System.out.println("Parabéns, você passou de fase");
        return 4;

    }
}
