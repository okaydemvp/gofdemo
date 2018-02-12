package com.okayde.gof.mediator.demo;

public class SoundCard extends Colleague {
    public SoundCard(Mediator mediator) {
        super(mediator);
    }

    public void soundData(String data) {
        System.out.println("SoundCard:" + data);
    }
}
