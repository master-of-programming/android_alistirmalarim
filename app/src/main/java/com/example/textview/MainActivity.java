package com.example.textview;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            tanımla();
            goster("Ömer");
    }
    private void tanımla(){
        txt=findViewById(R.id.text1);
    }
    private void goster(String kul_adi){
        txt.setText(kul_adi);
    }
}
