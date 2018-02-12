package com.okayde.gof.state.demo2;

public class NormalVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        voteManager.getMapVote().put(user, voteItem);
        System.out.println("NormalVoteState");
        voteManager.getMapState().put(user, new RepeatVoteState());
    }
}
