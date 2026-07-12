package br.com.rafa.moveis.models;

import br.com.rafa.moveis.interfaces.Language;
import br.com.rafa.moveis.interfaces.Subtitled;

import java.util.Objects;

public class Movie extends Title implements Subtitled {

    public Movie() {
    }

    public Movie(TitleOmdb myTitleOmdb) {
        super(myTitleOmdb);
    }

    Language language;

    public void setLanguage(Language language) {
        this.language = language;
    }

    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public boolean isSubtitled() {
        return !Objects.equals(language.toString(), "");
    }

    @Override
    public Language getLanguage() {
        return language;
    }
}
