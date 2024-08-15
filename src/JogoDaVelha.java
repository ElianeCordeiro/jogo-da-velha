import java.util.Scanner;

public class JogoDaVelha {

    public static void main(String[] args) {

        Campo[][] tabuleiroVelha = new Campo[3][3];
        char simboloAtual='X';
        Boolean game = true;
        String vitoria="";
        Scanner scan = new Scanner(System.in);

        iniciarJogo(tabuleiroVelha);

        while(game){
            desenhaJogo(tabuleiroVelha);
            vitoria=verificaVitoria(tabuleiroVelha);

            if(!vitoria.equals("")){
                System.out.printf("Jogador %s venceu%n", vitoria);
                break;
            }

            try{
                if(verificarJogada(tabuleiroVelha, jogar(scan, simboloAtual), simboloAtual)){
                    if(simboloAtual == 'X'){
                        simboloAtual='O';
                    }else{
                        simboloAtual='X';
                    }
                }
            }catch (Exception e){
                System.out.printf("Erro");
            }
        }
        System.out.printf("Fim de jogo");
    }

    public static void desenhaJogo(Campo[][] tabuleiro){
        //limparTela();

        System.out.println(" 0      1     2");
        System.out.printf("0   %c | %c | %c %n", tabuleiro[0][0].getSimbolo(), tabuleiro[0][1].getSimbolo(), tabuleiro[0][2].getSimbolo());
        System.out.println("   -------------");
        System.out.printf("1   %c | %c | %c %n", tabuleiro[1][0].getSimbolo(), tabuleiro[1][1].getSimbolo(), tabuleiro[1][2].getSimbolo());
        System.out.println("   -------------");
        System.out.printf("3   %c | %c | %c %n", tabuleiro[2][0].getSimbolo(), tabuleiro[2][1].getSimbolo(), tabuleiro[2][2].getSimbolo());
    }

    public static void limparTela(){
        for(int cont=0; cont < 200; cont ++){
            System.out.println("");
        }
    }

    public static String verificaVitoria(Campo[][] tabuleiro){
        return "";
    }

    public static int[] jogar(Scanner scan, char simboloAtual){
        int jogada[] = new int[2];

        System.out.printf("%s %c%n", "Quem joga: ", simboloAtual);
        System.out.print("Informe a linha: ");
        jogada[0]=scan.nextInt();
        System.out.print("Informe a coluna: ");
        jogada[1]=scan.nextInt();

        return jogada;
    }

    public static Boolean verificarJogada(Campo[][] tabuleiro, int jogada[], char simboloAtual){
        if(tabuleiro[jogada[0]][jogada[1]].getSimbolo() == ' '){
            tabuleiro[jogada[0]][jogada[1]].setSimbolo(simboloAtual);
            return true;
        } else{
            return false;
        }
    }

    public static void iniciarJogo(Campo[][] tabuleiro){
        for(int linha=0; linha<3; linha++){
            for (int coluna=0; coluna<3; coluna++){
                tabuleiro[linha][coluna] = new Campo();
            }
        }
    }
}

