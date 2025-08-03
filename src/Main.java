import br.kaynan.poo.heranca.Cachorro;
import br.kaynan.poo.heranca.Dragao;
import br.kaynan.poo.heranca.Pombo;

public class Main {
    public static void main(String[] args) {
        Pombo pombo = new Pombo("Pombo Correio");
        pombo.enviarCartas();
        pombo.enviarCartas();

        Dragao dragao = new Dragao("Dragão Branco");
        dragao.voar();
        dragao.soltarFogo();

    }
}