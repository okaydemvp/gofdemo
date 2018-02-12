package com.okayde.gof.command.demo;

public class Box {
    private Command openCommand = null;
    private Command resetCommand = null;

    public void setOpenCommand(Command openCommand) {
        this.openCommand = openCommand;
    }

    public void openButtonPressed() {
        openCommand.execute();
    }

    public void resetButtonPressed() {
        resetCommand.execute();
    }

    public void setResetCommand(Command resetCommand) {
        this.resetCommand = resetCommand;
    }
}
