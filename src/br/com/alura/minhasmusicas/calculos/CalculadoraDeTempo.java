package br.com.alura.minhasmusicas.calculos;

import br.com.alura.minhasmusicas.modelos.Audio;

// CLASSE QUE CALCULA O TEMPO DE REPRODUÇÃO DE CADA OBJETO INSTANCIADO PELO USUÁRIO E QUE ESTEJA ARMAZENADA NA LISTA DE FAVORITOS
public class CalculadoraDeTempo {
    // ATRIBUTO QUE A CLASSE POSSUI
    private int tempoEmMinutos;

    // MÉTODO GETTER DO ATRIBUTO TEMPOEMMINUTOS
    public int getTempoEmMinutos(){
        return this.tempoEmMinutos;
    }

    // MÉTODO QUE SOMA A DURAÇÃO EM MINUTOS DE CADA OBJETO DA LISTA DE FAVORITOS
    public void somaTempo(Audio audio){
        this.tempoEmMinutos += audio.getDuracaoMinutos();
    }
}
