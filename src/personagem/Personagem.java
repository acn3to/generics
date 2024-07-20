package personagem;

public abstract class Personagem<T> {
    private String nome;
    private T poderes;
    private String origem;

    public Personagem(String nome, T poderes, String origem) {
        this.nome = nome;
        this.poderes = poderes;
        this.origem = origem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public T getPoderes() {
        return poderes;
    }

    public void setPoderes(T poderes) {
        this.poderes = poderes;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }
}
