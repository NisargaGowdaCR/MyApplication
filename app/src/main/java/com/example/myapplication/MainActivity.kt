package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bt = findViewById<Button>(R.id.buttons)
       val tax2 = findViewById<EditText>(R.id.Phnum)
        val result = Intent(this, MainActivity2 ::class.java)
        val tex = findViewById<EditText>(R.id.texts)
        bt.setOnClickListener {
            if(tex.text != null && tax2.text != null){
                  val display = tex.text
                  val dis2 = tax2.text
                result.putExtra("text",dis2.toString())
                result.putExtra("text1",display.toString())
                startActivity(result)
                println(display)
                println(dis2)
                
            }
        }
    }
}