public class Player {
    //private String playerName;
    private Baralho deck = new Baralho();
    private int cardStacks = 0;
    
    
    /*
    Player(String newPlayer){
        this.playerName = newPlayer;
    }
    
    public void setPlayer(String name){
        this.playerName = name;
    }
    
    public String getPlayer(){
        return playerName;
    }
    */
    public Baralho getBaralho(){
        return this.deck;
    }
    public int getCardStacks(){
        return this.cardStacks;
    }
    public void winPoints(){
        cardStacks += 2;
    }
    
}
