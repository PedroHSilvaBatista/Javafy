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
        musica.setDuracao(4);

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
        podcast.setTitulo("Ep.32- Dois Irmãos- Milton Hatoum- Resumo + Análise");
        podcast.setHost("Fernando Anjos (Prof. Fefo)");
        podcast.setDescricao("O livro 'Dois Irmãos', do escritor Milton Hatoum, foi lançado no ano de 2000" +
                "e é considerada uma das obras mais importantes da Literatura brasileira contemporânea. Na narrativa," +
                "dois irmãos gêmeos (Yaqub e Omar) lidam com sua semelhança e suas diferenças, o que traz à tona " +
                "revelações, conflitos e o desafio de manter as relações familiares quando as bases já não parecem " +
                "ser tão sólidas. Leitura obrigatória no vestibular da FUVEST. Vem ouvir o Resumo e a Análise");
        podcast.setAnoLancamento(2023);
        podcast.setDuracao(39);

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
