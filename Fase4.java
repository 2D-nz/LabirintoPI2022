package charadas;
import java.util.ArrayList;
import java.util.Scanner;

public class Fase4 {
	public static String funcao3_charada() {

		Scanner input = new Scanner (System.in);
		String charada = null;
		int i = 0;
		String retorno = null;

		do {
			System.out.println("CHARADA\n\nTe pertence, mas outras pessoas usam mais que você.");
			System.out.println("Responda:\n");
			charada = input.next();
			charada = charada.toLowerCase();

			if (charada.equals("nome") == true || charada.equals("meu nome") == true) {
				retorno = "Gosto do seu nome, e só por isso vou te ajudar: reto toda a vida!";
				i = 4;} 
			else {
				i++;
				retorno = "Resposta errada. Você ainda tem " + (3-i) + " tentativas.";
				if (i == 3) {
					retorno = "Você perdeu!";
				}
			}
		} while (i < 3);
		return retorno;}
	
    public static int main() {
        ArrayList<Integer> fase = new ArrayList<Integer>();
        fase.add(11);
        fase.add(12);
        fase.add(21);
        fase.add(22);
        fase.add(31);
        fase.add(32);
        fase.add(41);
        fase.add(42);
        fase.add(51);
        fase.add(52);
        fase.add(43);
        fase.add(44);
        fase.add(45);
        fase.add(46);
        fase.add(47);
        fase.add(48);
        int contParede = 0;
        Scanner input = new Scanner(System.in);
        int pos = 11;
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
                    if (pos == fase.get(8)){
                        
                    	funcao3_charada();
                    }

                    if (pos == fase.get(9)){
                        System.out.println("|  |  | X | X | X | X | X |");
                        System.out.println("|  |  | X | X | X | X | X |");
                        System.out.println("|  |  | X | X | X | X | X |");
                        System.out.println("|  |  |   |   |   |   |   |");
                        System.out.println("|  |  | X | X | X | X | X |");
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
        return 5;

    }
}
