package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Declare();
        View();
    }
    void Declare(){
        wv=findViewById(R.id.web_view);
    }
    void View(){
        wv.getSettings().setJavaScriptEnabled(true);
        wv.loadUrl("https://www.google.com");
    }
}