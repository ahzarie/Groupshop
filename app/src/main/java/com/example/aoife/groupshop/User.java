package com.example.aoife.groupshop;

import java.util.ArrayList;

public class User {
    public static ArrayList<User> contacts;
    public static String[] contactNames;
    public static User currentUser;

    String name;

    public User (String username ){
        name = username;
    } //End Constructor

    public static void  getContacts(){
        contacts = new ArrayList<User>();
        //Hardcoded contacts list
        contacts.add( new User("Abdulaziz Zarie"));
        contacts.add( new User("Jennie Dallas"));
        contacts.add( new User("Nick Lopez"));
        contacts.add( new User("Silu Shen"));
        contacts.add( new User("Spencer Clark"));
        contacts.add( new User("Trey Tangeman"));
        // Hardcode User
        currentUser = contacts.get(2);
        //End hardcoding
        updateContactNames();
    }// End getContacts

    public static void updateContactNames(){
        contactNames = new String[contacts.size()];
        for (int iter = 0; iter < contacts.size(); iter++ ) {
            contactNames[iter] = contacts.get(iter).name;
        }
    }  //End updateContactNames
}  //End User
