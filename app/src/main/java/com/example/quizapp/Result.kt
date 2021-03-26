package com.example.quizapp

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.provider.CalendarContract
import androidx.appcompat.app.AppCompatActivity
import com.example.quizapp.databinding.ActivityResultBinding

class Result : AppCompatActivity() {
    private lateinit var mainBinding: ActivityResultBinding
    override fun onBackPressed() {
        super.onBackPressed()
        val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        editor.clear().apply()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        val sharedPref = getSharedPreferences("myPref", MODE_PRIVATE)
        var correctAnswers = 0


        mainBinding = ActivityResultBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(mainBinding.root)

        mainBinding.btnHome.setOnClickListener {
            onBackPressed()
        }

        fun colorDecider(num: Int): Int {
            when (num) {

                1 -> {correctAnswers+=1
                    return Color.GREEN
                }
                2 -> return Color.WHITE
                else -> return Color.RED
            }
        }

        mainBinding.tvQuestion1.setBackgroundColor(colorDecider(sharedPref.getInt("Q1optionSelected", 2)))
        mainBinding.tvQuestion2.setBackgroundColor(colorDecider(sharedPref.getInt("Q2optionSelected", 2)))
        mainBinding.tvQuestion3.setBackgroundColor(colorDecider(sharedPref.getInt("Q3optionSelected", 2)))
        mainBinding.tvQuestion4.setBackgroundColor(colorDecider(sharedPref.getInt("Q4optionSelected", 2)))
        mainBinding.tvQuestion5.setBackgroundColor(colorDecider(sharedPref.getInt("Q5optionSelected", 2)))
        mainBinding.tvQuestion6.setBackgroundColor(colorDecider(sharedPref.getInt("Q6optionSelected", 2)))
        mainBinding.tvQuestion7.setBackgroundColor(colorDecider(sharedPref.getInt("Q7optionSelected", 2)))
        mainBinding.tvQuestion8.setBackgroundColor(colorDecider(sharedPref.getInt("Q8optionSelected", 2)))
        mainBinding.tvQuestion9.setBackgroundColor(colorDecider(sharedPref.getInt("Q9optionSelected", 2)))
        mainBinding.tvQuestion10.setBackgroundColor(colorDecider(sharedPref.getInt("Q10optionSelected", 2)))
        mainBinding.tvTotalCorrect.text = "Total Correct = $correctAnswers"

    }
}










