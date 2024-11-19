package br.com.alura.minhasmusicas.modelos;
import br.com.alura.minhasmusicas.classificacao.*;

public class Musica extends Audio implements Avaliavel{
    // ATRIBUTOS QUE A CLASSE PODCAST POSSUI ALÉM DOS ATRIBUTOS DA CLASSE AUDIO
    private String artista;
    private String album;
    private String genero;

    // CONSTRUTOR DA CLASSE MUSICA
    public Musica(String titulo, int duracaoMinutos, int anoDeLancamento, String artista, String genero, String album){
        super(titulo, duracaoMinutos, anoDeLancamento);
        this.artista = artista;
        this.genero = genero;
        this.album = album;
    }

    // MÉTODO GETTER DO ATRIBUTO ARTISTA
    public String getArtista() {
        return artista;
    }

    // MÉTODO GETTER DO ATRIBUTO ALBUM
    public String getAlbum() {
        return album;
    }

    // MÉTODO GETTER DO ATRIBUTO GENERO
    public String getGenero() {
        return genero;
    }

    // MÉTODO QUE EXIBE A FICHA TÉCNICA DO OBJETO INSTANCIADO DA CLASSE PODCAST
    // TAL MÉTODO SERÁ USADO EM IMPLÈMENTAÇÕES FUTURAS
    @Override
    public void exibaFicha() {
        System.out.printf("Nome do título: %s %n", getTitulo());
        System.out.printf("Artista: %s %n", getArtista());
        System.out.printf("Gênero musical: %s %n", getGenero());
        System.out.printf("Album: %s %n", getAlbum());
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
        return this.getTitulo() + " - " + this.getArtista();
    }
}
