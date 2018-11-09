package com.example.aoife.groupshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.Main);
        //startActivity(new Intent(MainActivity.this, MyGroups.class));
        getGroups();
        startActivity(new Intent(MainActivity.this, MyGroups.class));
    }

    private void getGroups(){
        Group.groupList = new ArrayList<Group>();
    }
}
