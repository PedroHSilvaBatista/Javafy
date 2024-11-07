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
                3 - Adicionar algum título para sua lista de favoritos
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
                            Collections.sort(listaDeMusicas);
                            System.out.println("Aqui estão as músicas sugeridas em ordem alfabética por nome de música: ");
                            for (Musica musica: listaDeMusicas){
                                System.out.println(musica);
                            }

                            System.out.println("Gostaria que fosse exibida também a lista de músicas por ordem de lançamento? [S/N]: ");
                            String opcaoListarAnoDeLancamento = input.nextLine();

                            if (opcaoListarAnoDeLancamento.toLowerCase().charAt(0) == 's'){
                                listaDeMusicas.sort(Comparator.comparing(Musica::getAnoLancamento));
                                System.out.println("Aqui estão as músicas em ordem de lançamento: ");
                                for (Musica musica: listaDeMusicas){
                                    System.out.println(musica);
                                }
                            } else if (opcaoListarAnoDeLancamento.toLowerCase().charAt(0) == 'n'){
                                System.out.println("Certo, por favor fique a vontade para navegar em nossas opções do menu");
                            } else {
                                System.out.println("Por favor, digite apenas Sim ou Não");
                            }
                            break;
                        case "2":
                            //
                            break;
                        case "3":
                            //
                            break;
                        default:
                            System.out.println("Por favor, digite uma opção válida");
                            break;
                    }
                    break;
                case "3":
                    System.out.println("""
                            Escolha uma das categorias abiaxo par serem exibidas
                            1 - Música
                            2 - Podcast
                            """);
                    System.out.print("Digite sua opção: ");
                    String opcaoAdicionar = input.nextLine();
                    switch (opcaoAdicionar){
                        case "1":
                            //
                            break;
                        case "2":
                            //
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
