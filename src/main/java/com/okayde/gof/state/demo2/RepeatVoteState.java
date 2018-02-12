package com.okayde.gof.state.demo2;

public class RepeatVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        System.out.println("RepeatVoteState");
        if (voteManager.getMapVoteCount().get(user) >= 4) {
            voteManager.getMapState().put(user, new SpiteVoteState());
        }
    }
}
