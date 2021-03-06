package com.okayde.gof.command.demo;

public class ResetCommand implements Command {
    private MainBoardApi mainBoard = null;

    public ResetCommand(MainBoardApi mainBoard) {
        this.mainBoard = mainBoard;
    }

    @Override
    public void execute() {
       mainBoard.reset();
    }
}
