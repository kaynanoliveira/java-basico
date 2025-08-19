package br.kaynan.basico.leitura_arquivo;

import java.io.BufferedReader;
import java.io.FileReader;

public class Arquivo {
    // O metodo ler pode disparar exceçoes do tipo Exception
    public String ler(String caminhoArquivo) throws Exception {
        String conteudo = "";

        try (BufferedReader leitor = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha = leitor.readLine();

            while (linha != null) {
                conteudo += linha;
                linha = leitor.readLine();

                if (linha != null) {
                    conteudo += '\n';
                }
            }
        } catch (Exception erro) {
            throw erro;
        }
        return conteudo;
    }
}