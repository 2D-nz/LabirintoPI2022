import java.util.ArrayList;
import java.util.Scanner;

public class Fase1 {
    public static int main() {
        ArrayList<Integer> fase1 = new ArrayList<Integer>();
        fase1.add(31);
        fase1.add(32);
        fase1.add(22);
        fase1.add(23);
        fase1.add(13);
        int contParede = 0;
        Scanner input = new Scanner(System.in);
        int pos = 31;
        int nextPos = 1;
        while (pos != fase1.get((fase1.size() - 1))) {
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
                default:
                    System.out.println("Input inválido.");
                    break;
            }

            for (int i = 0; i < fase1.size(); i++) {
                if (nextPos == fase1.get(i)) {
                    System.out.println("Você andou com cuidado...");
                    System.out.println("--------------------------");
                    i = 50;
                    pos = nextPos;
                    if(pos == fase1.get(3)){
                        System.out.println("Mapa da fase:");
                        System.out.println(" X | X |   |");
                        System.out.println(" X |   | @ |");
                        System.out.println("   |   | X |");
                        System.out.println("Boa sorte!");
                        i=50;
                }



                } else if (i == (fase1.size() - 1)) {
                    System.out.println("Você acertou uma parede");
                    contParede += 1;
                    if(contParede == 3){
                        return 0;
                    }
                }
            }
        }
        System.out.println("Parabéns, você passou de fase");
        System.out.println("------------------------------");
        return 2;

    }
}
