package halmeida.interfacepolimorfismo;

public class Funcionario {

    private String nome;
    private int idade;
    private String matricula;
    private Cargo cargo;

    public Funcionario(String nome, int idade, String matricula, Cargo cargo) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getIdade() {
        return idade;
    }

    public Cargo getCargo() {
        return cargo;
    }
}
