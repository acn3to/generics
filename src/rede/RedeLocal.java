package rede;

public class RedeLocal extends Rede {
    @Override
    public void conectar(ComponenteRede outro) {
        super.conectar(outro);
        System.out.println("Conectado à rede Local: " + outro);
    }

    @Override
    public void enviarMensagem(String mensagem) {
        for (ComponenteRede componente : componentes) {
            if (componente instanceof Comunicacao) {
                ((Comunicacao) componente).enviarMensagem(mensagem + " via Local");
            }
        }
    }
}
