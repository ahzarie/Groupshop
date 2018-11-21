package com.example.aoife.groupshop;

import java.util.ArrayList;

public abstract class PaymentPlan {

    public PaymentPlan(){}

    public abstract Money sumProducts(ArrayList<Product> products);
}
