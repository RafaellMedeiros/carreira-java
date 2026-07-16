package com.notes.cli.command;

import com.notes.cli.repository.ITaskRepository;
import com.notes.cli.view.IView;

public class CommandFactory implements ICommandFactory {

    ITaskRepository repository;
    IView view;

    public CommandFactory(ITaskRepository repository, IView view) {
        this.repository = repository;
        this.view = view;
    }

    public Command getCommand(int command) {

        if (command == 0) {
            return new CommandCreateTask(repository, view);
        } else if (command == 1) {
            return new CommandListTask(repository, view);
        }

        return null;
    }
}
