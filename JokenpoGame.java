public class JokenpoGame{

    Player jogador1;
    Player jogador2;
    Player jogador3;

    private final int vencer = 3;

    public JokenpoGame (String name1, String name2, String name3){
        jogador1 = new Player(name1);
        jogador2 = new Player(name2);
        jogador3 = new Player(name3);
    }

    public boolean venceJokenpo(int a, int b){
        if(a==0 && b==1){
            return false;
        } else if(a==0 && b==2){
            return true;
        } else if(a==1 && b==0){
            return true;
        } else if(a==1 && b==2){
            return false;
        } else if(a==2 && b==0){
            return false;
        } else{
            return true;
        }
    }

    public void vencedores(Player p1, Player p2, Player p3){

        if (venceJokenpo(p1.jogada, p3.jogada)){
            p1.vitorias++;
            p2.vitorias++;
            System.out.println(p1.name + " e " + p2.name + " venceram a rodada!");
        } else {
            p3.vitorias++;
            System.out.println(p3.name + " venceu a rodada!");
        }
    } 

    public void ganhouRodada(){
        int jogada1 = jogador1.jogada;
        int jogada2 = jogador2.jogada;
        int jogada3 = jogador3.jogada;

        if (jogada1==jogada2 && jogada2==jogada3){
            System.out.println("Empate triplo");
        } else if (jogada1 != jogada2 && jogada2 != jogada3 && jogada1 != jogada3){
            System.out.println("Empate triplo");
        } else if (jogada1==jogada2){
            vencedores(jogador1, jogador2, jogador3);
        } else if (jogada1==jogada3){
            vencedores(jogador1, jogador3, jogador2);
        } else {
            vencedores(jogador3, jogador2, jogador1);
        }
        /*
        } else if ( jogada1==0 && jogada2==0 && jogada3==1){
            System.out.println("Jogador " + jogador3 + "venceu a rodada!");
            jogador3.vitorias++;
            System.out.println("Total vitorias:" + jogador3.vitorias);
        } else if (jogada1==0 && jogada2==0 && jogada3==2){
            System.out.println("Jogadores " + jogador1 "e "+ jogador2 + "venceram a rodada!");
            jogador1.vitorias++;
            jogador2.vitorias++;
            System.out.println("Total vitorias:" + jogador1.name +":"+ jogador1.vitorias + jogador2.name + ":" + jogador2.vitorias);
        } else if (jogada1==1 && jogador2 ==1 &&){

        }*/
    }

    public void jogo(){
        while(jogador1.vitorias!=vencer && jogador2.vitorias!=vencer && jogador3.vitorias!=vencer){
            jogador1.rodada();
            jogador2.rodada();
            jogador3.rodada();

            ganhouRodada();

            System.out.println("Placar Atual:" + jogador1.name +" - " + jogador1.vitorias + "|" + jogador2.name +" - " + jogador2.vitorias + "|" + jogador3.name + " - " + jogador3.vitorias);

            if (jogador1.vitorias == vencer){
                System.out.println("Jogador (a) " + jogador1.name + " venceu o Jokenpo!");
            } else if (jogador2.vitorias == vencer){
                System.out.println("Jogador (a) " + jogador2.name + " venceu o Jokenpo!");
            } else if (jogador3.vitorias == vencer){
                System.out.println("Jogador (a) " + jogador3.name + " venceu o Jokenpo!");
            }
        }
    }
}
