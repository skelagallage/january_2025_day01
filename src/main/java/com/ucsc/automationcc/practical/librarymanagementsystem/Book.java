package com.ucsc.automationcc.practical.librarymanagementsystem;

public class Book extends ItemsType{

    public Book(String title, String author, String serialNumber) {
        super(title, author, serialNumber);
    }

    @Override
    public void borrowedItem(User user) {

        if (isBorrowed){
            System.out.println("This book is already borrowed");
        }else {
            isBorrowed = true;
            System.out.println("This book is successfully borrowed by " + user.getUsername());
        }

    }
}
