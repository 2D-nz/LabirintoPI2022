import java.util.ArrayList;
import java.util.Scanner;

public class Fase2 {
    public static int main() {
        ArrayList<Integer> fase = new ArrayList<Integer>();
        fase.add(51);
        fase.add(52);
        fase.add(53);
        fase.add(54);
        fase.add(55);
        fase.add(43);
        fase.add(33);
        fase.add(23);
        fase.add(22);
        fase.add(24);
        fase.add(25);
        fase.add(21);
        fase.add(11);
        int contParede = 0;
        Scanner input = new Scanner(System.in);
        int pos = 51;
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
                    if (pos == fase.get(10)){
                        public static void funcao1_charada() {
		Scanner input = new Scanner (System.in);

		String charada = null;
		int i = 0;

		do {
			System.out.println("CHARADA\n\nO que é, o que é?\nÉ feito de água, mas se for colocado dentro da água morrerá.");
			System.out.println("Responda:\n");
			charada = input.next();
			charada = charada.toLowerCase();

			if(charada.equals("gelo") == true){
				System.out.println("Será que existe água por aqui? Enfim...\nSó sei que do lad esquerdo tem uma chaminé!");
				i = 4;}
			else{
				i++;
				System.out.println("Resposta errada. Você ainda tem " + (3-i) + " tentativas.");
				if (i == 3) {
					System.out.println("Você perdeu!");
				}
			} 
		} while (i < 3);
                    }
                    if(pos==fase.get(4)){
                        System.out.println("|   | X | X | X | X |");
                        System.out.println("|   |   |   |   |   |");
                        System.out.println("| X | X |   | X | X |");
                        System.out.println("| X | X |   | X | X |");
                        System.out.println("|   |   |   |   | @ |");

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
        System.out.println("------------------------------");
        return 3;

    }
}
