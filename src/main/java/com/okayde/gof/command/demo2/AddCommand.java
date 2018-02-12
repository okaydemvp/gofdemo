package com.okayde.gof.command.demo2;

public class AddCommand implements Command {
    private OperationApi operation = null;
    private int opeNum;

    public AddCommand(OperationApi operation, int opeNum) {
        this.operation = operation;
        this.opeNum = opeNum;
    }

    @Override
    public void execute() {
        operation.add(opeNum);
    }

    @Override
    public void undo() {
        operation.substract(opeNum);
    }
}
