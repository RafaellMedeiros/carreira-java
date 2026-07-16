package com.notes.cli.controller;

import com.notes.cli.command.Command;
import com.notes.cli.command.ICommandFactory;
import com.notes.cli.view.IView;

public class TaskController {
    private final IView view;
    private final ICommandFactory commandFactory;

    public TaskController(IView view, ICommandFactory commandFactory) {
        this.view = view;
        this.commandFactory = commandFactory;
    }

    public void run() {
        try {
            int option = view.askForOption();
            Command command = commandFactory.getCommand(option);
            command.execute();
        } catch (Exception e) {
            view.showError(e.getMessage());
        }
    }
}
