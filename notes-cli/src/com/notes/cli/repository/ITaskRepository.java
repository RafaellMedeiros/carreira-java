package com.notes.cli.repository;

import com.notes.cli.model.Task;

import java.util.ArrayList;

public interface ITaskRepository {
    void createTask(Task task);
    ArrayList<Task> listTasks();
}
