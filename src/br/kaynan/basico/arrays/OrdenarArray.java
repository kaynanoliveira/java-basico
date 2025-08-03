package br.kaynan.basico.arrays;
import java.util.ArrayList;
import java.util.Collections;

public class OrdenarArray {
    public static void main(String[] args) {
        ArrayList<Integer> numero = new ArrayList<Integer>();
        numero.add(30);
        numero.add(1);
        numero.add(6);
        numero.add(40);
        numero.add(70);
        numero.add(96);
        numero.add(100);
        numero.add(46);

        // sort -> ordena
        Collections.sort(numero);  // Ordena em ordem crescente
        // Collections.sort(numero, Collections.reverseOrder());  // Ordena em ordem decrescente

        for (Integer numeros : numero){
            System.out.println(numeros);
        }
    }
}