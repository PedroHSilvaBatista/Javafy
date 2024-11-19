package br.com.alura.minhasmusicas.modelos;
import br.com.alura.minhasmusicas.classificacao.*;

public class Podcast extends Audio implements Avaliavel{
    // ATRIBUTOS QUE A CLASSE PODCAST POSSUI ALÉM DOS ATRIBUTOS DA CLASSE AUDIO
    private String host;
    private String descricao;

    // CONSTRUTOR DA CLASSE PODCAST
    public Podcast(String titulo, int duracaoMinutos, int anoDeLancamento, String host, String descricao){
        super(titulo, duracaoMinutos, anoDeLancamento);
        this.host = host;
        this.descricao = descricao;
    }

    // MÉTODO GETTER DO ATRIBUTO HOST
    public String getHost() {
        return host;
    }

    // MÈTODO GETTER DO ATRIBUTO DESCRICAO
    public String getDescricao() {
        return descricao;
    }

    // MÉTODO QUE EXIBE A FICHA TÉCNICA DO OBJETO INSTANCIADO DA CLASSE PODCAST
    // TAL MÉTODO SERÁ USADO EM IMPLÈMENTAÇÕES FUTURAS
    @Override
    public void exibaFicha() {
        System.out.printf("Nome do título: %s %n", getTitulo());
        System.out.printf("Host do programa: %s %n", getHost());
        System.out.printf("Descrição do episódio: %s %n", getDescricao());
        System.out.printf("Ano de lançamento: %d %n", getAnoLancamento());
        System.out.printf("Duração em minutos: Aproximandamente %d minutos %n", getDuracaoMinutos());
        System.out.printf("Número total de reproduções: %d %n", getTotalDeVisualizacoes());
        System.out.printf("%d pessoas curtiram essa obra %n", getCurtidas());
        System.out.printf("Dentre as %d pessoas que escutaram %s, %d por cento curtiram %n", getTotalDeVisualizacoes(),
                getTitulo(), getAvaliacao());
    }

    // MÉTODO QUE IMPLEMENTA A INTERFACE AVALIAVEL
    @Override
    public int getAvaliacao() {
        return getClassificacao();
    }

    // MÉTODO QUE RETORNA UMA REPRESENTAÇÃO EM STRING DO OBJETO CRIADO
    @Override
    public String toString(){
        return this.getTitulo() + " - " + this.getHost();
    }
}
