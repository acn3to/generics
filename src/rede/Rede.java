package rede;

import java.util.ArrayList;
import java.util.List;

abstract class Rede implements ComponenteRede, Comunicacao {
    protected List<ComponenteRede> componentes;

    public Rede() {
        this.componentes = new ArrayList<>();
    }

    @Override
    public void conectar(ComponenteRede outro) {
        componentes.add(outro);
    }

    @Override
    public void enviarMensagem(String mensagem) {
    }

    public String enviarMensagemPara(ComponenteSimples de, ComponenteSimples para, String mensagem) {
        if (componentes.contains(de) && componentes.contains(para)) {
            para.receberMensagem(mensagem + " de " + de.nome() + " via " + this);
            return "Mensagem enviada de " + de.nome() + " para " + para.nome() + " na rede " + this;
        } else {
            return "Um ou ambos os componentes não estão conectados à rede " + this;
        }
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}