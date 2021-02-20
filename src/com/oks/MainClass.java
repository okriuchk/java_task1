package com.oks;

import java.util.Date;

public class MainClass {
    public static void main(String[] args) {

        TextPost t = new TextPost();
        t.author = "Иван";
        t.date = new Date();
        t.message = "Привет!";
        t.typeMessage = Type.POST;
        t.printOut();

        Picture p = new Picture();
        p.author = "Sidorov";
        p.date = new Date();
        p.message = "LOKO";
        p.typeMessage = Type.REPOST;
        p.printOut();

        Audio a = new Audio();
        a.author = "RHCP";
        a.date = new Date();
        a.message = "Californication";
        a.typeMessage = Type.COMMENT;
        a.play();

        Video v = new Video();
        v.author = "user @NIK";
        v.date = new Date();
        v.message = "Baikal";
        v.typeMessage = Type.POST;
        v.play();

        AbstractPost[] array = new AbstractPost[4];
        array[0] = t;
        array[1] = p;
        array[2] = a;
        array[3] = v;

        for (AbstractPost element : array)
            element.printContent();
    }
}







