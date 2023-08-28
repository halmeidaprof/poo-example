package halmeida.herancaabstract;

public class Funcionario extends Pessoa {

    private String matricula;


    public Funcionario(String nome, int idade, String matricula) {
        super(nome, idade); // construtor da classe pai
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    String nomeWithIdade() {
        return "Nome: " + this.getNome() + ", idade: " + this.getIdade();
    }
}
