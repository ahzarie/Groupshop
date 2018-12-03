package com.example.aoife.groupshop;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ShoppingList extends AppCompatActivity {

    Button addItem;
    Context cont = this;
    private String m_Text = "";
    static Group current = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shoppinglist);

        addItem = findViewById(R.id.additem);


        TextView groupName = (TextView) findViewById( R.id.GroupName_ShoppingList);
        groupName.setText( MyGroups.current.name );

        RecyclerView shoppingList = findViewById( R.id.itemList_ShoppingList );
        shoppingList.setLayoutManager( new LinearLayoutManager( this ) );
        shoppingList.setAdapter( new ItemViewAdaptor( MyGroups.current.shoppingList, getApplicationContext() ) );

        addItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(cont);
                builder.setTitle("Item Information");

                // Set up the input
                final EditText input = new EditText(cont);
                // Specify the type of input expected; this, for example, sets the input as a password, and will mask the text
                input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_CLASS_TEXT);
                builder.setView(input);

                // Set up the buttons
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                         m_Text = input.getText().toString();
                         
                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                builder.show();
            }
        });
    }
}