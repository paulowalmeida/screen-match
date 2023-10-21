package br.com.paulowalmeida.screen_match;

import br.com.paulowalmeida.screen_match.calculators.RecommendationFilter;
import br.com.paulowalmeida.screen_match.calculators.TimeCalculator;
import br.com.paulowalmeida.screen_match.models.EpisodeModel;
import br.com.paulowalmeida.screen_match.models.MovieModel;
import br.com.paulowalmeida.screen_match.models.SerieModel;

public class App {
    public static void main(String[] args) throws Exception {
        MovieModel movie = new MovieModel();
        movie.setName("O Poderoso Chefão");
        movie.setReleaseYear(1970);
        movie.setTimeDurationInMinutes(180);
        movie.rate(5);
        movie.setIncludeInPlan(true);

        // movie.showResume();
        movie.rate(10);
        movie.showResume();

        System.out.println();

        SerieModel serie = new SerieModel();
        serie.setName("Lost");
        serie.setActive(false);
        serie.setReleaseYear(2000);
        serie.setSeasons(10);
        serie.setEpisodesForSeason(10);
        serie.setMinutesForEpisode(40);
        serie.showResume();

        System.out.println();

        TimeCalculator calculator = new TimeCalculator();
        calculator.addTime(movie);
        calculator.addTime(serie);
        calculator.showAmountTime();

        EpisodeModel episode = new EpisodeModel();
        episode.setName("Piloto");
        episode.setNumber(1);
        episode.setSerie(serie);
        episode.setVisualizationAmount(3000);

        RecommendationFilter filter = new RecommendationFilter();
        filter.filter(movie);
        filter.filter(episode);
    }
}
