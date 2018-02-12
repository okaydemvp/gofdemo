package com.okayde.gof.templatemethod.demo;

public abstract class LoginTemplate {
    public final boolean login(LoginModel lm) {
        LoginModel dbLm = this.findLoginUser(lm.getLoginId());
        if (dbLm != null) {
            String encryptPwd = this.encryptPwd(lm.getPwd());
            lm.setPwd(encryptPwd);
            return this.match(lm, dbLm);
        }
        return false;
    }

    public String encryptPwd(String pwd) {
        return pwd;
    }

    public boolean match(LoginModel lm, LoginModel dbLm) {
        if (lm.getLoginId().equals(dbLm.getLoginId()) && lm.getPwd().equals(dbLm.getPwd())) {
            return true;
        }
        return false;
    }

    public abstract LoginModel findLoginUser(String loginId);
}
