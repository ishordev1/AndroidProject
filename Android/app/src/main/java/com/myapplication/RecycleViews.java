package com.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.myapplication.recycleview.MyAdapter;
import com.myapplication.recycleview.UserModel;

import java.util.ArrayList;
import java.util.List;

public class RecycleViews extends AppCompatActivity {
    RecyclerView recyclerView;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_recycle_views);
        recyclerView=findViewById(R.id.rv);
List<UserModel> list=new ArrayList<UserModel>();
list.add(new UserModel("jhon","jhon@gmail.com",R.drawable.img));
        list.add(new UserModel("ram","jhon@gmail.com",R.drawable.img));
        list.add(new UserModel("shyam","jhon@gmail.com",R.drawable.img));
        list.add(new UserModel("hari","jhon@gmail.com",R.drawable.img));
        list.add(new UserModel("gopal","jhon@gmail.com",R.drawable.img));
        list.add(new UserModel("sitea","jhon@gmail.com",R.drawable.img));


        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(new MyAdapter(getApplicationContext(), list));
    }

}