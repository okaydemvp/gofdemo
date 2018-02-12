package com.okayde.gof.simplefactory;

class ImplA implements Api {
    public void operation(String s) {
        System.out.println("ImplA s==" + s);
    }
}
