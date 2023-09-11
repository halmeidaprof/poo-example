package halmeida.enums;

public class Funcionario {

    private String nome;
    private Cargo cargo;

    public Funcionario(String nome, Cargo cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public Double salarioComReajuste() {
        return cargo.getSalario() * 0.02;
    }
}
