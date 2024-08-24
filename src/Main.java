import br.com.alura.minhasmusicas.modelos.*;
import br.com.alura.minhasmusicas.classificacao.*;

public class Main {
    public static void main(String[] args) {
        // Instanciamento do objeto de recomendação ao usuário
        FiltroRecomendacao filtro = new FiltroRecomendacao();

        // Istanciamento de um objeto da classe Musica
        Musica musica = new Musica();
        musica.setTitulo("Not Like Us");
        musica.setArtista("Kendrick Lamar");
        musica.setGenero("Hip-Hop/Rap");
        musica.setAlbum("Single");
        musica.setAnoLancamento(2024);
        musica.setDuracaoMinutos(4);

        for (int x = 0; x < 1000; x++) {
            musica.reproduz();
        }
        for (int x = 0; x < 890; x++) {
            musica.curte();
        }
        musica.exibaFicha();
        filtro.filtra(musica);

        System.out.println();

        // Instanciamento de um objeto da classe Podcast
        Podcast podcast = new Podcast();
        podcast.setTitulo("CLÓVIS DE BARROS - FLOW #392");
        podcast.setHost("Igor3K");
        podcast.setDescricao("Outro episódio para você repensar sua vida toda");
        podcast.setAnoLancamento(2024);
        podcast.setDuracaoMinutos(120);

        for (int x = 0; x < 2000; x++) {
            podcast.reproduz();
        }
        for (int x = 0; x < 2000; x++) {
            podcast.curte();
        }
        podcast.exibaFicha();
        filtro.filtra(podcast);
    }
}
