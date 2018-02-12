package com.okayde.gof.state.demo;

public interface VoteState {
    void vote(String userName, String voteItem, VoteManager voteManager);
}
