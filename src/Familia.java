import java.util.ArrayList;
import java.util.List;

public class Familia<T> {
    private final List<T> membros;

    public Familia() {
        membros = new ArrayList<>();
    }

    public void adicionarMembro(T membro) {
        membros.add(membro);
    }

    public T getMembro(int indice) {
        if (indice < 0 || indice >= membros.size()) {
            throw new IndexOutOfBoundsException("Índice inexistente.");
        }
        return membros.get(indice);
    }

    public void removerMembro(int indice) {
        if (indice < 0 || indice >= membros.size()) {
            throw new IndexOutOfBoundsException("Índice inexistente.");
        }
        membros.remove(indice);
    }

    public int getNumeroDeMembros() {
        return membros.size();
    }

    public boolean estaVazia() {
        return membros.isEmpty();
    }

    public List<T> listarMembros() {
        return new ArrayList<>(membros);
    }
}
