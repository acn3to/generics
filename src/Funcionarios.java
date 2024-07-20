import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Funcionarios<T> {
    private final List<T> funcionarios;

    public Funcionarios() {
        funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(T funcionario) {
        funcionarios.add(funcionario);
    }

    public T getFuncionario(int indice) {
        if (indice < 0 || indice >= funcionarios.size()) {
            throw new IndexOutOfBoundsException("Índice inexistente.");
        }
        return funcionarios.get(indice);
    }

    public void removerFuncionario(int indice) {
        if (indice < 0 || indice >= funcionarios.size()) {
            throw new IndexOutOfBoundsException("Índice inexistente.");
        }
        funcionarios.remove(indice);
    }

    public int contarFuncionarios() {
        return funcionarios.size();
    }

    public boolean estaVazio() {
        return funcionarios.isEmpty();
    }

    public List<T> listarFuncionarios() {
        return new ArrayList<>(funcionarios);
    }

    public Optional<T> buscarFuncionario(T criterio) {
        return funcionarios.stream().filter(f -> f.equals(criterio)).findFirst();
    }
}
