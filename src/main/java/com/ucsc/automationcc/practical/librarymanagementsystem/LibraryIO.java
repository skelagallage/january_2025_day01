package com.ucsc.automationcc.practical.librarymanagementsystem;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LibraryIO {

    public static void saveItems(List<ItemsType> libraryItems, String fileName) throws IOException {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))){
            oos.writeObject(libraryItems);
        }
    }

    public static List<ItemsType> loadItems(String fileName) throws IOException {

        File file = new File(fileName);
        if(!file.exists()){
            return new ArrayList<>();
        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))){
            return (List<ItemsType>)ois.readObject();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void saveUsers(List<User> users, String fileName) throws IOException {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))){
            oos.writeObject(users);
        }
    }

    public static List<User> loadUsers(String fileName) throws IOException {

        File file = new File(fileName);
        if(!file.exists()){
            return new ArrayList<>();
        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))){
            return (List<User>)ois.readObject();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void saveBorrowedItems(Map<String, String> borrowedItems, String fileName) throws IOException {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))){
            oos.writeObject(borrowedItems);
        }
    }

    public static Map<String, String> loadBorrowedItems(String fileName) throws IOException {

        File file = new File(fileName);
        if(!file.exists()){
            return new HashMap<String, String>();
        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))){
            return (Map<String, String>)ois.readObject();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
