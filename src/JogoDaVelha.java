import java.util.Scanner;

public class JogoDaVelha {

    public static void main(String[] args) {

        Campo[][] tabuleiroVelha = new Campo[3][3];
        char simboloAtual='X';
        Boolean game = true;
        String vitoria="";
        Scanner scan = new Scanner(System.in);


        while(game){

        }
    }

    public static void desenhaJogo(Campo[][] tabuleiro){
        //limparTela();

        System.out.println(" 0 1 2");
        System.out.printf("0   %c | %c | %c %n", tabuleiro[0][0].getSimbolo(), tabuleiro[0][1].getSimbolo(), tabuleiro[0][2].getSimbolo());
        System.out.println("     -------------");
        System.out.printf("0   %c | %c | %c %n", tabuleiro[1][0].getSimbolo(), tabuleiro[1][1].getSimbolo(), tabuleiro[1][2].getSimbolo());
        System.out.println("     -------------");
        System.out.printf("0   %c | %c | %c %n", tabuleiro[2][0].getSimbolo(), tabuleiro[2][1].getSimbolo(), tabuleiro[2][2].getSimbolo());
    }
}
