public class Baralho {
    private Carta cartas[];
    private final int NCARTAS = 55;
    private int conta = 0;
   
    Baralho() {
        this.cartas = new Carta[56];
	String nomes[] = {"Às", "Dois", "Três", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove", "Dez", "Valete", "Dama", "Rei", "Coringa"};
	String naipes[] = {"Copas", "Espadas", "Paus", "Ouros"};
        int valores[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};
	int cont = 0;
	
	for(int j = 0; j < nomes.length; j++){
            for(int i = 0; i < naipes.length ; i++){
		cartas[cont] = new Carta(nomes[j], naipes[i], valores[j]);
		cont++;
            }
	}
    }
    
    public void embaralha(){
        int posicao1 = 0;
        int posicao2 = 0;
        Carta cartasaux;
        
        for(int j = 0; j < (NCARTAS - conta); j++){
            posicao1 = (int)(Math.random() * (NCARTAS - conta));
            posicao2 = (int)(Math.random() * (NCARTAS - conta));
            cartasaux = cartas[posicao1];
            cartas[posicao1] = cartas[posicao2];
            cartas[posicao2] = cartasaux;
        }
    }
    
    /*
    public void daCarta(){
        int i;
        for(i = 0; i < (NCARTAS - conta); i++){
            
        }
        System.out.println(cartas[i ].getNome() +" de "+ cartas[i ].getNaipe());
        cartas[i] = null;
        conta++;
    }*/
    
    
    public Carta daCartaReturnObject(){
        Carta retorno = new Carta();
        int i;
        
        
        this.conta++;
        
        for(i = 0; i <= (NCARTAS - this.conta); i++){   
        }
        
        retorno = cartas[i];
        cartas[i] = null;
        
        return retorno;
    }
    
    public int daCartaReturn(){
        int retorno;
        int i;
        
        
        this.conta++;
        
        for(i = 0; i <= (NCARTAS - this.conta); i++){   
        }
        
        
        System.out.println(cartas[i ].getNome() + " de " + cartas[i ].getNaipe() );
        
        
        retorno = cartas[i].getValor();
        cartas[i] = null;
        
        return retorno;
    }
    
    public void imprimeBaralho(){
        for(int i = 0; i < (NCARTAS); i++){
            if(cartas[i].getNome().equals("Coringa")){
                System.out.println(cartas[i].getNome());
            }
            else{
                System.out.println(cartas[i].getNome() + " de " + cartas[i].getNaipe());
            }
        }
    }
    
    public boolean temCarta(String nome, String naipe){
        
        for(int i = 0; i < (NCARTAS - conta); i++){
            //System.out.println(cartas[i].getNome() + " de " + cartas[i].getNaipe());
            //System.out.println(nome + " de " + naipe);
            if(cartas[i].getNome().equals(nome)){
                return true;
            }
            if(cartas[i].getNome().equals(nome) && nome.equals("Coringa")){
                return true;
            }
        }
        return false;
    }
    public boolean checkDeck(){
        return cartas[0] == null;
    }
}
 