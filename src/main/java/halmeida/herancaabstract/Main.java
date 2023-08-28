package halmeida.herancaabstract;

public class Main {

    public static void main(String[] args) {
        Funcionario joao = new Funcionario("Joao", 22, "123J");

        String nome = joao.getNome();
        int idade = joao.getIdade();
        String matricula = joao.getMatricula();
        String texto = joao.nomeWithIdade();
    }
}
