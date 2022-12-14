package NotasAlunos;

public class Main {
    public static void main(String[] args) {
        int qtdAlunos = 3;
        Leitor leitor = new Leitor();
        Aluno[] alunos = new Aluno[qtdAlunos];

        for(int i = 0; i < qtdAlunos; i++){
            Aluno aluno = new Aluno();
            aluno.nome = leitor.lerString("Digite o nome do aluno: ");
            aluno.notas[0] = leitor.lerDouble("Digite a nota 1 do aluno: ");
            aluno.notas[1] = leitor.lerDouble("Digite a nota 2 do aluno: ");
            aluno.notas[2] = leitor.lerDouble("Digite a nota 3 do aluno: ");
            alunos[i] = aluno;
        }

        for(Aluno aluno : alunos){
            System.out.printf("%s, teve a média final %.2f.\n", aluno.nome, aluno.calcularMedia());
        }
    }
}
