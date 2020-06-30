package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
Button btn;
ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Declare();
        btn_Click();
    }
void Declare(){
        btn=findViewById(R.id.btn);
        img=findViewById(R.id.img);
}
void btn_Click(){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rnd=new Random();
                int rnd_num=rnd.nextInt(3);
                if (rnd_num==1)img.setImageResource(R.drawable.bir);
                else if (rnd_num==2)img.setImageResource(R.drawable.iki);
                else img.setImageResource(R.drawable.uc);
                Toast.makeText(getApplicationContext(),"Picture Chaged !(num "+rnd_num+")",Toast.LENGTH_SHORT).show();
            }
        });
}
}