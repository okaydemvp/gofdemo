package com.okayde.gof.state.demo2;

public class BlackVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        System.out.println("BlackVoteState");
    }
}
