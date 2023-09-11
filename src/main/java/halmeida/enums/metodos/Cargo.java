package halmeida.enums.metodos;

public enum Cargo {

    ANALISTA("Analista", 0.02) {
        @Override
        Double reajusteSalarial(Double salario) {
            return salario * getPercentual();
        }
    },
    PROGRAMADOR("Programador", 0.03) {
        @Override
        Double reajusteSalarial(Double salario) {
            return salario * getPercentual() + 300.0;
        }
    },
    DBA("Administrador de Banco de Dados", 0.05) {
        @Override
        Double reajusteSalarial(Double salario) {
            return salario * getPercentual() + 90.0;
        }
    };

    private String descricao;
    private Double percentual;

    Cargo(String descricao, Double percentual){
        this.descricao = descricao;
        this.percentual = percentual;
    }

    public Double getPercentual() {
        return percentual;
    }

    public String getDescricao() {
        return descricao;
    }

    abstract Double reajusteSalarial(Double salario);
}
