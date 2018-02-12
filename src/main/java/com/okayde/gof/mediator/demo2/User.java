package com.okayde.gof.mediator.demo2;

public class User {
    private String userId;
    private String userName;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean dimission() {
        DepUserMediatorImpl mediator = DepUserMediatorImpl.getInstance();
        mediator.deleteDep(userId);
        return true;
    }
}
