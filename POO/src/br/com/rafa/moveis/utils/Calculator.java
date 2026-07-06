package br.com.rafa.moveis.utils;

import br.com.rafa.moveis.models.Title;

public class Calculator {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

    public void incluid(Title title) {
        System.out.println("Titulo: " + title.getName());
        System.out.println("Duração: " + title.getDurationInMinutes());
        totalTime += title.getDurationInMinutes();
    }
}
