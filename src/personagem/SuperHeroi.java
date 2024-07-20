package personagem;

import java.util.List;

public class SuperHeroi extends Personagem<List<String>> {
    public SuperHeroi(String nome, List<String> poderes, String origem) {
        super(nome, poderes, origem);
    }
}