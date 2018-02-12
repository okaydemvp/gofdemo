package com.okayde.gof.state.demo2;

public interface VoteState {
    void vote(String user, String voteItem, VoteManager voteManager);
}
