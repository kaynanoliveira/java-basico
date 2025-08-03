package br.kaynan.basico.arrays;
import java.util.ArrayList;

public class ArrayDinamico {
    public static void main(String[] args) {
        // Array com tamanho fixo de 5 posições
        String[] arrayEstatico = new String[5];
        arrayEstatico[0] = "Kaynan";
        arrayEstatico[1] = "Lucas";
        arrayEstatico[2] = "João";
        arrayEstatico[3] = "Pedro";
        arrayEstatico[4] = "Matheus";

        // ArrayList<Tipo> nome = new ArrayList<Tipo>();
        ArrayList<String> arrayDinamico = new ArrayList<String>();
        arrayDinamico.add("Kaynan");  // indice 0
        arrayDinamico.add("Lucas");   // indice 1
        arrayDinamico.add("João");    // indice 2
        arrayDinamico.add("Pedro");   // indice 3
        arrayDinamico.add("Matheus"); // indice 4

        System.out.println("Imprimindo o Array Estático");
        for(int i = 0; i < arrayEstatico.length; i++){
            System.out.println(arrayEstatico[i]);
        }

        System.out.println("Imprimindo o ArrayList Dinamico");

        System.out.println("Removendo Pedro");
        arrayDinamico.remove(3);  // remove um elemento por indice

        // arrayDinamico.clear();  // limpa o arrayList

        /*for(int i = 0; i < arrayDinamico.size() ; i++){
            String nome = arrayDinamico.get(i);
            System.out.println(nome);
        }*/

        for (String nome : arrayDinamico) {
            System.out.println(nome);
        }
    }
}