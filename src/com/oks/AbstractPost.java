package com.oks;

import java.util.Date;

abstract class AbstractPost {
    public String author;
    public Date date;
    public String message;
    public Type typeMessage;

    public void printContent() {
        System.out.printf("Content: author = %s, date = %s, message = %s; this is %s\n", author, date, message, typeMessage);
    }

    public abstract int maxSize(int size);
}


