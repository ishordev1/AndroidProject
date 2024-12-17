package com.myapplication;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class NotesContentPage extends AppCompatActivity {
    TextView showTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_notescontentpage);

        //set title
        showTitle = findViewById(R.id.title);
        String myTitle = getIntent().getExtras().getString("title");
        showTitle.setText(myTitle);
        WebView webData = findViewById(R.id.webPage);
        WebSettings webSettings = webData.getSettings();
        webSettings.setJavaScriptEnabled(true);
        //if html page has more length page then wideviewport help to show in phone screen only
        webSettings.setUseWideViewPort(false);
        Bundle extra = getIntent().getExtras();
        String url = extra.getString("path");
        webData.loadUrl(url);
    }
}
