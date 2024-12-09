package com.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Button btn =findViewById(R.id.btnChange);
        TextView txt=findViewById(R.id.txtName);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                txt.setText(""+(++count));
            }
        });

    }
}