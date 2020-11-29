
public class Run {

    public static void main(String[] args) {
        Jogo jogo = new Jogo();
        
        
        jogo.startGame();
        while(jogo.getEnd() == false){
            jogo.play();
            jogo.matchRound();
        }
    }
    
}
