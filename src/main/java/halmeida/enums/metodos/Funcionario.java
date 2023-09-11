package halmeida.enums.metodos;

public class Funcionario {

    private String nome;
    private Cargo cargo;
    private Double salario;

    public Funcionario(String nome, Cargo cargo, Double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public Double calculoReajusteSalarial() {
        return cargo.reajusteSalarial(salario);
    }
}
