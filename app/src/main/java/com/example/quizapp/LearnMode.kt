package com.example.quizapp

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.example.quizapp.databinding.ActivitySecondBinding

class LearnMode : AppCompatActivity() {
    private lateinit var secondBinding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?){
        secondBinding = ActivitySecondBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(secondBinding.root)
        var ques =0
        secondBinding.nxtbtn.setOnClickListener {
            if (ques<=10){
                ques +=1

                when(ques) {
                    1 -> {
                        secondBinding.ques.text = Constants.Question1
                    }
                    2 -> {
                        secondBinding.ques.text = Constants.Question2
                    }
                    3 -> {
                        secondBinding.ques.text = Constants.Question3
                    }
                    4 -> {
                        secondBinding.ques.text = Constants.Question4
                    }
                    5 -> {
                        secondBinding.ques.text = Constants.Question5
                    }
                    6 -> {
                        secondBinding.ques.text = Constants.Question6
                    }
                    7 -> {
                        secondBinding.ques.text = Constants.Question7
                    }
                    8 -> {
                        secondBinding.ques.text = Constants.Question8
                    }
                    9 -> {
                        secondBinding.ques.text = Constants.Question9
                    }
                    10 -> {
                        secondBinding.ques.text = Constants.Question10
                        secondBinding.nxtbtn.text = "Finish"

                    }
                    else ->{
                        val intent = Intent(this ,MainActivity::class.java)
                        startActivity(intent)
                    }
                }
            }
        }

        secondBinding.prevbtn.setOnClickListener {
            if (ques>1) {
                ques -= 1

                when (ques) {
                    1 -> {
                        secondBinding.ques.text = Constants.Question1
                    }
                    2 -> {
                        secondBinding.ques.text = Constants.Question2
                    }
                    3 -> {
                        secondBinding.ques.text = Constants.Question3
                    }
                    4 -> {
                        secondBinding.ques.text = Constants.Question4
                    }
                    5 -> {
                        secondBinding.ques.text = Constants.Question5
                    }
                    6 -> {
                        secondBinding.ques.text = Constants.Question6
                    }
                    7 -> {
                        secondBinding.ques.text = Constants.Question7
                    }
                    8 -> {
                        secondBinding.ques.text = Constants.Question8
                    }
                    9 -> {
                        secondBinding.ques.text = Constants.Question9
                    }
                    10 -> {
                        secondBinding.ques.text = Constants.Question10
                    }
                }
            }
        }
    }
}