package br.com.paulowalmeida.screen_match.models;

public class SerieModel extends TitleModel {
	private int seasons;
	private int episodesForSeason;
	private int minutesForEpisode;
	private boolean active;

	public int getSeasons() {
		return seasons;
	}

	public void setSeasons(int seasons) {
		this.seasons = seasons;
	}

	public int getEpisodesForSeason() {
		return episodesForSeason;
	}

	public void setEpisodesForSeason(int episodesForSeason) {
		this.episodesForSeason = episodesForSeason;
	}

	public int getMinutesForEpisode() {
		return minutesForEpisode;
	}

	public void setMinutesForEpisode(int minutesForEpisode) {
		this.minutesForEpisode = minutesForEpisode;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public int getTimeDurationInMinutes() {
		return seasons * episodesForSeason * minutesForEpisode;
	}

	public void showResume() {
		super.showResume();
		System.out.println("Temporadas: " + seasons);
		System.out.println("Episódios por Temporada: " + episodesForSeason);
		System.out.println("Minutos por episódio: " + minutesForEpisode);
		System.out.println("Duração total em minutos: " + getTimeDurationInMinutes());
		System.out.println("Está ativa? " + (active ? "Sim" : "Não"));
	}
}
