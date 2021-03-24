package com.example.quizapp

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.example.quizapp.databinding.ActivitySecondBinding

var ques = 1;
class LearnMode : AppCompatActivity() {
    private lateinit var secondBinding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?){
        secondBinding = ActivitySecondBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(secondBinding.root)

        secondBinding.nxtbtn.setOnClickListener {
            ques +=1

            when(ques){
                1 ->  {
                    secondBinding.ques.text = Constants.Question1
                }
                2 -> {
                    secondBinding.ques.text = Constants.Question2
                }
            }
        }

        secondBinding.prevbtn.setOnClickListener {
            ques -=1

            when(ques){
                1 -> {
                   secondBinding.ques.text = Constants.Question1
                }
            }
        }
    }
}