package com.example.onthi;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NameListAdapter extends RecyclerView.Adapter<NameListAdapter.NameViewHolder> {
    private LayoutInflater layoutInflater;
    private ArrayList<String> nameArrayList;
    private Context context;
    @NonNull
    @Override
    public NameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = layoutInflater.inflate(R.layout.namelistitem, parent, false);
        return new NameViewHolder(mItemView,this);
    }
    public  NameListAdapter(Context context, ArrayList<String> nameArrayList){
       layoutInflater = LayoutInflater.from(context);
        this.nameArrayList = nameArrayList;
        this.context = context;
    }
    @Override
    public void onBindViewHolder(@NonNull NameViewHolder holder, int position) {
        final String mCurrent = nameArrayList.get(position);
        holder.nameItemView.setText(mCurrent);
        holder.nameItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, NewActivity.class);
                intent.putExtra("name", mCurrent);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return nameArrayList.size() ;
    }

    public class NameViewHolder extends RecyclerView.ViewHolder{
        public TextView nameItemView;
        NameListAdapter nameListAdapter;
        public  NameViewHolder(@NonNull View itemView, NameListAdapter adapter){
            super(itemView);
            nameItemView = itemView.findViewById(R.id.ttvName);
            this.nameListAdapter = adapter;
        }

    }
}
