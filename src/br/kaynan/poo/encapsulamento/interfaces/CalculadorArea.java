package br.kaynan.poo.encapsulamento.interfaces;

public class CalculadorArea {
    public double somarArea(FiguraGeometrica figuraA, FiguraGeometrica figuraB) {
        double totalArea = figuraA.calcularArea() + figuraB.calcularArea();
        return totalArea;
    }
}