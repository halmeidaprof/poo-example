package halmeida.classeandobjeto;

public class Main {

    public static void main(String[] args) {
        // instancia com construtor vazio
        Pessoa pessoaVazio = new Pessoa();

        // instancia construtor com os dois parametros
        Pessoa pessoaCompleta = new Pessoa("Manuel", 20);

        // instancia construtor com nome
        Pessoa pessoaNome = new Pessoa("Manuel");

        // instancia construtor com idade
        Pessoa pessoaIdade = new Pessoa(20);


        // métodos
        String nomeComIdade = pessoaCompleta.getNomeComIdade();

        String nome = pessoaCompleta.getNome();

        int idade = pessoaIdade.getIdade();
    }
}
