package com.okayde.gof.templatemethod.demo;

public class Client {
    public static void run() {
        LoginModel lm = new LoginModel();
        lm.setLoginId("admin");
        lm.setPwd("workerpwd");

        LoginTemplate loginTemplate1 = new WorkerLogin();
        LoginTemplate loginTemplate2 = new NormalLogin();

        boolean flag = loginTemplate1.login(lm);
        System.out.println("WorkerLogin");

        boolean flag2 = loginTemplate2.login(lm);
        System.out.println("NormalLogin");
    }
}
