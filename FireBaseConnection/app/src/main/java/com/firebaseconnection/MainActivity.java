package com.firebaseconnection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
EditText name,password;
Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      name=  findViewById(R.id.name);
      password=  findViewById(R.id.password);
      submit=findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //firebase start
                FirebaseDatabase db=FirebaseDatabase.getInstance();
                //if blank then it reference root node so pass the table name that make collect.
                DatabaseReference root=db.getReference();
                root.setValue(name);
                root.setValue(password);
                //firebase end
                name.setText("");
                password.setText("");
                Toast.makeText(MainActivity.this, "successfully inserted data.", Toast.LENGTH_SHORT).show();
            }
        });

    }
}