package br.com.paulowalmeida.screen_match.models;

import br.com.paulowalmeida.screen_match.interfaces.Sortable;

public class MovieModel extends TitleModel implements Sortable {
	private String director;

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public void showResume() {
		super.showResume();
		System.out.println("Diretor: " + director);
	}

	@Override
	public int getSortable() {
		return (int) getRating() / 2;
	}
}
