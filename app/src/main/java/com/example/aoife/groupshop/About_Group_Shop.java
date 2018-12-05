package com.example.aoife.groupshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class About_Group_Shop extends AppCompatActivity {

    TextView about;
    String aboutText = "Groupshop is an application that will change your idea of grocery shopping with your roommates, party plannars, and families. \n" +
            "Create a group and share the shopping list with your family or roommates so all of you can edit the shopping list and new stuff wherever needed. \n" +
            "\nCreated by Team Undecided.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about__group__shop);

        about = findViewById(R.id.aboutGroceryShop);

        about.setText(aboutText);

    }
}
