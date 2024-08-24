package br.com.alura.minhasmusicas.modelos;
import br.com.alura.minhasmusicas.classificacao.*;

public class Podcast extends Audio implements Avaliavel{
    private String host;
    private String descricao;

    public String getHost() {
        return host;
    }

    public void setHost(String autor) {
        this.host = autor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public void exibaFicha() {
        System.out.printf("Nome do título: %s %n", getTitulo());
        System.out.printf("Host do programa: %s %n", getHost());
        System.out.printf("Descrição do episódio: %s %n", getDescricao());
        System.out.printf("Ano de lançamento: %d %n", getAnoLancamento());
        System.out.printf("Duração em minutos: Aproximandamente %d minutos %n", getDuracaoMinutos());
        System.out.printf("Número total de reproduções: %d %n", getTotalDeReproducoes());
        System.out.printf("%d pessoas curtiram essa obra %n", getCurtidas());
        System.out.printf("Dentre as %d pessoas que escutaram %s, %d por cento curtiram %n", getTotalDeReproducoes(),
                getTitulo(), getAvaliacao());
    }

    @Override
    public int getAvaliacao() {
        return getClassificacao();
    }
}
