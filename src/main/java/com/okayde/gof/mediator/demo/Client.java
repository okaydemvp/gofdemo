package com.okayde.gof.mediator.demo;

public class Client {
    public static void run() {
        MotherBoard mediator = new MotherBoard();

        CDDriver cdDriver = new CDDriver(mediator);
        CPU cpu = new CPU(mediator);
        VideoCard videoCard = new VideoCard(mediator);
        SoundCard soundCard = new SoundCard(mediator);

        mediator.setCdDriver(cdDriver);
        mediator.setCpu(cpu);
        mediator.setVideoCard(videoCard);
        mediator.setSoundCard(soundCard);

        cdDriver.readCD();
    }
}
