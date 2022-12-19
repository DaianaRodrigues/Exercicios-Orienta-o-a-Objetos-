public class Carta {
   private String nomes;
    private String naipe;

    public Carta(String nomes, String naipe){
        this.naipe = naipe;
        this.nomes = nomes;
    }

    public String toString(){
        return String.format("%s de %s", nomes, naipe);
    }
}
