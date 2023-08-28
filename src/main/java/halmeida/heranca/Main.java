package halmeida.heranca;

public class Main {

    public static void main(String[] args) {
        Funcionario joao = new Funcionario("Joao", 20, "123J");

        // Herança de Pessoa
        String nome = joao.getNome();
        int idade = joao.getIdade();

        // Método de funcionario
        String matricula = joao.getMatricula();
    }
}
