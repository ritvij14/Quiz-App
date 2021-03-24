package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.SyncStateContract
import com.example.quizapp.databinding.ActivityMainBinding
import com.example.quizapp.databinding.ActivityPracticeModeIntroBinding
import com.example.quizapp.databinding.ActivityResultBinding

class Result : AppCompatActivity() {
    private lateinit var mainBinding: ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        mainBinding = ActivityResultBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(mainBinding.root)

        mainBinding.btnHome.setOnClickListener{
            val intent = Intent(this ,MainActivity::class.java)
            startActivity(intent)}

    }
}