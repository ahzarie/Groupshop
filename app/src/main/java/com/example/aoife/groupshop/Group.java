package com.example.aoife.groupshop;

import java.util.ArrayList;

public class Group {
    public static ArrayList<Group> groupList;

    String name;
    PaymentPlan plan;
    ArrayList shoppingList = new ArrayList<Product>();

    public Group(String groupName, PaymentPlan payPlan){
        name = groupName;
        plan = payPlan;
    }
}
