import br.com.alura.minhasmusicas.modelos.*;
import br.com.alura.minhasmusicas.classificacao.*;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void menu(){
        System.out.println("""
                SEJA BEM VINDO AO JAVAFY!, SUA PLATAFORMA PREFERIDA DE MÚSICAS E PODCASTS
                **************************************************************************
                Escolha uma das opções abaixo:
                1 - Sugerir um novo título ao catálogo
                2 - Listar os títulos sugeridos por você
                3 - Exibir títulos da lista de favoritos
                4 - Exibir o tempo de reprodução para todos os títulos da lista de favoritos
                5 - Sair do programa
                """);
    }


    public static void main(String[] args) {
        List<Audio> listaDeAudios = new ArrayList<>();
        List<Musica> listaDeMusicas = new ArrayList<>();
        List<Podcast> listaDePodcasts = new ArrayList<>();
        List<Audio> listaDeTitulosFavoritos = new ArrayList<>();

        // IMPLEMENTAÇÕES:
        // CRIAR UM MENU DE OPÇÕES PARA O USUÁRIO
        // PEDIR PARA QUE O USUÁRIO CRIE SEUS OBJETOS
        // CRIAR UM CONSTRUTOR PARA CADA CLASSE
        // CLASSE ABSTRATA: NOME(TÍTULO), ANO DE LANÇAMENTO
        // CLASSE MÚSICA: NOME(TÍTULO), ARTISTA, GÊNERO, ALBUM, ANO DE LANÇAMENTO E DURAÇÃO
        // CLASSE PODCAST: TITULO, HOST, DESCRIÇÃO E DURAÇÃO
        // ARMAZENAR OS OBJETOS DO USUÁRIO EM UMA LISTA

        boolean controle = true;
        while (controle) {
            menu();
            Scanner input = new Scanner(System.in);
            System.out.print("Digite sua opção: ");
            String opcaoUsuario = input.nextLine();
            switch (opcaoUsuario) {
                case "1":
                    System.out.println("""
                            Dentre as categorias abaixo, qual gostaria que fosse adicionada?
                            1 - Música
                            2 - Podcast
                            """);
                    System.out.print("Sua opção: ");
                    String opcaoInserir = input.nextLine();
                    switch (opcaoInserir){
                        case "1":
                            System.out.println("Para recomendar uma nova música ao catálogo, preencha algumas informações importantes");

                            System.out.print("Diga o nome da música que deseja cadastrar: ");
                            String tituloMusica = input.nextLine();

                            System.out.print("Diga a duração aproximada da música em minutos: ");
                            int duracaoMusica = input.nextInt();

                            System.out.print("Diga o ano de lançamento que a música foi lançada: ");
                            int anoDeLancamentoMusica = input.nextInt();

                            System.out.print("Diga o artista que produziu a música: ");
                            String artista = input.nextLine();

                            System.out.print("Diga o gênero da música: ");
                            String genero = input.nextLine();

                            System.out.print("Diga o album a qual a música pertence, caso seja um Single, digite Single: ");
                            String album = input.nextLine();

                            listaDeMusicas.add(new Musica(tituloMusica, duracaoMusica, anoDeLancamentoMusica, artista, genero, album));
                            System.out.println("Recomendação de música salva com sucesso!");

                            for (Musica musica: listaDeMusicas) {
                                if (musica.getTitulo().equals(tituloMusica)){
                                    listaDeAudios.add(musica);
                                }
                            }

                            System.out.print("Gostaria de adicionar sua música sugerida a lista de favoritos? [S/N]: ");
                            String opcaoAdicionarMusicaAosFavoritos = input.nextLine();

                            if(opcaoAdicionarMusicaAosFavoritos.toLowerCase().charAt(0) == 's'){
                                for (Musica musica: listaDeMusicas){
                                    if (musica.getTitulo().equals(tituloMusica)){
                                        listaDeTitulosFavoritos.add(musica);
                                        System.out.println("A música " + tituloMusica + " foi adicionada a lista de favoritos!");
                                    }
                                }
                            } else if (opcaoAdicionarMusicaAosFavoritos.toLowerCase().charAt(0) == 'n'){
                                System.out.println("Certo, por favor fique a vontade para navegar em nossas opções do menu");
                            } else {
                                System.out.println("Por favor, digite apenas Sim ou Não");
                            }
                            break;
                        case "2":
                            System.out.println("Para recomendar um novo podcast ao catálogo, preencha algumas informações importantes");

                            System.out.print("Diga o nome do podcast que deseja cadastrar: ");
                            String tituloPodcast = input.nextLine();

                            System.out.print("Diga a duração aproximada do podcast em minutos: ");
                            int duracaoPodcast = input.nextInt();

                            System.out.print("Diga o ano de lançamento que o podcast foi lançado: ");
                            int anoDeLancamentoPodcast = input.nextInt();

                            System.out.print("Diga qual é nome do host(apresentador) do podcast: ");
                            String host = input.nextLine();

                            System.out.print("Diga um pouco sobre o podcast a ser cadastrado: ");
                            String descricao = input.nextLine();

                            listaDePodcasts.add(new Podcast(tituloPodcast, duracaoPodcast, anoDeLancamentoPodcast, host, descricao));
                            System.out.println("Recomendação de podcast salva com sucesso!");

                            for (Podcast podcast: listaDePodcasts){
                                if (podcast.getTitulo().equals(tituloPodcast)){
                                    listaDeAudios.add(podcast);
                                }
                            }

                            System.out.print("Gostaria de adicionar seu podcast sugerido a lista de favoritos? [S/N]: ");
                            String opcaoAdicionarPodcastAosFavoritos = input.nextLine();

                            if (opcaoAdicionarPodcastAosFavoritos.toLowerCase().charAt(0) == 's'){
                                for (Podcast podcast: listaDePodcasts){
                                    if (podcast.getTitulo().equals(tituloPodcast)) {
                                        listaDeTitulosFavoritos.add(podcast);
                                        System.out.println("O podcast " + tituloPodcast + " foi adicionada a lista de favoritos!");
                                    }
                                }
                            } else if (opcaoAdicionarPodcastAosFavoritos.toLowerCase().charAt(0) == 'n'){
                                System.out.println("Certo, por favor fique a vontade para navegar em nossas opções do menu");
                            } else {
                                System.out.println("Por favor, digite apenas Sim ou Não");
                            }
                            break;
                        default:
                            System.out.println("Por favor, digite uma das opções apresentadas");
                    }
                    break;
                case "2":
                    System.out.println("""
                            Dentre as categorias abaixo qual gostaria que fosse exibida?
                            1 - Música
                            2 - Podcast
                            3 - Todos os Títulos
                            """);
                    System.out.print("Digite aqui sua opção: ");
                    String opcaoListar = input.nextLine();
                    switch (opcaoListar){
                        case "1":
                            // VERIFICAR SE A LISTA NÃO ESTÁ VAZIA
                            if (listaDeMusicas.isEmpty()){
                                System.out.println("Você ainda não sugeriu nenhuma música, sugira uma música para poder visualizá-las aqui");
                                break;
                            }
                            List<Musica> listaOrdenadaDeMusicas = new ArrayList<>(listaDeMusicas);
                            Collections.sort(listaOrdenadaDeMusicas);
                            System.out.println("Aqui estão as músicas sugeridas em ordem alfabética por nome de música: ");
                            for (Musica musica: listaOrdenadaDeMusicas){
                                System.out.println(musica);
                            }

                            System.out.println("Gostaria que fosse exibida também a lista de músicas por ordem de lançamento? [S/N]: ");
                            String opcaoListarAnoDeLancamentoMusica = input.nextLine();
                            if (opcaoListarAnoDeLancamentoMusica.toLowerCase().charAt(0) == 's'){
                                listaOrdenadaDeMusicas.sort(Comparator.comparing(Musica::getAnoLancamento));
                                System.out.println("Aqui estão as músicas em ordem de lançamento: ");
                                for (Musica musica: listaDeMusicas){
                                    System.out.println(musica);
                                }
                            } else if (opcaoListarAnoDeLancamentoMusica.toLowerCase().charAt(0) == 'n'){
                                System.out.println("Certo, por favor fique a vontade para navegar em nossas opções do menu");
                            } else {
                                System.out.println("Por favor, digite apenas: Sim ou Não");
                            }
                            break;
                        case "2":
                            if (listaDePodcasts.isEmpty()){
                                System.out.println("Você ainda não sugeriu nenhum podcast, sugira um podcast para poder visualizá-los aqui");
                                break;
                            }
                            List<Podcast> listaOrdenadaDePodcasts = new ArrayList<>(listaDePodcasts);
                            Collections.sort(listaOrdenadaDePodcasts);
                            System.out.println("Aqui estão os podcasts sugeridos em ordem alfabética por nome do podcast: ");
                            for (Podcast podcast: listaOrdenadaDePodcasts){
                                System.out.println(podcast);
                            }

                            System.out.println("Gostaria que fosse axibida também a lista de podcasts por ordem de lançamento? [S/N]: ");
                            String opcaoListarAnoDeLancamentoPodcast = input.nextLine();

                            if (opcaoListarAnoDeLancamentoPodcast.toLowerCase().charAt(0) == 's'){
                                listaOrdenadaDePodcasts.sort(Comparator.comparing(Podcast::getAnoLancamento));
                                for (Podcast podcast: listaOrdenadaDePodcasts){
                                    System.out.println(podcast);
                                }
                            } else if (opcaoListarAnoDeLancamentoPodcast.toLowerCase().charAt(0) == 'n') {
                                System.out.println("Certo, por favor fique a vontade para navegar em nossas opções do menu");
                            } else {
                                System.out.println("Por favor, digite apenas: Sim ou Não");
                            }
                            break;
                        case "3":
                            if (listaDeAudios.isEmpty()){
                                System.out.println("Você ainda não sugeriu nenhum título, sugira algum título para poder visualizá-los aqui");
                                break;
                            }
                            List<Audio> listaOrdenadaDeAudios = new ArrayList<>(listaDeAudios);
                            Collections.sort(listaOrdenadaDeAudios);
                            System.out.println("Aqui estão todos os títulos sugeridos em ordem alfabética por nome: ");
                            for (Audio audio: listaDeAudios){
                                System.out.println(audio);
                            }

                            System.out.println("Gostaria que fosse exibido também a lista de títulos por ordem de lançamentos? [S/N]");
                            String opcaoListarAnoDeLancamentoAudio = input.nextLine();

                            if (opcaoListarAnoDeLancamentoAudio.toLowerCase().charAt(0) == 's'){
                                listaOrdenadaDeAudios.sort(Comparator.comparing(Audio::getAnoLancamento));
                                for (Audio audio: listaOrdenadaDeAudios){
                                    System.out.println(audio);
                                }
                            } else if(opcaoListarAnoDeLancamentoAudio.toLowerCase().charAt(0) == 'n'){
                                System.out.println("Certo, por favor fique a vontade para navegar em nossas opções do menu");
                            } else {
                                System.out.println("Por favor, digite apenas: Sim ou Não");
                            }
                            break;
                        default:
                            System.out.println("Por favor, digite uma opção válida");
                            break;
                    }
                    break;
                case "3":
                    if (listaDeTitulosFavoritos.isEmpty()){
                        System.out.println("Você ainda não adicionou nenhum título a lista de favoritos, acrescente algum título para poder visualizá-lo aqui");
                        break;
                    }
                    System.out.println("""
                            Escolha uma das categorias abaixo para serem exibidas da lista de favoritos
                            1 - Música
                            2 - Podcast
                            3 - Todos os Títulos
                            """);
                    System.out.print("Digite sua opção: ");
                    String opcaoExibirListaDeFavoritos = input.nextLine();
                    switch (opcaoExibirListaDeFavoritos){
                        case "1":
                            //
                            System.out.println("Lista de músicas adicionadas aos favoritos: ");
                            for (Audio musica: listaDeTitulosFavoritos){
                                if (musica instanceof Musica){
                                    System.out.println(musica);
                                }
                            }
                            break;
                        case "2":
                            //
                            System.out.println("Lista de podcasts adicionadas aos favoritos: ");
                            for (Audio podcast: listaDeTitulosFavoritos){
                                if (podcast instanceof Podcast){
                                    System.out.println(podcast);
                                }
                            }
                            break;
                        case "3":
                            //
                            System.out.println("Lista de todos os títulos adicionados aos favoritos: ");
                            for (Audio audio: listaDeTitulosFavoritos){
                                System.out.println(audio);
                            }
                            break;
                        default:
                            System.out.println("Por favor, digite uma opção válida");
                    }
                    break;
                case "4":
                    //
                    break;
                case "5":
                    System.out.println("Volte sempre :)");
                    System.out.println("Encerrando o programa...");
                    controle = false;
                    break;
                default:
                    System.out.println("Por favor, digite uma opção válida");
                    break;
            }
        }
        System.out.println(listaDeMusicas);
        System.out.println(listaDePodcasts);
        System.out.println(listaDeTitulosFavoritos);
        /*
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
        */
    }
}
