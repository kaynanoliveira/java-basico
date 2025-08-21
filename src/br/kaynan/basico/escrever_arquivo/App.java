package br.kaynan.basico.escrever_arquivo;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class App {
    public static void main(String[] args) throws Exception {

        String caminhoArquivo = "C:/Users/kayna/Projetos/Java/java-basic/src/br/kaynan/basico/escrever_arquivo/arquivo.txt/";
        boolean acrescentarNoArquivo = true;

        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(caminhoArquivo, acrescentarNoArquivo))) {
            escritor.write("Kaynan\n");
            System.out.println("Arquivo alterado com sucesso!");
        } catch (Exception erro) {
            System.out.println("Erro ao abrir o arquivo!!");
            erro.printStackTrace();
        }
    }
}