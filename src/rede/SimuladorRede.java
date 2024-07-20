package rede;

public class SimuladorRede {
    public static void main(String[] args) {
        Rede redeLan = new RedeLan();
        Rede redeWifi = new RedeWifi();
        Rede redeLocal = new RedeLocal();

        ComponenteSimples notebook = new ComponenteSimples("Notebook");
        ComponenteSimples iphone = new ComponenteSimples("iPhone");

        redeLan.conectar(notebook);
        redeLan.conectar(iphone);

        redeWifi.conectar(notebook);
        redeWifi.conectar(iphone);

        redeLocal.conectar(notebook);
        redeLocal.conectar(iphone);

        String respostaLan = redeLan.enviarMensagemPara(notebook, iphone, "Olá LAN");
        System.out.println(respostaLan);

        String respostaWifi = redeWifi.enviarMensagemPara(iphone, notebook, "Olá WiFi");
        System.out.println(respostaWifi);

        String respostaLocal = redeLocal.enviarMensagemPara(notebook, iphone, "Olá Local");
        System.out.println(respostaLocal);
    }
}