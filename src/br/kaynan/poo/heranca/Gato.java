package br.kaynan.poo.heranca;

public class Gato extends Animal{
    public Gato(String nome) {
        super(nome);
    }

    public void miar(){
        System.out.println("Miau, Miau");
    }
}