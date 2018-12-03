package com.example.aoife.groupshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class NewGroup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newgroup);
        Spinner paymentPlan = findViewById( R.id.payment_plan );
        paymentPlan.setAdapter( new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item, Group.PLAN_NAMES ));

    }
}