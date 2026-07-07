package br.com.rafa.moveis.models;

import br.com.rafa.moveis.interfaces.Subtitled;

public class Movie extends Title implements Subtitled {

    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public boolean isSubtitled() {
        return false;
    }

    @Override
    public String getLanguage() {
        return "";
    }
}
