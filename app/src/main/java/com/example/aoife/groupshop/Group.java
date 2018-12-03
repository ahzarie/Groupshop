package com.example.aoife.groupshop;

import java.util.ArrayList;

public class Group {
    public static ArrayList<Group> groupList;
    public static final String[] PLAN_NAMES = {"Split Evenly", "By Adder", "All Pay"};
    public static final PaymentPlan SPLIT_EVENLY = new PaymentPlan() {
        @Override
        public Money getShare(ArrayList<Product> products) {
            return sumProducts( products ).divide( products.size() );
        }
    };

    String name;
    PaymentPlan plan;
    ArrayList shoppingList = new ArrayList<Product>();

    public Group(String groupName, PaymentPlan payPlan){
        name = groupName;
        plan = payPlan;
    }
}
