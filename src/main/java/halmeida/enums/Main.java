package halmeida.enums;

public class Main {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Joao", Cargo.DBA);

        Double novoSalario = funcionario.salarioComReajuste();

        System.out.println(novoSalario);
    }
}
