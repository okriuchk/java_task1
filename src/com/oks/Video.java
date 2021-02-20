package com.oks;

public class Video extends Media implements Playable {
    String name = "Baikal";
    String nickname = "@NIK";
    String resolutionScreen;

    public Video() {
        resolutionScreen = "1500×720";
    }

    public void getResolutionScreen(String resolutionScreen) {
        System.out.println(this.resolutionScreen);
    }

    public void play() {
        System.out.printf("YouTube: The video about %s was published by user %s; resolution screen is %s\n\n", name, nickname, resolutionScreen);
    }
}
