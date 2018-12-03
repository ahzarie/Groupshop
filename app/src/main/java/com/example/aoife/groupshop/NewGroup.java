package com.example.aoife.groupshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class NewGroup extends AppCompatActivity {

Group newGroup;
PaymentPlan pPlan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newgroup);
        Button createGroup = findViewById(R.id.CreateGroup);
        EditText groupName = findViewById(R.id.GroupName);


        Spinner paymentPlan = findViewById( R.id.payment_newGroups );
        paymentPlan.setAdapter( new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item, Group.PLAN_NAMES ));

        Spinner addUsers = findViewById( R.id.users_newGroups );
        addUsers.setAdapter( new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item, User.contactNames ));
        createGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //newGroup = new Group(groupName.getText().toString(), )
            }
        });
    }
}