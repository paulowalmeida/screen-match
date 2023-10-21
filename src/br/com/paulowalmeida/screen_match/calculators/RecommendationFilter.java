package br.com.paulowalmeida.screen_match.calculators;

import br.com.paulowalmeida.screen_match.interfaces.Sortable;

public class RecommendationFilter {
	public void filter(Sortable sortable) {
		System.out.println(sortable);
		if (sortable.getSortable() >= 4) {
			System.out.println("Está entre os preferidos do momento");
		} else if (sortable.getSortable() >= 2) {
			System.out.println("Muito bem avaliado no momento");
		} else {
			System.out.println("Coloque na sua lista para ver depois.");
		}
	}
}
