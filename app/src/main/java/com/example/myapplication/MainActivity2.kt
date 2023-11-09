package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val textdp = intent.getStringExtra("text")
         val distext = findViewById<TextView>(R.id.textsView)
        distext.text = textdp

        val tex2 = intent.getStringExtra("text1")
        val dis2 = findViewById<TextView>(R.id.dp2)

        dis2.text = tex2


    }
}