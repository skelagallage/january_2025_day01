package com.ucsc.automationcc.practical.librarymanagementsystem;

import java.io.Serializable;

public abstract class ItemsType implements Serializable {

    private String title;
    private String author;
    private String serialNumber;
    protected boolean isBorrowed;

    public ItemsType(String title, String author, String serialNumber) {
        this.title = title;
        this.author = author;
        this.serialNumber = serialNumber;
        this.isBorrowed = false;
    }

    public abstract void borrowedItem(User user);

    public String getTitle() {
        return title;
    }

    public String getSerialNumber() {
        return serialNumber;
    }
}
