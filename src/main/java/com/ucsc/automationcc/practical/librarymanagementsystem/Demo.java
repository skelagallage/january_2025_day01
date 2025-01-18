package com.ucsc.automationcc.practical.librarymanagementsystem;

import java.util.List;

public class Demo {

    public static void main(String[] args) {
        Library library = new Library();

        ItemsType book1 = new Book("Book1", "Author1", "Serial1");


        library.addItem(book1);

        List<ItemsType> libraryItems = library.getLibraryItems();
        for(ItemsType item : libraryItems){
            System.out.println(item.getTitle());
        }
    }
}
