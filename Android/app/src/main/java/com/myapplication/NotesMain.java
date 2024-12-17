package com.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class NotesMain extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn9, btn6, btn7, btn8, btn10, btn11, btn12, btn13, btn14, btn15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_notesmain);

        btn1 = findViewById(R.id.notes1Text);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), NotesContentPage.class);
                intent.putExtra("path", "file:///android_asset/notes1.html");
                intent.putExtra("title", "This is notes 1");
                startActivity(intent);
            }
        });
    }
}