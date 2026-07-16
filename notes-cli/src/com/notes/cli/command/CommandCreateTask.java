package com.notes.cli.command;

import com.notes.cli.model.Task;
import com.notes.cli.repository.ITaskRepository;
import com.notes.cli.view.IView;

public class CommandCreateTask implements Command {

    private final ITaskRepository repository;
    private final IView view;

    public CommandCreateTask(ITaskRepository repository, IView view) {
        this.repository = repository;
        this.view = view;
    }

    @Override
    public void execute() {
        Task task = this.view.showInputTask();
        repository.createTask(task);
    }
}
