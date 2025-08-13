package br.kaynan.basico.constante;

public class Cpf {
    private final static int INDICE_REGIAO = 8;
    private final static int INDICE_PRIMEIRO_VERIFICADOR = 9;
    private final static int INDICE_SEGUNDO_VERIFICADOR = 10;

    public void validar(String cpf) {
        // ABCDEFGHIJK
        // A-H: é um identificador que a RF
        // I (8): é a regiao que foi emitido o seu CPF
        // J (9): digitos verificadores
        // K (10): digitos verificadores
        int regiao = cpf.charAt(INDICE_REGIAO);
        int primeiroDigitoVerificador = cpf.charAt(INDICE_PRIMEIRO_VERIFICADOR);
        int segundoDigitoVerificador = cpf.charAt(INDICE_SEGUNDO_VERIFICADOR);
    }
}