package com.example.task71

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.createNewAdvert).setOnClickListener {
            startActivity(Intent(this,CreateNew::class.java))
        }

        findViewById<Button>(R.id.showAllItems).setOnClickListener {
            startActivity(Intent(this,ShowAllAdvert::class.java))
        }
    }
}