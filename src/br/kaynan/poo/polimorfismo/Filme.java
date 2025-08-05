package br.kaynan.poo.polimorfismo;

public class Filme extends Video {
    private String audio;
    private String legenda;

    public Filme(String nome) {
        super(nome);
        this.audio = "português";
        this.legenda = "nenhuma";
    }

    @Override
    public void play() {
        System.out.println("Play: filme " + getNome());
    }

    // Polimorfismo usando sobrecarga de metodos
    public void play(String audio) {
        this.audio = audio;
        if (audio.equals("português")) {
            this.legenda = "nenhuma";
        } else {
            this.legenda = "português";
        }
        System.out.println("Play: " + toString());
    }

    public void play(String audio, String legenda) {
        this.audio = audio;
        this.legenda = legenda;
        System.out.println("Play: " + toString());
    }

    @Override
    public String toString() {
        String resultado = String.format("Filme %s (Audio: %s, Legenda: %s)", getNome(), audio, legenda);
        return resultado;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public String getLegenda() {
        return legenda;
    }

    public void setLegenda(String legenda) {
        this.legenda = legenda;
    }
}