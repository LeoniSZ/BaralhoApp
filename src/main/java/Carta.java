
public class Carta {
    String nome;
    String naipe;
    int valor;
    //String coringa;
    
    Carta(){
        
    }
    Carta(String nome, String naipe, int valor){
        this.nome = nome;
        this.naipe = naipe;
        this.valor = valor;
    }

    public String getNome(){
        return nome;
    }
    
    public String getNaipe(){
        return naipe;
    }
    
    public int getValor(){
        return valor;
    }
}
