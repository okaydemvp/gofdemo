package com.okayde.gof.state.demo3;

public class ProjectManagerState implements LeaveRequestState {
    @Override
    public void doWork(StateMachine stateMachine) {
        LeaveRequestModel lrm = (LeaveRequestModel) stateMachine.getBussinessVO();
        if ("OK".equals(lrm.getResult())) {
            if (lrm.getLeaveDays() > 3) {
                stateMachine.setState(new DepManagerState());
                stateMachine.doWork();
            } else {
                stateMachine.setState(new AuditOverState());
                stateMachine.doWork();
            }
        }else {
            stateMachine.setState(new AuditOverState());
            stateMachine.doWork();
        }
    }
}
