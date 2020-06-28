package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_click_me = findViewById<Button>(R.id.button) as Button
        val text = findViewById<TextView>(R.id.text) as TextView
        btn_click_me.setOnClickListener {
            text.setText("Tıklandı.")
            Toast.makeText(applicationContext, "Tıklandı.", Toast.LENGTH_LONG).show()
        }
    }
}