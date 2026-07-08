package br.com.rafa.moveis;

import br.com.rafa.moveis.interfaces.Subtitled;
import br.com.rafa.moveis.models.Title;

import java.util.ArrayList;

public class View {

    private ArrayList<Title> titles = new ArrayList<Title>();

    public void addTitle(Title title) {
        titles.add(title);
    }

    public void showTitles() {
        for (Title title : this.titles) {
            System.out.println("=============================");
            System.out.println("Title: " + title.getName());
            System.out.println("Year: " + title.getYear());
            if (title instanceof Subtitled subtitled) {
                System.out.println("Subtitled: " + subtitled.getLanguage());
            }
            System.out.println("=============================");
        }
    }
}
