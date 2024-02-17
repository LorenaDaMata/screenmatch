package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {
	
	public void filtra(Classificavel classificavel) {
		if (classificavel.getClassificacao() >= 3) {
			System.out.println("Está entre os preferidos do momento");
		} else if (classificavel.getClassificacao() >= 1) {
			System.out.println("Muito bem avaliado no momento!");
		} else {
			System.out.println("Coloque na sua lista para assistir depois");
		}
	}

}
