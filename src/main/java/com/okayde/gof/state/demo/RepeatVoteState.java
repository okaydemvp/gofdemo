package com.okayde.gof.state.demo;

public class RepeatVoteState implements VoteState {
    @Override
    public void vote(String userName, String voteItem, VoteManager voteManager) {
        System.out.println("RepeatVote");
    }
}
