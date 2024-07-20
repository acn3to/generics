package rede;

public class RedeWifi extends Rede {
    @Override
    public void conectar(ComponenteRede outro) {
        super.conectar(outro);
        System.out.println("Conectado à rede WiFi: " + outro);
    }

    @Override
    public void enviarMensagem(String mensagem) {
        for (ComponenteRede componente : componentes) {
            if (componente instanceof Comunicacao) {
                ((Comunicacao) componente).enviarMensagem(mensagem + " via WiFi");
            }
        }
    }
}
