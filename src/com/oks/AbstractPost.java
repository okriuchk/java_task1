package com.oks;

import java.util.Date;

abstract class AbstractPost {
    String author;
    Date date;
    String message;
    Type typeMessage;

    public void printContent() {
        System.out.printf("Content: author = %s, date = %s, message = %s; this is %s\n", author, date, message, typeMessage);
    }

    public abstract int maxSize(int size);
}


