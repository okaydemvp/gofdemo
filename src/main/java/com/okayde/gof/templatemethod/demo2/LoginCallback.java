package com.okayde.gof.templatemethod.demo2;

public interface LoginCallback {
    LoginModel findLoginUser(String loginId);

    String encryptPwd(String pwd, LoginTemplate template);

    boolean match(LoginModel lm, LoginModel dbLm, LoginTemplate template);
}
