package rede;

class RedeLan extends Rede {
    @Override
    public void conectar(ComponenteRede outro) {
        super.conectar(outro);
        System.out.println("Conectado à rede LAN: " + outro);
    }

    @Override
    public void enviarMensagem(String mensagem) {
        for (ComponenteRede componente : componentes) {
            if (componente instanceof Comunicacao) {
                ((Comunicacao) componente).enviarMensagem(mensagem + " via LAN");
            }
        }
    }
}
