package com.example.quizapp

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.provider.CalendarContract
import androidx.appcompat.app.AppCompatActivity
import com.example.quizapp.databinding.ActivityResultBinding

class Result : AppCompatActivity() {
    private lateinit var mainBinding: ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        val sharedPref = getSharedPreferences("myPref", MODE_PRIVATE)


        mainBinding = ActivityResultBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(mainBinding.root)

        mainBinding.btnHome.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        fun colorDecider(num: Int): Int {
            when (num) {
                0 -> return Color.RED
                1 -> return Color.GREEN
                2 -> return Color.WHITE
                else -> return Color.WHITE
            }
        }

        mainBinding.tvQuestion1.setBackgroundColor(colorDecider(sharedPref.getInt("Q1optionSelected", 0)))
        mainBinding.tvQuestion2.setBackgroundColor(colorDecider(sharedPref.getInt("Q2optionSelected", 0)))
        mainBinding.tvQuestion3.setBackgroundColor(colorDecider(sharedPref.getInt("Q3optionSelected", 0)))
        mainBinding.tvQuestion4.setBackgroundColor(colorDecider(sharedPref.getInt("Q4optionSelected", 0)))
        mainBinding.tvQuestion5.setBackgroundColor(colorDecider(sharedPref.getInt("Q5optionSelected", 0)))
        mainBinding.tvQuestion6.setBackgroundColor(colorDecider(sharedPref.getInt("Q6optionSelected", 0)))
        mainBinding.tvQuestion7.setBackgroundColor(colorDecider(sharedPref.getInt("Q7optionSelected", 0)))
        mainBinding.tvQuestion8.setBackgroundColor(colorDecider(sharedPref.getInt("Q8optionSelected", 0)))
        mainBinding.tvQuestion9.setBackgroundColor(colorDecider(sharedPref.getInt("Q9optionSelected", 0)))
        mainBinding.tvQuestion10.setBackgroundColor(colorDecider(sharedPref.getInt("Q10optionSelected", 0)))

    }
}










