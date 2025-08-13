package br.kaynan.poo.agregacao;

public class Telefone {
    private String numeroChip;
    private Contatos contatos;
    private Chamadas chamadas;

    public Telefone(String numeroChip) {
        this.numeroChip = numeroChip;
        this.contatos = new Contatos();
        this.chamadas = new Chamadas();
    }

    public void ligar(String numeroOrigem){
        Ligacao ligacao = new Ligacao(numeroChip, numeroOrigem);
        ligacao.ligar();
        chamadas.adicionar(ligacao);
    }

    public void ligar(Contato contatoDestino){
        ligar(contatoDestino.getNumero());
    }

    public String getNumeroChip() {
        return numeroChip;
    }

    public Contatos getContatos() {
        return contatos;
    }

    public Chamadas getChamadas() {
        return chamadas;
    }
}