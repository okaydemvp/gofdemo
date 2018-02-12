package com.okayde.gof.state.demo3;

public class AuditOverState implements LeaveRequestState {
    @Override
    public void doWork(StateMachine stateMachine) {
        LeaveRequestModel lrm = (LeaveRequestModel) stateMachine.getBussinessVO();
    }
}
