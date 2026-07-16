package com.notes.cli.view;

import com.notes.cli.model.Task;

import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleView implements IView {
    private final Scanner scanner = new Scanner(System.in);

    public int askForOption() {
        showBanner();
        showMenu();
        System.out.println("Enter your choice: ");
        return readOption();
    }

    private void showBanner() {
        System.out.println("  _   _       _               ____ _     ___ \n" +
                " | \\ | | ___ | |_ ___  ___   / ___| |   |_ _|\n" +
                " |  \\| |/ _ \\| __/ _ \\/ __| | |   | |    | | \n" +
                " | |\\  | (_) | ||  __/\\__ \\ | |___| |___ | | \n" +
                " |_| \\_|\\___/ \\__\\___||___/  \\____|_____|___|\n" +
                "                                             ");
    }

    private void showMenu() {
        System.out.println("------------------------------------------------------------------");
        System.out.println("0 - Create Task");
        System.out.println("1 - List Task");
    }

    private Integer readOption() {
        return Integer.parseInt(scanner.nextLine());
    }

    public void showError(String error) {
        System.out.println("Error: " + error);
    }

    @Override
    public Task showInputTask() {
        System.out.println("Enter task name: ");
        String name = scanner.nextLine();
        System.out.println("Enter task description: ");
        String description = scanner.nextLine();
        return new Task(name, description);
    }

    public void showMessage(String message) {
        System.out.println(message);
    }

    public void showListTasks(ArrayList<Task> tasks) {
        showMessage("-----------------------------------------");
        if (tasks.isEmpty()) {
            showMessage("No tasks found");
            return;
        }

        showMessage("***************************************************");
        for (Task task : tasks) {
            showMessage("-----------------------------------------");
            showMessage(task.toString());
        }
        showMessage("***************************************************");
    }
}
