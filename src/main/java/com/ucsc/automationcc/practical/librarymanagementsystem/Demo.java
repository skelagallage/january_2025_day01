package com.ucsc.automationcc.practical.librarymanagementsystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Demo {

    private static final String LIBRARY_ITEMS_FILE = "libItems.lms";
    private static final String USERS_FILE = "users.lms";
    private static final String BORROWED_ITEMS_FILE = "borrowedItems.lms";

    public static void main(String[] args) throws IOException {
        Library library = new Library();

        System.out.println("Load library items");
        library.addItemList(LibraryIO.loadItems(LIBRARY_ITEMS_FILE));
        library.getLibraryItems().forEach(itemsType -> {
            System.out.println(itemsType.getTitle() + " - " + itemsType.getSerialNumber());
        });
        System.out.println("------------------------------------");

        System.out.println("Load user");
        library.addUserList(LibraryIO.loadUsers(USERS_FILE));
        library.getAllUsers().forEach(user -> {
            System.out.println(user.getUsername());
        });
        System.out.println("------------------------------------");

        System.out.println("Borrowed items");
        library.loadAllborrowItem(LibraryIO.loadBorrowedItems(BORROWED_ITEMS_FILE));
        library.getAllborrowItem().forEach((serialNumber, username) -> {
            System.out.println(serialNumber + " - " + username);
        });
        System.out.println("------------------------------------");


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean exit = false;

        while (!exit){

            System.out.println("Chose an option");
            System.out.println("1. Create an user");
            System.out.println("2. Create an item");
            System.out.println("3. Borrow an item");
            System.out.println("4. Return an item");
            System.out.println("5. Exit");

            int option = Integer.parseInt(br.readLine());
            if(option == 5){
                exit = true;
            } else if (option == 1) {
                System.out.println("What is the username?");
                String username = br.readLine();
                library.addUser(new User(username));
                LibraryIO.saveUsers(library.getAllUsers(), USERS_FILE);
            }
        }


    }
}
