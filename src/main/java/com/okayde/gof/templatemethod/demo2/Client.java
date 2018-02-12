package com.okayde.gof.templatemethod.demo2;

public class Client {
    public static void run() {
        LoginModel lm = new LoginModel();
        lm.setLoginId("admin");
        lm.setPwd("workerpwd");

        LoginTemplate loginTemplate = new LoginTemplate();
        boolean flag = loginTemplate.login(lm, new LoginCallback() {
            @Override
            public LoginModel findLoginUser(String loginId) {
                LoginModel lm = new LoginModel();
                lm.setLoginId(loginId);
                lm.setPwd("workerpwd");
                return null;
            }

            @Override
            public String encryptPwd(String pwd, LoginTemplate template) {
                return template.encryptPwd(pwd);
            }

            @Override
            public boolean match(LoginModel lm, LoginModel dbLm, LoginTemplate template) {
                return template.match(lm, dbLm);
            }
        });

        System.out.println(flag);
    }
}
