import java.util.Scanner;
public class Main {

    public static void jogo(){
        Tutorial.main();
        System.out.println("Este foi o fim do tutorial! Boa sorte");
        System.out.println("--------------------------------------");
        //int faseIndex = Fase1.main();
        //execFase(faseIndex);
        int faseIndex = Fase2.main();
        execFase(faseIndex);
        //faseIndex = Fase3.main();
        //exeFase(faseIndex);



    }

    public static void gameOver (){
            System.out.println("----------------------");
            System.out.println("Game Over");
            System.exit(0);
        }


    public static void main(String[] args) {
        menu();
        jogo();



    }

    public static void execFase(int faseIndex){
        switch (faseIndex){
            case 2:
                Fase2.main();
                break;
            case 3:
                //Fase3.main();
                break;
            case 4:
                //Fase4.main;
                break;
            case 5:
                //Fase5.main();
                break;
            default:
                gameOver();
        }
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

                case 1:
                    i = 10;
                    break;

                case 2:
                    System.out.println("-----------------");
                    System.out.println("Como jogar:");
                    System.out.println("Serão sempre lhe dadas opções de para onde andar");
                    System.out.println("Dependendo de sorte, você pode ter uma armadilha, ou charada");
                    System.out.println("Charadas podem te dar dicas");
                    System.out.println("Passa-se de fase, descobrindo o caminho até o final");
                    System.out.println("Ganha-se o jogo, ao passar da última fase");
                    System.out.println("-----------------");
                    menu();

                case 3:
                    System.out.println("-----------------");
                    System.out.println("Feito por:");
                    System.out.println("Lorena Mafra");
                    System.out.println("Denis Silva");
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
