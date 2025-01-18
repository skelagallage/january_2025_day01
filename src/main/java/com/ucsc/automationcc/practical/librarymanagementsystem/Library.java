package com.ucsc.automationcc.practical.librarymanagementsystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {

    List<ItemsType> libraryItems = new ArrayList<>();
    List<User> users = new ArrayList<>();
    Map<String, String> borrowedItems = new HashMap<>();

    public void addItem(ItemsType libraryItem){
        libraryItems.add(libraryItem);
    }

    public List<ItemsType> getLibraryItems(){
        return libraryItems;
    }
}
