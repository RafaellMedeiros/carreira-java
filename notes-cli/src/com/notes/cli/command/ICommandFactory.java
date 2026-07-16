package com.notes.cli.command;

public interface ICommandFactory {
    public Command getCommand(int command);
}
