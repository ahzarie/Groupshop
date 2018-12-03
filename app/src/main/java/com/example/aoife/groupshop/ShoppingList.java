package com.example.aoife.groupshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ListView;
import android.widget.TextView;

public class ShoppingList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shoppinglist);

        TextView groupName = (TextView) findViewById( R.id.GroupName_ShoppingList);
        groupName.setText( MyGroups.current.name );

        RecyclerView shoppingList = findViewById( R.id.itemList_ShoppingList );
        shoppingList.setLayoutManager( new LinearLayoutManager( this ) );
        shoppingList.setAdapter( new ItemViewAdaptor( MyGroups.current.shoppingList, getApplicationContext() ) );
    }
}