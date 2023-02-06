package com.example.demo.singletone;

public class SystemSpeaker {

    static private SystemSpeaker instance;

    private int volume;

    private SystemSpeaker() {
        volume = 5;
    }

    public static SystemSpeaker systemSpeaker() {

        if (instance == null) {
            instance = new SystemSpeaker();
        }

        return instance;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
