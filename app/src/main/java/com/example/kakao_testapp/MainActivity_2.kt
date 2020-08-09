package com.example.kakao_testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity_2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //layout
        val btn_Login = findViewById<Button>(R.id.btn_Login)
        btn_Login.setOnClickListener {

        }

    }
}