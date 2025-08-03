package br.kaynan.poo.heranca;

public class Dragao extends Ave{

    public Dragao(String nome) {
        super(nome);
    }

    public void soltarFogo(){
        System.out.printf("%s soltou bola de fogo", getNome());
    }

}