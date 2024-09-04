package com.evergent.CoreJAVA.Mythili.Application5;
//Abstract Class representing EBook

abstract public class EBook {
    protected String title;
    protected int sizeInMB;

    EBook(String title, int sizeInMB) {
        this.title = title;
        this.sizeInMB = sizeInMB;
    }

    abstract void download();

}
