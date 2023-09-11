package halmeida.enums.metodos;

public class Main {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Joao", Cargo.PROGRAMADOR, 3000.0);

        Double novoSalario = funcionario.calculoReajusteSalarial();

        System.out.println(novoSalario);
    }
}
