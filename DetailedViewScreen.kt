package com.example.finalexaminationimad

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class DetailedViewScreen : AppCompatActivity() {
    private lateinit var minimumTemperature: IntArray
    private lateinit var maximumTemperature: IntArray
    private lateinit var weatherConditions: Array<String>

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed_view_screen)

        val btnBack: Button = findViewById(R.id.btnBack)
        val txtviewedDetails: TextView = findViewById(R.id.txtviewed)
        val weatherconditions: TextView = findViewById(R.id.weatherconditon)
        val txtAverageTemperature: TextView = findViewById(R.id.txtAverageTemperature)

        //Retrieve the arrays from the intent
        minimumTemperature = intent.getIntArrayExtra("minimumTemperatureArray") ?: IntArray(0)
        maximumTemperature = intent.getIntArrayExtra("maximumTemperatureArray") ?: IntArray(0)
        weatherConditions = intent.getStringArrayExtra("weatherConditionsArray") ?: arrayOf()

        val details = StringBuilder()
        val notes = StringBuilder()
        var TotalWeatherTemperature = 0
        val dayCount = minimumTemperature.size

        for (i in  minimumTemperature.indices) {
            val dailyTotal =  minimumTemperature[i] + maximumTemperature[i]
            TotalWeatherTemperature += dailyTotal
            details.append("Day ${i + 1}: \n")
            details.append("Minimum: ${minimumTemperature[i]} ")
            details.append("Maximum: ${maximumTemperature[i]} ")
            details.append("Notes: ${weatherConditions[i]}\n")
            details.append("Total: $dailyTotal minutes\n\n")
            notes.append("Day ${i + 1}: ${weatherConditions[i]}\n\n")
        }
        val AverageTemperature = if (dayCount > 0) TotalWeatherTemperature / dayCount else TODO()
        txtAverageTemperature.text = "Average Temperture $AverageTemperature minutes"
        txtviewedDetails.text = details.toString()
        weatherconditions.text = notes.toString() //Set the text of the new TextView



        btnBack.setOnClickListener {
            finish()
        }
    }
}








