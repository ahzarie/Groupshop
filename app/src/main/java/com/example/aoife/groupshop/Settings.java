package com.example.aoife.groupshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class Settings extends AppCompatActivity {

    private static boolean isNightModeEnabled;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);
        Button b9 = (Button) findViewById(R.id.button9);

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Settings.this, About_Group_Shop.class) );
            }
        });
        Switch nightMode = (Switch) findViewById( R.id.nightToggle_settings );

        nightMode.setChecked( isNightModeEnabled );
        nightMode.setOnClickListener( ( event )->{
            isNightModeEnabled = !isNightModeEnabled;
            Toast.makeText(getApplicationContext(), "Night Mode: " + isNightModeEnabled, Toast.LENGTH_LONG).show();
        });
    } //End onCreate

    public static boolean isNightModeOn(){
        return isNightModeEnabled;
    } //End getNightModeOn

    public static void setNightModeDefault(){
        isNightModeEnabled = false;
    }
} //End settings