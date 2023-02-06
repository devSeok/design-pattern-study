package com.example.demo.singletone;

public class Main {

    public static void main(String[] args) {
        SystemSpeaker systemSpeaker1 = SystemSpeaker.systemSpeaker();
        SystemSpeaker systemSpeaker2 = SystemSpeaker.systemSpeaker();

        System.out.println(systemSpeaker1.getVolume());
        System.out.println(systemSpeaker2.getVolume());

        systemSpeaker1.setVolume(11);

        System.out.println(systemSpeaker1.getVolume());
        System.out.println(systemSpeaker2.getVolume());

        systemSpeaker1.setVolume(12);

        System.out.println(systemSpeaker1.getVolume());
        System.out.println(systemSpeaker2.getVolume());
    }
}
