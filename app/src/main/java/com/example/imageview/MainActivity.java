package com.example.imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Declare();
        btn_Click();
    }
    void Declare(){
        imageView=findViewById(R.id.img);
        btn=findViewById(R.id.btn);
    }
    void btn_Click(){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rand=new Random();
                int rnd=rand.nextInt(5);
                System.out.println(rnd);
                Change(rnd);
            }
        });
    }
    void Change(int sayi){
        if (sayi==1){imageView.setImageResource(R.drawable.bir);}
        else if (sayi==2){imageView.setImageResource(R.drawable.iki);}
        else if (sayi==4) {imageView.setImageResource(R.drawable.dort);}
        else {}
    }
}