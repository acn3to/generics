package rede;

public record ComponenteSimples(String nome) implements ComponenteRede, Comunicacao {

    @Override
    public void conectar(ComponenteRede outro) {
        System.out.println(this.nome + " conectado a " + outro);
    }

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println(this.nome + " recebeu: " + mensagem);
    }

    public void receberMensagem(String mensagem) {
        System.out.println(this.nome + " recebeu: " + mensagem);
    }

    @Override
    public String toString() {
        return nome;
    }
}
