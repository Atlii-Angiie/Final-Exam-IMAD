package com.example.finalexaminationimad

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val nextButton = findViewById<Button>(R.id.btnNext)
        val exitButton = findViewById<Button>(R.id.btnExit2)

        nextButton.setOnClickListener {
            intent = Intent(this, mainscreen::class.java)
            startActivity(intent)
        }
        exitButton.setOnClickListener {
            finishAffinity() //This will close the app completely

        }
    }
}