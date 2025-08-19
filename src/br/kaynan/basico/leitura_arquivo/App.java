package br.kaynan.basico.leitura_arquivo;

import javax.swing.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        String caminhoArquivo = "C:/Users/kayna/Projetos/Java/java-basic/src/br/kaynan/basico/leitura_arquivo/leitura.txt";

        // Arquivo arquivo = new Arquivo();

        /*
            Files.readAllLines -> para ler todas as linhas; ler arquivos pequenos
            BufferedReader -> complexo de escrever; ele é ótimo para ler arquivo grande;
            quando precisa ler linha por linha
         */

        try {
            // System.out.println(arquivo.ler(caminhoArquivo));
            Path caminhos = Paths.get(caminhoArquivo);
            List<String> resultadoLista = Files.readAllLines(caminhos);
            String conteudo = String.join("\n", resultadoLista);
            System.out.println(conteudo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Houve um erro na busca de arquivo");
        }
    }
}