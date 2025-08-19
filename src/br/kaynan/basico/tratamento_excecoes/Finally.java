package br.kaynan.basico.tratamento_excecoes;

public class Finally {
    public static void main(String[] args) {
        try {
            System.out.println("Mensagem antes da exceçao");
            int resultado = 10 / 0;
            System.out.println("Mensagem após a exceçao");
        } catch (Exception erro) {
            System.out.println("Erro: " + erro.getMessage());
        } finally {
            System.out.println("Vou ser executado indepedende se der erro ou nao");
        }
        System.out.println("Mensagem final");
    }
}
