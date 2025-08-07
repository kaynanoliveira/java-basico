package br.kaynan.poo.agregacao;

public class App {
    public static void main(String[] args) {
        Telefone telefone = new Telefone("4002 8922");
        Contato contato1 = new Contato("Kaynan", "932939239");
        Contato contato2 = new Contato("Lucas", "423252636");
        Contato contato3 = new Contato("João", "32632656");
        Contato contato4 = new Contato("Maria", "884354311");

        Contatos telefoneContatos = telefone.getContatos();
        telefoneContatos.adicionar(contato1);
        telefoneContatos.adicionar(contato2);
        telefoneContatos.adicionar(contato3);
        telefoneContatos.adicionar(contato4);
        System.out.println(telefoneContatos);

        System.out.println("Contatos filtrados: ");
        System.out.println(telefoneContatos.buscar("L"));
    }
}