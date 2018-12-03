package com.example.aoife.groupshop;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class ItemViewAdaptor extends RecyclerView.Adapter<ItemViewAdaptor.ItemNameViewHolder> {
    ArrayList<Product> itemList;
    Context context;

    public static class ItemNameViewHolder extends RecyclerView.ViewHolder{
        public TextView itemNameView;
        public ItemNameViewHolder( TextView view ){
            super(view);
            itemNameView = view;
        }
    }

    public ItemViewAdaptor(ArrayList<Product> items, Context contextIn ) {
        itemList = items;
        context = contextIn;
    }// End Constructor

    @Override
    public ItemViewAdaptor.ItemNameViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        return new ItemViewAdaptor.ItemNameViewHolder( new TextView( viewGroup.getContext() ) );
    }// onCreateViewHolder

    @Override
    public void onBindViewHolder(ItemViewAdaptor.ItemNameViewHolder viewHolder, int index) {
        viewHolder.itemNameView.setText( itemList.get( index ).name );
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }
}
