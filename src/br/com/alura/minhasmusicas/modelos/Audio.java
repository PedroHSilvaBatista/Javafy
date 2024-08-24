package br.com.alura.minhasmusicas.modelos;

public class Audio {
    private String titulo;
    private int duracao;
    private int anoLancamento;
    private int totalDeReproducoes;
    private int curtidas;

    // Estrutura do Título
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Estrutura da Duração
    public int getDuracao () {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    // Estrutura do anolancamento

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    // Estrutura do totalDeReproducoes
    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public void reproduz() {
        totalDeReproducoes ++;
    }

    // Estrutura das curtidas
    public int getCurtidas() {
        return curtidas;
    }

    public void curte() {
        curtidas ++;
    }

    // Estrutura da classificacao

    public int getClassificacao() {
        return (100 * getCurtidas()) / getTotalDeReproducoes();
    }

    // Criando uma ficha de exibição

    public void exibaFicha() {
        System.out.printf("Nome do título: %s %n", getTitulo());
        System.out.printf("Ano de lançamento: %d %n", getAnoLancamento());
        System.out.printf("Duração em minutos: Aproximandamente %d minutos %n", getDuracao());
        System.out.printf("Número total de reproduções: %d %n", getTotalDeReproducoes());
        System.out.printf("%d pessoas curtiram essa obra %n", getCurtidas());
    }
}
