package br.kaynan.basico.constante;

public class Login {
    private final static int TAMANHO_MINIMO_SENHA = 10;  // Constante

    public void verificarSenha(String senha){
        if(senha.length() > TAMANHO_MINIMO_SENHA){
            System.out.println("Senha válida");
        } else {
            System.out.println("Senha inválida");
        }
    }
}