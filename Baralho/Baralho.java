import java.util.Random;

public class Baralho {
    String[] nomes = {"Ás", "Valete", "Dama", "Rei", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    String[] naipe = {"Espadas", "Ouros", "Paus", "Copas"};

        Random random = new Random();
        int i = random.nextInt(nomes.length);
        String sorteio = nomes[i];

        int j = random.nextInt(naipe.length);
        String soteio2 = naipe[j];
}
