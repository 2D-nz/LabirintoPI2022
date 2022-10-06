import java.sql.Array;


// 1 - Definir fase
// 2- Tornar interativo
// 3- Adc Charadas e Armadilhas

//

import java.sql.Array;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        move();

        
        
    }
    public static void move() {
        int[] positions = {31, 32, 22, 23, 21};
        int currentPosition = positions[0];
        
        
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
                boolean val = contains(positions, currentPosition);
                if(val == true){
                    System.out.println("foi");
                    
                } else {System.out.println("Não há caminho por aqui");
                    
                }
                
                
                

        }
    }
}
