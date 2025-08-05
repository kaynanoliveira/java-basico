package br.kaynan.poo.polimorfismo;

public class Serie extends Filme {
    private int quantidadeDeTemporadas;
    private int episodiosPorTemporada;
    private int temporadaAtual;
    private int episodioAtual;

    public Serie(String nome, int temporadas, int episodiosPorTemporada) {
        super(nome);
        this.quantidadeDeTemporadas = temporadas;
        this.episodiosPorTemporada = episodiosPorTemporada;
        this.temporadaAtual = 1;
        this.episodioAtual = 1;
    }

    @Override
    public String toString() {
        String resultado = String.format("Serie %s %dx%02d (Audio: %s, Legenda: %s)",
                getNome(), temporadaAtual, episodioAtual, getAudio(), getLegenda());
        return resultado;
    }


    public void play(int temporada, int episodio) {
        if(validarEpisodio(temporada, episodio)){
            this.temporadaAtual = temporada;
            this.episodioAtual = episodio;
            System.out.println("Play: " + toString());
        } else {
            System.out.println("Episódio inválido!!");
        }
    }

    private boolean validarEpisodio(int temporada, int episodio) {
        if (temporada == 0 || episodio == 0)
            return false;
        if (temporada > quantidadeDeTemporadas || episodio > episodiosPorTemporada)
            return false;

        return true;
    }

    public int getTemporadas() {
        return quantidadeDeTemporadas;
    }

    public void setTemporadas(int temporadas) {
        this.quantidadeDeTemporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getTemporadaAtual() {
        return temporadaAtual;
    }

    public void setTemporadaAtual(int temporadaAtual) {
        this.temporadaAtual = temporadaAtual;
    }

    public int getEpisodioAtual() {
        return episodioAtual;
    }

    public void setEpisodioAtual(int episodioAtual) {
        this.episodioAtual = episodioAtual;
    }
}