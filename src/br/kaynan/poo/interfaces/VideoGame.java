package br.kaynan.poo.interfaces;

public class VideoGame {
    private Jogo jogo; // null
    private boolean estaLigado; // false

    public void ligar() {
        System.out.println("Ligando o videogame ...");
        this.estaLigado = true;
    }

    public void jogar(Jogo jogo) {
        if (estaLigado) {
            System.out.println("Iniciando o jogo ...");
            this.jogo = jogo;
            jogo.jogar();
        } else {
            System.out.println("O videogame está desligado!!");
        }
    }

    public void fechar() {
        if (estaLigado) {
            System.out.println("Fechando o jogo ...");
            if (jogo != null) {
                jogo.fechar();
                jogo = null;
            } else {
                System.out.println("Não tem nenhum jogo aberto!!");
            }
        } else {
            System.out.println("O videogame está desligado!!");
        }
    }
}