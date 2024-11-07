package br.com.alura.minhasmusicas.modelos;
import br.com.alura.minhasmusicas.classificacao.*;

public class Musica extends Audio implements Avaliavel{
    private String artista;
    private String album;
    private String genero;

    public Musica(String titulo, int duracaoMinutos, int anoDeLancamento, String artista, String genero, String album){
        super(titulo, duracaoMinutos, anoDeLancamento);
        this.artista = artista;
        this.genero = genero;
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public void exibaFicha() {
        System.out.printf("Nome do título: %s %n", getTitulo());
        System.out.printf("Artista: %s %n", getArtista());
        System.out.printf("Gênero musical: %s %n", getGenero());
        System.out.printf("Album: %s %n", getAlbum());
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

    @Override
    public String toString(){
        return this.getTitulo() + "- " + this.getArtista();
    }
}
