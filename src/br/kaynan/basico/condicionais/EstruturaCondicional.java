package br.kaynan.basico.condicionais;
import java.util.Scanner;

public class EstruturaCondicional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        if(idade >= 18){
            System.out.println("Maior de idade");
        }else {
            System.out.println("Menor de idade");
        }
    }
}
