package halmeida.classeandobjeto;

public class Pessoa {

    // atributos
    private String nome;
    private int idade;


    // construtores
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(int idade) {
        this.idade = idade;
    }

    public Pessoa() {
    }

    // métodos
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getNomeComIdade() {
        return "Meu nome é " + this.nome + ", tenho " + this.idade + " anos";
    }

}
