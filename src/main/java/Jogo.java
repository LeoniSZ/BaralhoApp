
public class Jogo {
    //private String name1, name2;
    private Player player1 = new Player();
    private Player player2 = new Player();
    private Carta currentCard1 = new Carta();
    private Carta currentCard2 = new Carta();
    private boolean endGame = false;
    private int drawCounter = 0;

    public boolean getEnd(){
        return endGame;
    }
    
    // startGame -> inicia o jogo embaralhando 2 vezes o baralho de cada jogador
    public void startGame(){
        player1.getBaralho().embaralha();
        player1.getBaralho().embaralha();
        player2.getBaralho().embaralha();
        player2.getBaralho().embaralha();
    }
    
    //play -> puxa uma carta do baralho e mostra
    public void play(){
        
        //salva a carta puxada do baralho na variavel currentCard
        currentCard1 = player1.getBaralho().daCartaReturnObject();
        currentCard2 = player2.getBaralho().daCartaReturnObject();
        
        //imprime a carta puxada do baralho
        System.out.println("[Player 1] = " + currentCard1.getNome() + " de " + currentCard1.getNaipe());
        System.out.println("[Player 2] = " + currentCard2.getNome() + " de " + currentCard2.getNaipe());
    }
    
    public void matchRound(){
        
        //faz os testes para saber qual carta é maior
        
        if(currentCard1.getValor() > currentCard2.getValor()){
            System.out.println("Player 1 won this match!");
            //ao final de cada vitoria é chamado o metodo winPoint, que acumula 2 cartas, tanto a sua quanto a do adversário, como pontos.
            player1.winPoints();
            
            //CardStacks é o acumulo de cartas, ou seja, pontos
            System.out.println("Player 1 have: " + player1.getCardStacks() + " points!");
            System.out.println();
        }
        else{
            if(currentCard1.getValor() < currentCard2.getValor()){
            System.out.println("Player 2 won this match!");
            
            player2.winPoints();
            System.out.println("Player 2 have: " + player1.getCardStacks() + " points!");
            System.out.println();
            }
            else{
                if(currentCard1.getValor() == currentCard2.getValor()){
                    System.out.println("Draw match! No one won :(");
                    this.drawCounter += 2;
                    //casa haja um empate a variavel drawCounter (contador de empate) é acrescentada 2 cartas, ou seja, 2 pontos
                    System.out.println("Cards out of the game: " + this.drawCounter);
                    System.out.println();
                }
            }
        }
        
        
        //verifica se o deck está vazio. Caso esteja quer dizer que o jogo acabou, caso não esteja o jogo continua.
        if(player1.getBaralho().checkDeck()){
            System.out.println("Player 1 have: " + player1.getCardStacks() + " points!");
            System.out.println("Player 2 have: " + player2.getCardStacks() + " points!");
            System.out.println("Cards out of the game: " + this.drawCounter);
            if(player1.getCardStacks() > player2.getCardStacks()){
                System.out.println("Player 1 won the game with an amount of " + player1.getCardStacks() + " cards! Congratulation!");
            }
            else{
                if(player1.getCardStacks() < player2.getCardStacks()){
                    System.out.println("Player 2 won the game with an amount of " + player2.getCardStacks() + " cards! Congratulation!");
                }
                else{
                    if(player1.getCardStacks() == player2.getCardStacks()){
                        System.out.println("Draw! Player 1 and Player 2 ended the game with the same amount of cards! (o-o)");
                    }
                }
            }
            endGame = true;
        }
        
    }
    
    
}
