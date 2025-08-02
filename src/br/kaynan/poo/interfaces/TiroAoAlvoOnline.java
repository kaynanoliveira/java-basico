package br.kaynan.poo.interfaces;

public class TiroAoAlvoOnline implements Jogo{
    @Override
    public void jogar() {
        System.out.println("Carregando o jogo");
        System.out.println("Se conectando ao servidor");
        System.out.println("Carregando a partida");
    }

    @Override
    public void fechar() {
        System.out.println("Salvar o progresso do jogo no servidor ");
        System.out.println("Sair da partida");
        System.out.println("Sair do jogo");
    }
}
