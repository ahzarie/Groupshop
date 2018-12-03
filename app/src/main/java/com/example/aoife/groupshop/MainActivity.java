package com.example.aoife.groupshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainactivity);
        getGroups();
        User.getContacts();
        //Load default theme
        Settings.setNightModeDefault();
        //startActivity(new Intent(MainActivity.this, MyGroups.class));
        Button myGroups = (Button) findViewById(R.id.groups_main);
        myGroups.setOnClickListener( (view)->{
            startActivity(new Intent(MainActivity.this, MyGroups.class));
        });

        Button settings = (Button) findViewById( R.id.settings_main );
        settings.setOnClickListener( (view)->{
            startActivity( new Intent( MainActivity.this, Settings.class ));
        });
    }

    private void getGroups(){
        Group.groupList = new ArrayList<Group>();
    }
}
