package br.com.rafa.moveis;

import br.com.rafa.moveis.interfaces.Subtitled;
import br.com.rafa.moveis.models.Title;

public class View {

    private Title title;

    public View(Title title) {
        this.title = title;
    }

    public void showTitle() {
        System.out.println("=============================");
        System.out.println("Title: " + title.getName());
        System.out.println("Year: " + title.getYear());
        if (title instanceof Subtitled subtitled) {
            System.out.println("Subtitled: " + subtitled.getLanguage());
        }
        System.out.println("=============================");
    }
}
