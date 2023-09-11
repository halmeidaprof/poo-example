package halmeida.enums;

public enum Cargo {

    ANALISTA("Analista", 2000.0),
    PROGRAMADOR("Programador", 3000.0),
    DBA("Administrador de Banco de Dados", 3500.0);

    private String descricao;
    private Double salario;

    Cargo(String descricao, Double salario){
        this.descricao = descricao;
        this.salario = salario;
    }

    public Double getSalario() {
        return salario;
    }

    public String getDescricao() {
        return descricao;
    }
}
