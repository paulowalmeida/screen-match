package br.com.paulowalmeida.screen_match.calculators;

import br.com.paulowalmeida.screen_match.models.TitleModel;

public class TimeCalculator {
	private int amountTime;

	public void addTime(TitleModel title) {
		System.out.println(title);
		System.out.println("tempo em minutos: " + title.getTimeDurationInMinutes());
		this.amountTime += title.getTimeDurationInMinutes();
	}

	public void showAmountTime() {
		System.out.println("Tempo total dos títulos: " + this.amountTime);
	}

	public int getAmountTime() {
		return this.amountTime;
	}
}
