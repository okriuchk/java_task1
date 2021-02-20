package com.oks;

public class Video extends Media implements Playable {
    String resolutionScreen;

    public Video() {
        resolutionScreen = "1500×720";
    }

    public void getResolutionScreen(String resolutionScreen) {
        System.out.println(this.resolutionScreen);
    }

    public void play() {
        System.out.printf("YouTube: Resolution screen of this video is %s\n\n", resolutionScreen);
    }
}
