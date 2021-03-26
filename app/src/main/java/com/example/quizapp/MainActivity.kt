 package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.SyncStateContract
import com.example.quizapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(mainBinding.root)

        mainBinding.btnPractice.setOnClickListener{
            val intent = Intent(this ,PracticeModeIntro::class.java)
            startActivity(intent)
        }
        mainBinding.btnLearn.setOnClickListener{
            val intent = Intent(this ,LearnMode::class.java)
            startActivity(intent)
        }

        mainBinding.btnLearn.setOnClickListener{
            val intent = Intent(this ,LearnModeIntro::class.java)
            startActivity(intent)
        }


    }
}