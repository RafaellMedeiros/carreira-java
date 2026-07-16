package com.notes.cli.repository;

import com.notes.cli.model.Task;
import java.util.ArrayList;

public class TaskRepository implements ITaskRepository{

    ArrayList<Task> tasks =  new ArrayList<>();

    @Override
    public void createTask(Task task) {
        tasks.add(task);
    }

    @Override
    public ArrayList<Task> listTasks() {
        return tasks;
    }
}
