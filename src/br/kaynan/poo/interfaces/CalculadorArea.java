package br.kaynan.poo.interfaces;

public class CalculadorArea {
    public double somarArea(FiguraGeometrica figuraA, FiguraGeometrica figuraB) {
        double totalArea = figuraA.calcularArea() + figuraB.calcularArea();
        return totalArea;
    }
}