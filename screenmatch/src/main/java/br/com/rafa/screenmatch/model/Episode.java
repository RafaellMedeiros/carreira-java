package br.com.rafa.screenmatch.model;

import java.time.DateTimeException;
import java.time.LocalDate;

public class Episode {
    private Integer season;
    private String title;
    private Integer numberOfEpisodes;
    private Double rating;
    private LocalDate releaseDate;

    public Episode(Integer number, EpisodeData episodeData) {
        this.season = number;
        this.title = episodeData.title();
        this.numberOfEpisodes = episodeData.number();
        try {
            this.rating = Double.parseDouble(episodeData.rating());
        } catch (NumberFormatException e) {
            this.rating = null;
        }

        try {
            this.releaseDate = LocalDate.parse(episodeData.released());
        } catch (DateTimeException ex) {
            this.releaseDate = null;
        }
    }

    public Integer getSeason() {
        return season;
    }

    public void setSeason(Integer season) {
        this.season = season;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    public void setNumberOfEpisodes(Integer numberOfEpisodes) {
        this.numberOfEpisodes = numberOfEpisodes;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Season: " + season +
                "\nTitle: " + title +" +" +
                "\n NumberOfEpisodes: " + numberOfEpisodes +
                "\n Rating: " + rating +
                "\n ReleaseDate: " + releaseDate;

    }
}
