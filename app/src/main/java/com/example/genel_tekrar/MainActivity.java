package com.example.genel_tekrar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edtxID;
    EditText edtxPW;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Declare();
        btn_Click();
    }
void Declare(){
        edtxID=findViewById(R.id.txbox1);
        edtxPW=findViewById(R.id.editTextTextPassword2);
        btn=findViewById(R.id.btn1);
}
    void btn_Click(){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String id=edtxID.getText().toString(),pw=edtxPW.getText().toString();
                setContentView(R.layout.main_screen);
            }
        });
    }
}