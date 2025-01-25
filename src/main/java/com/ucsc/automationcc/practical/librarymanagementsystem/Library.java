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

    public void addItemList(List<ItemsType> libraryItemList){
        libraryItems.addAll(libraryItemList);
    }

    public List<ItemsType> getLibraryItems(){
        return libraryItems;
    }

    public void addUser(User user){
        users.add(user);
    }

    public void addUserList(List<User> userList){
        users.addAll(userList);
    }

    public List<User> getAllUsers(){
        return users;
    }

    public void borrowItem(String serialNumber, String username){

        if(!isValidItem(serialNumber)){
            System.out.println("Not a valid serial number");
            return;
        }

        if(isItemAlreadyBorrowed(serialNumber)){
            System.out.printf("Item with serial number %s is already borrowed", serialNumber);
            return;
        }

        if(!isValidUser(username)){
            System.out.printf("%s is not a valid username", username);
            return;
        }

        borrowedItems.put(serialNumber, username);
        System.out.println(username + "successfully borrowed the items with serial " + serialNumber);
    }

    public void loadAllborrowItem(Map<String, String> allBorrowedItems){
        borrowedItems.putAll(allBorrowedItems);
    }

    public Map<String, String> getAllborrowItem(){
        return borrowedItems;
    }

    public void returnBorrowedItem(String serialNumber){
        borrowedItems.remove(serialNumber);
    }

    /**
     *
     * @param serialNumber
     * @return true if valid
     */
    private boolean isValidItem(String serialNumber){
        return libraryItems.stream().filter(item -> item.getSerialNumber().equals(serialNumber)).count() == 1;
    }

    /**
     *
     * @param serialNumber
     * @return true if key contains
     */
    private boolean isItemAlreadyBorrowed(String serialNumber){
        return borrowedItems.containsKey(serialNumber);
    }

    /**
     *
     * @param username
     * @return true if user exist
     */
    private boolean isValidUser(String username){
        return users.stream().filter(user -> user.getUsername().equals(username)).count() == 1;
    }
}
