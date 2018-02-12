package com.okayde.gof.command.demo2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private Command addCommmand = null;
    private Command substractCommand = null;
    private List<Command> undoCmds = new ArrayList<>();
    private List<Command> redoCmds = new ArrayList<>();

    public void setAddCommmand(Command addCommmand) {
        this.addCommmand = addCommmand;
    }

    public void setSubstractCommand(Command substractCommand) {
        this.substractCommand = substractCommand;
    }

    public void addPressed() {
        addCommmand.execute();
        undoCmds.add(addCommmand);
    }

    public void substractPressed() {
        substractCommand.execute();
        undoCmds.add(substractCommand);
    }

    public void undoPressed() {
        if (undoCmds.size() > 0) {
            Command cmd = undoCmds.get(undoCmds.size() - 1);
            cmd.undo();
            redoCmds.add(cmd);
            undoCmds.remove(cmd);
        } else {
            System.out.println("No UndoCommand");
        }
    }

    public void redoPressed() {
        if (redoCmds.size() > 0) {
            Command cmd = redoCmds.get(redoCmds.size() - 1);
            cmd.execute();
            undoCmds.add(cmd);
            redoCmds.remove(cmd);
        } else {
            System.out.println("No RedoCommand");
        }
    }
}
