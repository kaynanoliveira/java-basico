package br.kaynan.poo.heranca;

public class Pombo extends Ave {
    private int cartasEnviadas;

    public Pombo(String nome) {
        super(nome);
    }

    public void fazerPru(){
        System.out.printf("%s fez Pruuu\n", getNome());
    }

    public void enviarCartas(){
        System.out.printf("%s enviou uma carta\n", getNome());
        cartasEnviadas++;
        System.out.println("Total cartas enviadas: " + cartasEnviadas);
    }
}