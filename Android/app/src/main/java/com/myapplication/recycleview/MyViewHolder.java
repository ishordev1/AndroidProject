package com.myapplication.recycleview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.myapplication.R;

public class MyViewHolder extends RecyclerView.ViewHolder{
ImageView imageView;
TextView nameView,emailView;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        this.imageView = itemView.findViewById(R.id.img);
        this.nameView = itemView.findViewById(R.id.name);
        this.emailView = itemView.findViewById(R.id.email);
    }
}
