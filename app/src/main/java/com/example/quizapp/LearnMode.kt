package com.example.quizapp

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.quizapp.databinding.ActivitySecondBinding

class LearnMode : AppCompatActivity() {
    private lateinit var secondBinding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?){
        secondBinding = ActivitySecondBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(secondBinding.root)

        secondBinding.ques.text = Constants.Question1
        secondBinding.quesnumber.text = "Question 1"

        var ques =1

        secondBinding.nxtbtn.setOnClickListener {
            if (ques<=10){
                ques +=1

                when(ques) {
                    1 -> {
                        secondBinding.ques.text = Constants.Question1
                        secondBinding.sol.visibility = View.INVISIBLE
                        secondBinding.quesnumber.text = "Question 1"
                    }
                    2 -> {
                        secondBinding.ques.text = Constants.Question2
                        secondBinding.sol.visibility = View.INVISIBLE
                        secondBinding.quesnumber.text = "Question 2"
                    }
                    3 -> {
                        secondBinding.ques.text = Constants.Question3
                        secondBinding.sol.visibility = View.INVISIBLE
                        secondBinding.quesnumber.text = "Question 3"
                    }
                    4 -> {
                        secondBinding.ques.text = Constants.Question4
                        secondBinding.sol.visibility = View.INVISIBLE
                        secondBinding.quesnumber.text = "Question 4"
                    }
                    5 -> {
                        secondBinding.ques.text = Constants.Question5
                        secondBinding.sol.visibility = View.INVISIBLE
                        secondBinding.quesnumber.text = "Question 5"
                    }
                    6 -> {
                        secondBinding.ques.text = Constants.Question6
                        secondBinding.sol.visibility = View.INVISIBLE
                        secondBinding.quesnumber.text = "Question 6"
                    }
                    7 -> {
                        secondBinding.ques.text = Constants.Question7
                        secondBinding.sol.visibility = View.INVISIBLE
                        secondBinding.quesnumber.text = "Question 7"
                    }
                    8 -> {
                        secondBinding.ques.text = Constants.Question8
                        secondBinding.sol.visibility = View.INVISIBLE
                        secondBinding.quesnumber.text = "Question 8"
                    }
                    9 -> {
                        secondBinding.ques.text = Constants.Question9
                        secondBinding.sol.visibility = View.INVISIBLE
                        secondBinding.quesnumber.text = "Question 9"
                    }
                    10 -> {
                        secondBinding.ques.text = Constants.Question10
                        secondBinding.nxtbtn.text = "Finish"
                        secondBinding.sol.visibility = View.INVISIBLE
                        secondBinding.quesnumber.text = "Question 10"

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
                        secondBinding.sol.visibility = View.INVISIBLE
                        secondBinding.quesnumber.text = "Question 1"
                    }
                    2 -> {
                        secondBinding.ques.text = Constants.Question2
                        secondBinding.sol.visibility = View.INVISIBLE
                        secondBinding.quesnumber.text = "Question 2"

                    }
                    3 -> {
                        secondBinding.ques.text = Constants.Question3
                        secondBinding.sol.visibility = View.INVISIBLE
                        secondBinding.quesnumber.text = "Question 3"
                    }
                    4 -> {
                        secondBinding.ques.text = Constants.Question4
                        secondBinding.sol.visibility = View.INVISIBLE
                        secondBinding.quesnumber.text = "Question 4"
                    }
                    5 -> {
                        secondBinding.ques.text = Constants.Question5
                        secondBinding.sol.visibility = View.INVISIBLE
                        secondBinding.quesnumber.text = "Question 5"
                    }
                    6 -> {
                        secondBinding.ques.text = Constants.Question6
                        secondBinding.sol.visibility = View.INVISIBLE
                        secondBinding.quesnumber.text = "Question6"
                    }
                    7 -> {
                        secondBinding.ques.text = Constants.Question7
                        secondBinding.sol.visibility = View.INVISIBLE
                        secondBinding.quesnumber.text = "Question 7"
                    }
                    8 -> {
                        secondBinding.ques.text = Constants.Question8
                        secondBinding.sol.visibility = View.INVISIBLE
                        secondBinding.quesnumber.text = "Question 8"
                    }
                    9 -> {
                        secondBinding.ques.text = Constants.Question9
                        secondBinding.nxtbtn.text = "NEXT"
                        secondBinding.sol.visibility = View.INVISIBLE
                        secondBinding.quesnumber.text = "Question 9"
                    }
                    10 -> {
                        secondBinding.ques.text = Constants.Question10
                        secondBinding.sol.visibility = View.INVISIBLE
                        secondBinding.quesnumber.text = "Question 10"
                    }


                }


            }
            else{
                val intent = Intent(this, LearnModeIntro::class.java)
                startActivity(intent)
            }
        }
        secondBinding.imageButton.setOnClickListener {

            if(secondBinding.sol.visibility == View.VISIBLE){
                secondBinding.sol.visibility = View.INVISIBLE
            }
            else
                secondBinding.sol.visibility = View.VISIBLE

            when(ques){
                1 -> {
                    secondBinding.sol.text = Constants.Solution1
                }
                2 -> {
                    secondBinding.sol.text = Constants.Solution2
                }
                3 -> {
                    secondBinding.sol.text = Constants.Solution3
                }
                4 -> {
                    secondBinding.sol.text = Constants.Solution4
                }
                5 ->{
                    secondBinding.sol.text = Constants.Solution5
                }
                6 -> {
                    secondBinding.sol.text = Constants.Solution6
                }
                7 -> {
                    secondBinding.sol.text = Constants.Solution7
                }
                8 -> {
                    secondBinding.sol.text = Constants.Solution8
                }
                9 -> {
                    secondBinding.sol.text = Constants.Solution9
                }
                10 -> {
                    secondBinding.sol.text = Constants.Solution10
                }
            }
        }
    }
}