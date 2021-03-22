package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.quizapp.databinding.ActivityFirstQuestionBinding

class FirstQuestion : AppCompatActivity() {
    private lateinit var mainBinding: ActivityFirstQuestionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityFirstQuestionBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)
        
        mainBinding.btnSolution.setOnClickListener{
            val intent = Intent(this ,SecondQuestion::class.java)
            startActivity(intent)
        }
    }

}