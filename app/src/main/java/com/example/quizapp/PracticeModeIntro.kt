package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.SyncStateContract
import com.example.quizapp.databinding.ActivityMainBinding
import com.example.quizapp.databinding.ActivityPracticeModeIntroBinding

class PracticeModeIntro : AppCompatActivity() {
    private lateinit var mainBinding: ActivityPracticeModeIntroBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        mainBinding = ActivityPracticeModeIntroBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(mainBinding.root)

        mainBinding.btnStartPractice.setOnClickListener{
            val intent = Intent(this ,Practice::class.java)
            startActivity(intent)}

    }
}