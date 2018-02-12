package com.okayde.gof.state.demo3;

public class StateMachine {
    private State state = null;
    private Object bussinessVO = null;

    public void doWork() {
        state.doWork(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Object getBussinessVO() {
        return bussinessVO;
    }

    public void setBussinessVO(Object bussinessVO) {
        this.bussinessVO = bussinessVO;
    }
}
