package halmeida.interfacepolimorfismo;

public class Main {

    public static void main(String[] args) {
        Programador programador = new Programador();
        Analista analista = new Analista();

        Funcionario joao = new Funcionario("Joao", 20, "123J", programador);

        String joaoNome = joao.getNome();
        int joaoIdade = joao.getIdade();
        String joaoMatricula = joao.getMatricula();
        double joaoSalario = joao.getCargo().salarioContratual();

        Double joaoNovoSalario = programador.aplicaReajusteSalarial(joao);


        Funcionario manuel = new Funcionario("Manuel", 20, "890M", analista);

        String manuelNome = manuel.getNome();
        String manuelMatricula = manuel.getMatricula();
        double manuelSalario = manuel.getCargo().salarioContratual();

        // analista não tem o método aplicaReajusteSalarial pq não implementa a interface
    }
}
