package br.kaynan.basico.tratamento_excecoes;

import javax.swing.*;

public class App {
    public static void main(String[] args) {
        Matematica matematica = new Matematica();
        int[] numeros = new int[]{10, 20, 30, 100};
        int[] peso = new int[]{2, 0, 4};

        for (int i = 0; i < numeros.length; i++) {
            try {
                matematica.dividir(numeros[i], peso[i]);
                System.out.println("Mensagem após exceçao");
            } catch (ArithmeticException erro) {
                // Trata os erros de aritmético, de calculo matemático
                JOptionPane.showMessageDialog(null, "Erro de calculo: " + erro.getMessage());
            } catch (ArrayIndexOutOfBoundsException erro) {
                // Trata os erros relacionado a ultrapassar o tamanho do vetor
                System.out.println("Erro de vetor: " + erro.getMessage());
            } catch (Exception erro) {
                System.out.println("Erro genérico");
            }
        }
        System.out.println("Mensagem final");
    }
}