import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Fila<T> {
    private final List<T> elementos;

    public Fila() {
        elementos = new ArrayList<>();
    }

    public void enfileirar(T elemento) {
        elementos.add(elemento);
    }

    public T desenfileirar() {
        if (elementos.isEmpty()) {
            throw new NoSuchElementException();
        }
        return elementos.removeFirst();
    }

    public boolean isEmpty() {
        return elementos.isEmpty();
    }
}
