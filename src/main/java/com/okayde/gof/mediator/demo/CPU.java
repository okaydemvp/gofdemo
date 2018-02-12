package com.okayde.gof.mediator.demo;

public class CPU extends Colleague {
    public CPU(Mediator mediator) {
        super(mediator);
    }

    private String videoData = "";
    private String soundData = "";

    public String getVideoData() {
        return videoData;
    }

    public String getSoundData() {
        return soundData;
    }

    public void executeData(String data) {
        String[] ss = data.split(",");
        this.videoData = ss[0];
        this.soundData = ss[1];
        this.getMediator().change(this);
    }
}
