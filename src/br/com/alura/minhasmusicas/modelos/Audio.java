package br.com.alura.minhasmusicas.modelos;

// CLASSE ABSTRATA
public class Audio implements Comparable<Audio>{
    private String titulo;
    private int duracaoMinutos;
    private int anoLancamento;
    private int totalDeVisualizacoes;
    private int curtidas;

    public Audio(String titulo, int duracaoMinutos, int anoDeLancamento){
        this.titulo = titulo;
        this.duracaoMinutos = duracaoMinutos;
        this.anoLancamento = anoDeLancamento;
    }

    // MÉTODO GETTER DO ATRIBUTO TITULO
    public String getTitulo() {
        return titulo;
    }

    // MÉTODO GETTER DO ATRIBUTO DURACAOEMMINUTOS
    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    // MÉTODO GETTER DO ATRIBUTO ANODELANCAMENTO
    public int getAnoLancamento() {
        return anoLancamento;
    }

    // MÉTODO GETTER DO ATRIBUTO TOTALDEVISUALIZACOES
    public int getTotalDeVisualizacoes() {
        return totalDeVisualizacoes;
    }

    // MÉTODO GETTER DO ATRIBUTO CURTIDAS
    public int getCurtidas() {
        return curtidas;
    }

    // MÉTODO QUE VISUALIZA UM OBJETO SUGERIDO PELO USUÁRIO
    public void visualizaramSuaRecomendacao() {
        totalDeVisualizacoes ++;
    }

    // MÉTODO QUE CURTE UM OBJETO SUGERIDO PELO USUÁRIO
    public void curte() {
        curtidas++;
    }

    // ESTRUTURA UTILIZADA PARA CLASSIFICAR UM OBJETO
    public int getClassificacao() {
        return (100 * getCurtidas()) / getTotalDeVisualizacoes();
    }

    // MÉTODO QUE EXIBE A FICHA TÉCNICA DO OBJETO INSTANCIADO DA CLASSE PODCAST
    // TAL MÉTODO SERÁ USADO EM IMPLÈMENTAÇÕES FUTURAS
    public void exibaFicha() {
        System.out.printf("Nome do título: %s %n", getTitulo());
        System.out.printf("Ano de lançamento: %d %n", getAnoLancamento());
        System.out.printf("Duração em minutos: Aproximandamente %d minutos %n", getDuracaoMinutos());
        System.out.printf("Número total de reproduções: %d %n", getTotalDeVisualizacoes());
        System.out.printf("%d pessoas curtiram essa obra %n", getCurtidas());
    }

    // MÉTODO QUE COMPARA OBJETOS DA MESMA CLASSE
    // NESSE CASO ESTAMOS COMPARANDO OS OBJETOS (OBJETOS QUE HERDAM DE AUDIO) DE ACORDO COM A ORDEM ALFABÉTICA
    public int compareTo(Audio outroAudio){
        return this.getTitulo().compareTo(outroAudio.getTitulo());
    }
}
