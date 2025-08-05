import br.kaynan.poo.polimorfismo.Filme;
import br.kaynan.poo.polimorfismo.Serie;

public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme("Lagoa azul");
        filme.play("português");
        System.out.println(filme.toString());

        Serie serie = new Serie("Stranger Things", 5, 7);
        serie.play(0, 0);
    }
}