package com.okayde.gof.state.demo;

public class Client {
    public static void run(){
        VoteManager voteManager =new VoteManager();
        for (int i=0;i<8;i++){
            voteManager.vote("voteManager","A");
        }
    }
}
