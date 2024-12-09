package com.myapplication;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class NotesContentPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_notescontentpage);

        WebView webData = findViewById(R.id.webPage);
        WebSettings webSettings = webData.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webData.loadUrl("file:///android_asset/notes1.html");
    }
}
