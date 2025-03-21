package com.testfirebase;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.testfirebase.RecycleView.MyAdapter;

import java.time.Clock;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton button;
    RecyclerView recyclerView;
    MyAdapter myAdapter;
    List<User> userList;

    DatabaseReference databaseReference; // 🔥 Firebase Database ka Reference

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Firebase Database Reference
        databaseReference = FirebaseDatabase.getInstance().getReference("users"); // 🔥 "users" node ka reference

        // RecyclerView setup
        recyclerView = findViewById(R.id.recycleView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        userList = new ArrayList<>();
        myAdapter = new MyAdapter(getApplicationContext(), userList);
        recyclerView.setAdapter(myAdapter);

        // 🔥 Firebase se data fetch karna
        fetchUsersFromFirebase();

        // Floating Button Setup
        button = findViewById(R.id.button);
        button.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, AddUser.class);
            startActivity(intent);
        });
    }

    private void fetchUsersFromFirebase() {
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                userList.clear(); // Purana data clear karna zaroori hai

                if (snapshot.exists()) {
                    for (DataSnapshot dataSnapshot : snapshot.getChildren()) {
                        User user = dataSnapshot.getValue(User.class); // 🔥 Correct way to fetch data
                        if (user != null) {
                            userList.add(user);
                            Log.d("Firebase Data", "Name: " + user.getEmail() + ", Password: " + user.getPassword());
                        }
                    }
                    myAdapter.notifyDataSetChanged(); // RecyclerView ko update karna
                    Toast.makeText(MainActivity.this, "Data fetched successfully", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "No data found", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(MainActivity.this, "Failed to fetch data: " + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

}
