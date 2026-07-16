package com.notes.cli.view;

import com.notes.cli.model.Task;

import java.util.ArrayList;

public interface IView {
    public int askForOption();
    public void showMessage(String message);
    public void showError(String message);
    public Task showInputTask();
    public void showListTasks(ArrayList<Task> tasks);
}
