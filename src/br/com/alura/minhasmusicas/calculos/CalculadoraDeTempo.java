package br.com.alura.minhasmusicas.calculos;

import br.com.alura.minhasmusicas.modelos.Audio;

public class CalculadoraDeTempo {
    private int tempoEmMinutos;

    public int getTempoEmMinutos(){
        return this.tempoEmMinutos;
    }

    public void somaTempo(Audio audio){
        this.tempoEmMinutos += audio.getDuracaoMinutos();
    }
}
