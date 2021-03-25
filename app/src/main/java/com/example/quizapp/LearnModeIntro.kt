package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.SyncStateContract
import com.example.quizapp.databinding.ActivityLearnModeIntroBinding

class LearnModeIntro : AppCompatActivity() {
    private lateinit var mainBinding: ActivityLearnModeIntroBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        mainBinding = ActivityLearnModeIntroBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(mainBinding.root)

        mainBinding.btnStartPractice.setOnClickListener{
            val intent = Intent(this ,LearnMode::class.java)
            startActivity(intent)}

    }
}