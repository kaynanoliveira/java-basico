package br.kaynan.poo.encapsulamento.interfaces;

import br.kaynan.poo.encapsulamento.interfaces.FiguraGeometrica;

public class Circulo implements FiguraGeometrica {
    private int raio;

    public Circulo(int raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }
}