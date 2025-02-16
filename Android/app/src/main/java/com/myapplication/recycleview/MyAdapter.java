package com.myapplication.recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.myapplication.R;
import com.myapplication.RecycleViews;

import java.util.List;

public class MyAdapter  extends RecyclerView.Adapter<MyViewHolder> {
Context context;
List<UserModel> items;

    public MyAdapter(Context context, List<UserModel> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder((LayoutInflater.from(context).inflate(R.layout.recycle_item_view,parent,false)));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
holder.nameView.setText(items.get(position).getName());
holder.emailView.setText(items.get(position).getEmail());
holder.imageView.setImageResource(items.get(position).getImgName());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
