package br.com.paulowalmeida.screen_match.models;

import br.com.paulowalmeida.screen_match.interfaces.Sortable;

public class EpisodeModel implements Sortable {
	private int number;
	private String name;
	private SerieModel serie;
	private int visualizationAmount;

	@Override
	public int getSortable() {
		return visualizationAmount > 100 ? 4 : 2;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SerieModel getSerie() {
		return serie;
	}

	public void setSerie(SerieModel serie) {
		this.serie = serie;
	}

	public int getVisualizationAmount() {
		return visualizationAmount;
	}

	public void setVisualizationAmount(int visualizationAmount) {
		this.visualizationAmount = visualizationAmount;
	}
}
