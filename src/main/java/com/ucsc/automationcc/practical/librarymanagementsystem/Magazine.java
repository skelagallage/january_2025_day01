package com.ucsc.automationcc.practical.librarymanagementsystem;

public class Magazine extends ItemsType{


    public Magazine(String title, String author, String serialNumber) {
        super(title, author, serialNumber);
    }

    @Override
    public void borrowedItem(User user) {

        if (isBorrowed){
            System.out.println("This magazine is already borrowed");
        }else {
            isBorrowed = true;
            System.out.printf("This magazine is successfully borrowed by %s", user.getUsername());
        }
    }
}
