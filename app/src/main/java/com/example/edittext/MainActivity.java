package com.example.edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        deneme();
    }
void deneme(){
    Button btn=findViewById(R.id.btn11);
    final TextView txt=findViewById(R.id.txt1);
    final EditText etx=findViewById(R.id.etx1);
    btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String str=etx.getText().toString();
            txt.setText(str);
            setContentView(R.layout.deneme);
        }
    });
}
}