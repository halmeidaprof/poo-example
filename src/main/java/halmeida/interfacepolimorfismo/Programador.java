package halmeida.interfacepolimorfismo;

public class Programador implements Cargo, Reajuste {

    @Override
    public double salarioContratual() {
        return 7000.0;
    }

    @Override
    public Double aplicaReajusteSalarial(Funcionario funcionario) {
        return funcionario.getCargo().salarioContratual() * 1.20;
    }
}
