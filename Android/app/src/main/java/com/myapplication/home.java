package com.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class home extends AppCompatActivity {

    Button btn, notes,fragmentBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);


        //counter app code start
        btn = findViewById(R.id.counterApp);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home.this, MainActivity.class);
                startActivity(intent);
            }
        });
        //counter app code end

        //notes app code start
        notes = findViewById(R.id.notesApp);
        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(home.this, NotesMain.class);
                startActivity(intent);
            }
        });
        //notes app code end

//fragment code start

        fragmentBtn=findViewById(R.id.fragmentBtn);
        fragmentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(home.this, FagmentApp.class);
                startActivity(intent);
            }
        });

// fragment code end

    }

//    @Override
//    public void onClick(View view) {
//        switch (view.getId()) {
//            case R.id.counterApp: {
//                Intent intent = new Intent(home.this, MainActivity.class);
//                startActivity(intent);
//                break;
//            }
//            case R.id.notesApp: {
//                Intent intent = new Intent(home.this, NotesMain.class);
//                startActivity(intent);
//                break;
//            }
//            default: {
//                Toast.makeText(home.this, "sorry we don't have more view page", Toast.LENGTH_SHORT).show();
//                break;
//            }
//
//        }
//    }

}