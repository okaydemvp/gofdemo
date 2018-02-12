package com.okayde.gof.state.demo;

public class NormalVoteState implements VoteState {
    @Override
    public void vote(String userName, String voteItem, VoteManager voteManager) {
        voteManager.getMapVote().put(userName, voteItem);
        System.out.println("NormalVote");
    }
}
