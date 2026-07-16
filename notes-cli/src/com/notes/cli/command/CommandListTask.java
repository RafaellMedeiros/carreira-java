package com.notes.cli.command;

import com.notes.cli.model.Task;
import com.notes.cli.repository.ITaskRepository;
import com.notes.cli.view.IView;

import java.util.ArrayList;

public class CommandListTask implements Command {

    ITaskRepository repository;
    IView view;

    public CommandListTask(ITaskRepository repository, IView view) {
        this.repository = repository;
        this.view = view;
    }

    @Override
    public void execute() {
        view.showMessage("Listing tasks");
        ArrayList<Task> tasks = repository.listTasks();
        view.showListTasks(tasks);
    }
}
