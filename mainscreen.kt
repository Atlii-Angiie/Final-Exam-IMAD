package com.example.finalexaminationimad

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


private operator fun TextView.get(i: Int): String {
    TODO("Not yet implemented")
}

class mainscreen : AppCompatActivity() {
    private val minimumTemperature = IntArray(7)
    private val maximumTemperature = IntArray(7)

    @SuppressLint("MissingInflatedId", "CutPasteId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainscreen)

        val minTemperature = findViewById<EditText>(R.id.txtMinTemperature)
        val maxTemperature = findViewById<EditText>(R.id.txtMaximumTemperature)
        val dayInput = findViewById<EditText>(R.id.txtdayInput)
        val weatherConditions: TextView = findViewById(R.id.txtWeatherCondition)
        val saveButton = findViewById<Button>(R.id.btnSave)
        val ViewDetailsButton = findViewById<Button>(R.id.btnViewDetails)
        val clearButton = findViewById<Button>(R.id.btnClear)
        val exitButton = findViewById<Button>(R.id.btnExit2)



        saveButton.setOnClickListener {
            //Save data input by user
            dayInput.text.toString()
            minimumTemperature[0] = minTemperature.text.toString().toIntOrNull() ?: 0
            maximumTemperature[0] = maxTemperature.text.toString().toIntOrNull() ?: 0
            weatherConditions[0]
            Toast.makeText(this, "Information Saved", Toast.LENGTH_SHORT).show()
                                                           return@setOnClickListener
        }

        clearButton.setOnClickListener {
            //Clear data input by user
            minTemperature.setText("")
            maxTemperature.setText("")
            dayInput.setText("")
            weatherConditions.text = ""
        }

        ViewDetailsButton.setOnClickListener {
            intent = Intent(this, DetailedViewScreen::class.java)
            startActivity(intent)
        }
        exitButton.setOnClickListener {
            finishAffinity()

        }



        }
    }

































