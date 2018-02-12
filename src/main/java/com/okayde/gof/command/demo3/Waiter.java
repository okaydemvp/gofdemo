package com.okayde.gof.command.demo3;

public class Waiter {
    private MenuCommand menuCommand = new MenuCommand();

    public void orderDish(Command command) {
        CookApi hotCook = new HotCook();
        CookApi coolCook = new CoolCook();

        if (command instanceof ChopCommand) {
            ((ChopCommand) command).setCookApi(coolCook);
        }
        menuCommand.addCommand(command);
    }

    public void orderOver() {
        menuCommand.execute();
    }
}
