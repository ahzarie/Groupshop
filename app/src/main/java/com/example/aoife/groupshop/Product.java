package com.example.aoife.groupshop;

public class Product {
    String name;
    Money price;
    User originalAdder;

    public Product( String nameIn, Money priceIn, User userIn ){
        //TODO Change once server intergration is done.
        name = nameIn;
        price = priceIn;
        originalAdder = userIn;

    }//End Constructor (name,price)


    // product name getter
    public String getName() {
        return name;
    }

    // getting price of item from money class
    public String getPrice(){
        return price.toString();

    }

    // getting the money class
    public Money getMoney(){
        return price;
    }

    // getting the author name
    public String getAuthor(){
        return originalAdder.getName();
    }
} //End Product
