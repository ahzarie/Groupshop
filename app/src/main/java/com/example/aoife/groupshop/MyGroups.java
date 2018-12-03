package com.example.aoife.groupshop;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class MyGroups extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mygroups);
        FloatingActionButton addGroup = (FloatingActionButton) findViewById(R.id.newGroup_myGroups);
        RecyclerView groupsCycle = findViewById( R.id.recyclerView_myGroups );


        addGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getApplicationContext(), "I hate unit testing", Toast.LENGTH_LONG).show();
                finish();
                startActivity(new Intent(MyGroups.this, NewGroup.class));
            }
        });

        ArrayList<Group> groupList = Group.groupList;

        RecyclerView.LayoutManager groupsLayout = new LinearLayoutManager(this);
        groupsCycle.setLayoutManager( groupsLayout );

        groupsCycle.setAdapter(new RecycleViewAdaptor( groupList, getApplicationContext() ));
        //addGroup.setOnTouchListener( findViewById(R.id.floatingActionButton3) , Toast.makeText(getApplicationContext(), "Testing Testing 123", Toast.LENGTH_LONG).show());


    }
}