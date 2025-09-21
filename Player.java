import java.util.Random;

public class Player {

    String name;
    int jogada;
    int vitorias;
    //static é compartilhado p todoas intancias da classe Player
    //final não pode ser alterado o valor
    //private só é acessado dentro de Player
    private static final Random random = new Random();

    public Player(String name){
        this.name=name;
        //this.jogada=null;
        this.vitorias=0;
    }

   public void rodada(){
        this.jogada = random.nextInt(3);
        if (jogada == 0){
            System.out.println(name +": jogou Pedra");
        } else if (jogada == 1){
            System.out.println(name +": jogou Papel");
        } else{
            System.out.println(name +": jogou Tesoura");
        }
        //Scanner scanner = new Scanner(System.in);
        //String name = scanner.nextLine();
        //int jogada = scanner.nextInt();
    }
   
    public int ultimaJogada(){
        return jogada;
    }

    public void atualizarVitorias(){
        this.vitorias++;
        System.out.println(name + "venceu a rodada!" + vitorias + "Vitórias!" );
    }
}




