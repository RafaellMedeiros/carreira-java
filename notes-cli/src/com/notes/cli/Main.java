package com.notes.cli;

import com.notes.cli.command.CommandFactory;
import com.notes.cli.command.ICommandFactory;
import com.notes.cli.controller.TaskController;
import com.notes.cli.repository.ITaskRepository;
import com.notes.cli.repository.TaskRepository;
import com.notes.cli.view.ConsoleView;
import com.notes.cli.view.IView;

public class Main {
    public static void main(String[] args) {
        IView view = new ConsoleView();
        ITaskRepository repository = new TaskRepository();
        ICommandFactory factory = new CommandFactory(repository, view);
        TaskController taskController = new TaskController(view, factory);

        try {
            while (true) taskController.run();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
