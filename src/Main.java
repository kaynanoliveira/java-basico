import br.kaynan.poo.heranca.Arqueiro;

public class Main {
    public static void main(String[] args) {
        Arqueiro arqueiro = new Arqueiro("Legolas");
        System.out.println(arqueiro);
        arqueiro.atacar();
        arqueiro.atacarSemArma();
    }
}