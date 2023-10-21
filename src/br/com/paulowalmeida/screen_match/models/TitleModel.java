package br.com.paulowalmeida.screen_match.models;

public class TitleModel {
	private String name;
	private int releaseYear;
	private boolean isIncludeInPlan;
	private double ratingAmount = 0;
	private int ratingCounter = 0;
	private int timeDurationInMinutes;

	public void showResume() {
		System.out.println("Nome: " + name);
		System.out.println("Ano de Lançamento: " + releaseYear);
		System.out.println("Duração: " + timeDurationInMinutes);
		System.out.println("Incluso no plano? " + (isIncludeInPlan ? "Sim" : "Não"));
		System.out.println("Avaliação: " + getRating());
	}

	public void rate(int rate) {
		this.ratingAmount += rate;
		ratingCounter++;
	}

	public double getRating() {
		if (ratingAmount > 0 && ratingCounter > 0) {
			return ratingAmount / ratingCounter;
		} else {
			return 0.0;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public boolean isIncludeInPlan() {
		return isIncludeInPlan;
	}

	public void setIncludeInPlan(boolean isIncludeInPlan) {
		this.isIncludeInPlan = isIncludeInPlan;
	}

	public int getTimeDurationInMinutes() {
		return timeDurationInMinutes;
	}

	public void setTimeDurationInMinutes(int timeDurationInMinutes) {
		this.timeDurationInMinutes = timeDurationInMinutes;
	}
}
