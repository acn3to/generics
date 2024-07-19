public class Main {
    public static void main(String[] args) {
        Familia<String> familia = new Familia<>();

        familia.adicionarMembro("Arnaldo");
        familia.adicionarMembro("Costa");
        familia.adicionarMembro("Neto");

        System.out.println("Membro no índice 0: " + familia.getMembro(0));

        familia.removerMembro(0);

        System.out.println("Membros da família: " + familia.listarMembros());

        System.out.println("Número de membros: " + familia.getNumeroDeMembros());
        System.out.println("Família está vazia? " + familia.estaVazia());

        familia.removerMembro(0);
        familia.removerMembro(0);

        System.out.println("Família está vazia? " + familia.estaVazia());
    }
}
