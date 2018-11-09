package com.example.aoife.groupshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.widget.Toast;


public class MyGroups extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mygroups);
        FloatingActionButton addGroup = (FloatingActionButton) findViewById(R.id.floatingActionButton3);

        addGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "I hate unit testing", Toast.LENGTH_LONG).show();
                startActivity(new Intent(MyGroups.this, NewGroup.class));
            }
        });

        //addGroup.setOnTouchListener( findViewById(R.id.floatingActionButton3) , Toast.makeText(getApplicationContext(), "Testing Testing 123", Toast.LENGTH_LONG).show());


    }
}