package com.oks;

public class Picture extends Media implements Printable {
    int width = 10;
    int height = 10;

    public static int calcSizePX(int width, int height) {
        return width * height;
    }

    @Override
    public void printOut() {
        System.out.printf("Image: The quality of this image = %s px\n", width * height);
    }
}

