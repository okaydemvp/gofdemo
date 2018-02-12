package com.okayde.gof.command.demo2;

public class Client {
    public static void run() {
        OperationApi operation = new Operation();
        AddCommand addCommand = new AddCommand(operation, 5);
        SubstractCommand substractCommand = new SubstractCommand(operation, 3);
        Calculator calculator = new Calculator();
        calculator.setAddCommmand(addCommand);
        calculator.setSubstractCommand(substractCommand);

        calculator.addPressed();
        calculator.substractPressed();

        calculator.undoPressed();
        calculator.undoPressed();
        calculator.redoPressed();
        calculator.redoPressed();
    }


}
