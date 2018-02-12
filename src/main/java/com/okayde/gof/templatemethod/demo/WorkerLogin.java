package com.okayde.gof.templatemethod.demo;

public class WorkerLogin extends LoginTemplate {
    @Override
    public LoginModel findLoginUser(String loginId) {
        LoginModel lm = new LoginModel();
        lm.setLoginId(loginId);
        lm.setPwd("workerpwd");
        return lm;
    }

    @Override
    public String encryptPwd(String pwd) {
        System.out.println("WorkerLogin encryptPwd");
        return pwd;
    }
}
