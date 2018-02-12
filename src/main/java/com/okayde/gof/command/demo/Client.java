package com.okayde.gof.command.demo;

public class Client {
    public static void run() {
        MainBoardApi mainBoard = new GigaMainBoard();
        OpenCommand openCommand = new OpenCommand(mainBoard);
        ResetCommand resetCommand = new ResetCommand(mainBoard);

        Box box = new Box();
        box.setOpenCommand(openCommand);
        box.setResetCommand(resetCommand);

        box.openButtonPressed();
        box.resetButtonPressed();
    }
}
