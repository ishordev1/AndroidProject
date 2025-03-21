package com.testfirebase.RecycleView;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.testfirebase.R;

public class MyViewHolder extends RecyclerView.ViewHolder {
TextView email,password;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        email=itemView.findViewById(R.id.email_id);
        password=itemView.findViewById(R.id.password_Id);

    }
}
