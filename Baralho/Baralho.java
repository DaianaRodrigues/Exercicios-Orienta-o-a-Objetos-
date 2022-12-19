import java.util.Random;

public class Baralho {
    private final String[] nomes = {"Ás", "Valete", "Dama", "Rei", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    private final String[] naipe = {"Espadas", "Ouros", "Paus", "Copas"};
    private final int qtd = 52;
    private final Carta[] cartas = new Carta[qtd];
    private final Random random = new Random();
    public Baralho(){
        int i = 0;

        for(String rank : nomes){
            for(String naipes : naipe){
                Carta carta = new Carta(rank, naipes);
                cartas[i] = carta;
                i++;
            }
        }
    }
    public Carta sortear(){
        int numero = random.nextInt(0, qtd);

        return  cartas[numero];
    }
}
