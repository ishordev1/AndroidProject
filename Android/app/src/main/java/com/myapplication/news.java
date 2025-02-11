package com.myapplication;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class news extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    HomeFragement homeFragement = new HomeFragement();
    Setting settingFragement = new Setting();
    Notification notificationFragement = new Notification();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        bottomNavigationView = findViewById(R.id.bottom_navigation);
        //first open home fragement
        getSupportFragmentManager().beginTransaction().replace(R.id.container, homeFragement).commit();


        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.homeBtn:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, homeFragement).commit();
                        return true;

                    case R.id.notificationBtn:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, notificationFragement).commit();
                        return true;

                    case R.id.settingBtn:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, settingFragement).commit();
                        return true;

                }
                return false;
            }
        });
    }
}