package com.okayde.gof.state.demo3;

public class DepManagerState implements LeaveRequestState {
    @Override
    public void doWork(StateMachine stateMachine) {
        LeaveRequestModel lrm = (LeaveRequestModel) stateMachine.getBussinessVO();
        stateMachine.setState(new AuditOverState());
        stateMachine.doWork();
    }
}
