package com.oks;

public class Audio extends Media implements Playable {
    String format;

    public Audio() {
        format = "MP4";
    }

    public void getFormat(String Format) {
        System.out.println(this.format);
    }

    public void play() {
        System.out.printf("Radio: This song is playing in format %s\n", format);
    }
}

