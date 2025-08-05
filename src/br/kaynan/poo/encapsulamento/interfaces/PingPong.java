package br.kaynan.poo.encapsulamento.interfaces;

public class PingPong implements Jogo{
    @Override
    public void jogar() {
        System.out.println("Jogando Ping Pong...");
    }

    @Override
    public void fechar() {
        System.out.println("Salvando o progresso do jogo");
        System.out.println("Fechando Ping Pong...");
    }
}