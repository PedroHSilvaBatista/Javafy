package br.com.alura.minhasmusicas.classificacao;

public class FiltroRecomendacao {

    // CLASSE QUE SIMULA E IMPRIME A AVALIAÇÃO DE UM TÍTULO SUGERIDO PELO USUÁRIO
    public void filtra(Avaliavel avaliavel) {
        if (avaliavel.getAvaliacao() >= 90 && avaliavel.getAvaliacao() <= 100) {
            System.out.println("O título sugerido por você fez sucesso e é está entre os mais cutidos da plataforma");
        } else if (avaliavel.getAvaliacao() >= 70) {
            System.out.println("O título sugerido por você é muito bem avaliado na plataforma!");
        } else {
            System.out.println("O título sugerido por você ainda não impactou um grande número de pesoas");
        }
    }
}
