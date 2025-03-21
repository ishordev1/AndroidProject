package com.testfirebase;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.HashSet;

public class AddUser extends AppCompatActivity {
EditText email;
EditText password;
Button button;
    DatabaseReference databaseReference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_user);
      email=findViewById(R.id.email);
      password=findViewById(R.id.password);
      button=findViewById(R.id.btn);
        databaseReference = FirebaseDatabase.getInstance().getReference().child("users");

      button.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              String em=email.getText().toString();
              String pass=password.getText().toString();
              System.out.println(em);
              if (!em.isEmpty() && !pass.isEmpty()){
                  //make sure getter and setter and 2 default, paremetrize constructor are availavel
User user=new User(em,pass);
                  databaseReference.push().setValue(user);
                  Toast.makeText(AddUser.this,"save data",Toast.LENGTH_SHORT).show();
                  System.out.println("user name"+em);
              }
              else{
                  Toast.makeText(AddUser.this,"email and password is null",Toast.LENGTH_SHORT).show();
                  return;
              }



          }
      });


    }
}