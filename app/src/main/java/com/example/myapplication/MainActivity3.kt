package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val res = Intent(this,MainActivity::class.java)
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(res)
            finish()
        },3000)

    }
}