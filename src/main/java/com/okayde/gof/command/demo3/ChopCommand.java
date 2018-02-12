package com.okayde.gof.command.demo3;

public class ChopCommand implements Command {
    private CookApi cookApi = null;

    @Override
    public void execute() {
        cookApi.cook("ChopCommand");
    }

    public void setCookApi(CookApi cookApi) {
        this.cookApi = cookApi;
    }
}
