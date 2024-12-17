package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class calculator extends AppCompatActivity {

    EditText n1, n2;
    Button add, sub, mul, div;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_calculator);

        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
        result = findViewById(R.id.ans);

        // Add
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int a = Integer.parseInt(n1.getText().toString());
                    int b = Integer.parseInt(n2.getText().toString());
                    result.setText("Result: " + (a + b));
                } catch (NumberFormatException e) {
                    result.setText("Invalid input");
                }
            }
        });

        // Sub
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int a = Integer.parseInt(n1.getText().toString());
                    int b = Integer.parseInt(n2.getText().toString());
                    result.setText("Result: " + (a - b));
                } catch (NumberFormatException e) {
                    result.setText("Invalid input");
                }
            }
        });

        // Mul
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int a = Integer.parseInt(n1.getText().toString());
                    int b = Integer.parseInt(n2.getText().toString());
                    result.setText("Result: " + (a * b));
                } catch (NumberFormatException e) {
                    result.setText("Invalid input");
                }
            }
        });

        // Div
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int a = Integer.parseInt(n1.getText().toString());
                    int b = Integer.parseInt(n2.getText().toString());
                    if (b != 0) {
                        result.setText("Result: " + (a / b));
                    } else {
                        result.setText("Division by zero is not allowed");
                    }
                } catch (NumberFormatException e) {
                    result.setText("Invalid input");
                }
            }
        });
    }
}
