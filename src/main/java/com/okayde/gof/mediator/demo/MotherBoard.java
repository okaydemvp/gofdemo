package com.okayde.gof.mediator.demo;

public class MotherBoard implements Mediator {
    private CDDriver cdDriver = null;
    private CPU cpu = null;
    private VideoCard videoCard = null;
    private SoundCard soundCard = null;

    public void change(Colleague colleague) {
        if (colleague == cdDriver) {
            this.openCDDriverReadData((CDDriver) colleague);
        } else if (colleague == cpu) {
            this.openCPU((CPU) colleague);
        }
    }

    public void setCdDriver(CDDriver cdDriver) {
        this.cdDriver = cdDriver;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }

    public void setSoundCard(SoundCard soundCard) {
        this.soundCard = soundCard;
    }

    private void openCDDriverReadData(CDDriver cdDriver) {
        String data = cdDriver.getData();
        this.cpu.executeData(data);
    }

    private void openCPU(CPU cpu) {
        String videoData = cpu.getVideoData();
        String soundData = cpu.getSoundData();
        this.videoCard.showData(videoData);
        this.soundCard.soundData(soundData);
    }
}
