package com.ucsc.automationcc.practical.librarymanagementsystem;

public abstract class ItemsType {

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
}
