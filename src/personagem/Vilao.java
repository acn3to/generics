package personagem;

import java.util.List;

public class Vilao extends Personagem<List<String>> {
    public Vilao(String nome, List<String> poderes, String origem) {
        super(nome, poderes, origem);
    }
}
