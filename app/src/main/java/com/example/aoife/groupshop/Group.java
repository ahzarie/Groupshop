package com.example.aoife.groupshop;

import java.util.ArrayList;

public class Group {
    public static ArrayList<Group> groupList;
    public static final String[] PLAN_NAMES = {"Split Evenly", "By Adder", "Pay Everything"};
    public static final PaymentPlan SPLIT_EVENLY = new PaymentPlan() {
        @Override
        public Money getShare(ArrayList<Product> products) {
            return sumProducts( products ).divide( products.size() );
        }
    };
    public static final PaymentPlan BY_ADDER = new PaymentPlan() {
        @Override
        public Money getShare(ArrayList<Product> products) {
            Money share = new Money();
            for (Product item: products ) {
                if( item.originalAdder == User.currentUser ){
                    share.add( item.price );
                }
            }
            return share;
        }
    };
    public static final PaymentPlan PAY_ALL = new PaymentPlan() {
        @Override
        public Money getShare(ArrayList<Product> products) {
            return sumProducts( products );
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
