package personagem;

import java.util.List;

public class Ajudante extends Personagem<List<String>> {
    public Ajudante(String nome, List<String> poderes, String origem) {
        super(nome, poderes, origem);
    }
}