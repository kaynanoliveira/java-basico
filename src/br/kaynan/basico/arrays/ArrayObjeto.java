package br.kaynan.basico.arrays;
import java.util.ArrayList;

public class ArrayObjeto {
    public static void main(String[] args) {
        ArrayList<Integer> numero = new ArrayList<Integer>();
        numero.add(30);

        ArrayList<PessoaArrayTeste> pessoas = new ArrayList<PessoaArrayTeste>();
        pessoas.add(new PessoaArrayTeste("Maria", 32));
        pessoas.add(new PessoaArrayTeste("Kaynan", 22));
        pessoas.add(new PessoaArrayTeste("Lucas", 41));

        for (PessoaArrayTeste pessoa : pessoas){
            System.out.println(pessoa.getNome());
        }
    }
}
