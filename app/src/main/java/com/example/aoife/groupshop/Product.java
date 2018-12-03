package com.example.aoife.groupshop;

public class Product {
    String name;
    Money price;
    User OriginalAdder;

    public Product( String nameIn, Money priceIn, User userIn ){
        //TODO Change once server intergration is done.
        name = nameIn;
        price = priceIn;
    } //End Constructor (name,price)
} //End Product
