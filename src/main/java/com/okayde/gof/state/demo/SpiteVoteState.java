package com.okayde.gof.state.demo;

public class SpiteVoteState implements VoteState {
    @Override
    public void vote(String userName, String voteItem, VoteManager voteManager) {
        String s = voteManager.getMapVote().get(userName);
        if (s != null) {
            voteManager.getMapVote().remove(userName);
        }
        System.out.println("SpiteVote");
    }
}
