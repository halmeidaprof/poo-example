package halmeida.coesao;

public class Funcionario {

    private String nome;
    private String cpf;


    // não faz muito sentido ter um método na classe de funcionario que formate o CPF
    // seria melhor utilizar classe específica
    public void formatarCpf() {
        // lógica de formatação
    }

    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}
