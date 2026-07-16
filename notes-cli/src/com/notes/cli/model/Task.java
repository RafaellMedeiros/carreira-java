package com.notes.cli.model;

import java.util.Date;

public class Task {
    private final String name;
    private final String description;
    private Status status;
    private final Date date;

    public Task(String name, String description) {
        this.name = name;
        this.description = description;
        this.status = Status.NEW;
        this.date = new Date();
    }

    public void setStatus(Status status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "name = " + name + ", description = " + description + ", status = " + status + ", date = " + date;
    }
}
