package br.kaynan.poo.heranca;

public class Arqueiro extends Personagem {
    private String arma;

    public Arqueiro(String nome) {
        super(nome);
        setClasse("Arqueiro");
        setNivel(2);
        this.arma = "Arco Longo";
    }

    @Override
    public String toString() {
        String informacaoPersonagem = super.toString();
        String informacaoArqueiro = String.format(" - Arma: %s", arma);
        return informacaoPersonagem + informacaoArqueiro;
    }

    @Override
    public void atacarComArma() {
        System.out.println("O arqueiro atacou com " + arma);
    }
}
