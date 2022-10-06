import java.sql.Array;


// 1 - Definir fase
// 2- Tornar interativo
// 3- Adc Charadas e Armadilhas

//

import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] positions = new int[]{31, 32, 22, 23, 21};
        int currentPosition = positions[0];
        move();


    }
    public static void move() {

        Scanner input = new Scanner(System.in);
        System.out.println("Para onde agora?");
        System.out.println("1 - Cima");
        System.out.println("2 - Direita");
        System.out.println("3 - Baixo");
        System.out.println("4 - Esquerda");

        int nextPosition = input.nextInt();

        switch (nextPosition) {
            case 1:
                nextPosition = currentPosition + 10;
                boolean test = Array.asList(positions).contains(nextPosition);
                System.out.println(test);

        }
    }
}
