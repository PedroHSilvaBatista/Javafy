package br.com.alura.minhasmusicas.classificacao;

public class FiltroRecomendacao {

    public void filtra(Avaliavel avaliavel) {
        if (avaliavel.getAvaliacao() >= 90 && avaliavel.getAvaliacao() <= 100) {
            System.out.println("O título é um dos mais relevantes no momento!");
        } else if (avaliavel.getAvaliacao() >= 70) {
            System.out.println("Titulo muito bem avaliado!");
        } else {
            System.out.println("Não deixe também de experimentar este título");
        }
    }
}
