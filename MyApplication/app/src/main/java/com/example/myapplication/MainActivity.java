package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView display;
    Button increase,decrease;
    int money=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
      display=findViewById(R.id.textview);
      increase=findViewById(R.id.increase);
      decrease=findViewById(R.id.decrease);

      //this code is execute when click the increase btn
      increase.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
             money+=1;
             //set view
              display.setText(money+" :money");
          }
      });

      decrease.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              //code for decrease btn
              money-=1;
              //set view
              display.setText(money+" :money");
          }
      });


    }

}