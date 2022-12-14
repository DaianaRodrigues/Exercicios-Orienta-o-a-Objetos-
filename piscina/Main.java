package piscina;

public class Main {
    public static void main(String[] args) {
        Medidas piscina = new Medidas();
        Leitor leitor = new Leitor();

        piscina.comprimento = leitor.lerDouble("Digite o comprimento da piscina: ");
        piscina.largura = leitor.lerDouble("Digite a largura da piscina: ");
        piscina.profundidade = leitor.lerDouble("Digite a profundidade da piscina: ");

        System.out.printf("O volume da psicina é de: %.2f m³.", piscina.calcularVolume());

    }
}
