package com.example.aoife.groupshop;

import java.util.ArrayList;

public abstract class PaymentPlan {

    public PaymentPlan(){}

    public Money sumProducts(ArrayList<Product> products){
        Money sum = new Money();
        for (Product item : products) {
            sum.add( item.price );
        } //End for item:products
        return sum.divide(products.size() );
    } // End sumProducts

    public abstract Money getShare( ArrayList<Product> products );
}
