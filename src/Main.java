import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();

        fila.enfileirar(1);
        fila.enfileirar(2);
        fila.enfileirar(3);

        System.out.println("Fila está vazia? " + fila.isEmpty());

        System.out.println("Desenfileirado: " + fila.desenfileirar());
        System.out.println("Desenfileirado: " + fila.desenfileirar());

        fila.enfileirar(4);

        System.out.println("Desenfileirado: " + fila.desenfileirar());
        System.out.println("Desenfileirado: " + fila.desenfileirar());

        try {
            System.out.println("Desenfileirado: " + fila.desenfileirar());
        } catch (NoSuchElementException e) {
            System.out.println("Fila está vazia, não há elementos para desenfileirar.");
        }
    }
}

