import br.com.alura.minhasmusicas.modelos.*;
import br.com.alura.minhasmusicas.classificacao.*;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void menu(){
        System.out.println("""
                SEJA BEM VINDO AO JAVAFY!, SUA PLATAFORMA PREFERIDA DE MÚSICAS E PODCASTS
                **************************************************************************
                Escolha uma das opções abaixo:
                1 - Inserir um novo título ao catálogo
                2 - Listar os títulos cadastrados por você
                3 - Adicionar algum título para sua lista de favoritos
                4 - Exibir o tempo de reprodução para todos os títulos da lista de favoritos
                5 - Sair do programa
                """);
    }


    public static void main(String[] args) {
        List<Audio> listaDeAudios = new ArrayList<>();
        List<Musica> listaDeMusicas = new ArrayList<>();
        List<Podcast> listaDePodcasts = new ArrayList<>();

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
                            //
                            break;
                        case "2":
                            //
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
                            //
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
