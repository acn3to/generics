import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Funcionarios<String> funcionarios = new Funcionarios<>();
        funcionarios.adicionarFuncionario("Arnaldo");
        funcionarios.adicionarFuncionario("Costa");
        funcionarios.adicionarFuncionario("Neto");

        System.out.println("Funcionários: " + funcionarios.listarFuncionarios());

        System.out.println("Funcionário no índice 1: " + funcionarios.getFuncionario(1));

        funcionarios.removerFuncionario(1);

        System.out.println("Funcionários após remoção: " + funcionarios.listarFuncionarios());

        System.out.println("Número de funcionários: " + funcionarios.contarFuncionarios());
        System.out.println("Funcionários estão vazios? " + funcionarios.estaVazio());

        System.out.println("Buscando funcionário Arnaldo");
        Optional<String> funcionario1 = funcionarios.buscarFuncionario("Arnaldo");
        System.out.println("Funcionário: " + funcionario1.orElse("Não encontrado"));

        System.out.println("Buscando funcionário Costa");
        Optional<String> funcionario2 = funcionarios.buscarFuncionario("Costa");
        System.out.println("Funcionário: " + funcionario2.orElse("Não encontrado"));
    }
}
