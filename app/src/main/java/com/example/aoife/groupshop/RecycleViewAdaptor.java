package com.example.aoife.groupshop;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class RecycleViewAdaptor extends RecyclerView.Adapter<RecycleViewAdaptor.GroupNameViewHolder> {
    private ArrayList<Group> groupList;
    private Context context;

    public static class GroupNameViewHolder extends RecyclerView.ViewHolder{
        public TextView groupNameView;
        public GroupNameViewHolder( TextView view ){
            super(view);
            groupNameView = view;
        }
    }

    public RecycleViewAdaptor(ArrayList<Group> groups, Context contextIn ) {
        groupList = groups;
        context = contextIn;
    }// End Constructor

    @Override
    public RecycleViewAdaptor.GroupNameViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        return new GroupNameViewHolder( new TextView( viewGroup.getContext() ) );
    }
    @Override
    public void onBindViewHolder(GroupNameViewHolder viewHolder, int index) {
        viewHolder.groupNameView.setText( groupList.get( index ).name );
    }

    @Override
    public int getItemCount() {
        return groupList.size();
    }
}

