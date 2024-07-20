package personagem;

import java.util.List;

public class SimuladorPersonagens {
    public static void main(String[] args) {
        SuperHeroi ironMan = new SuperHeroi("Tony Stark", List.of("Inteligência", "Dinheiro"), "Estados Unidos");
        System.out.println(ironMan.getNome() + " é um super-herói com habilidades de " + ironMan.getPoderes() + " e seu pais de origem é: " + ironMan.getOrigem());

        Vilao magneto = new Vilao("Magneto", List.of("Telecinese", "Magnetismo"), "Alemanha");
        System.out.println(magneto.getNome() + " é um vilão com habilidades de " + magneto.getPoderes() + " e seu pais de origem é: " + magneto.getOrigem());

        Ajudante alfredPennyworth = new Ajudante("Alfred Pennyworth", List.of("Habilidades de combate", "Estratégia", "Cozinhar"), "Inglaterra");
        System.out.println(alfredPennyworth.getNome() + " é um ajudante com habilidades de " + alfredPennyworth.getPoderes() + " e seu pais de origem é: " + alfredPennyworth.getOrigem());
    }
}
