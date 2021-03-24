package com.example.quizapp

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.quizapp.databinding.ActivityPracticeBinding

fun onBackPressed() {
    Toast.makeText(Practice(), "Please use Next or Previous button.",
            Toast.LENGTH_LONG).show();
}
var quesNum = 1
class Practice : AppCompatActivity() {
    private lateinit var mainBinding: ActivityPracticeBinding
    fun checkOption(num : Int)
    {
        if (num == 6 || num == 8)
        {
            mainBinding.btnOptionC.visibility = View.GONE
            mainBinding.btnOptionD.visibility = View.GONE
        }
        else
        {
            mainBinding.btnOptionC.visibility = View.VISIBLE
            mainBinding.btnOptionD.visibility = View.VISIBLE
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        mainBinding = ActivityPracticeBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(mainBinding.root)

        mainBinding.btnNext.setOnClickListener {
            quesNum += 1
            checkOption(quesNum)
            when (quesNum) {
                1 -> {
                    mainBinding.tvQuestionNumber.text = "Question 1"
                    mainBinding.tvQuestion.text = Constants.Question1
                    mainBinding.btnOptionA.text = Constants.Q1O1
                    mainBinding.btnOptionB.text = Constants.Q1O2
                    mainBinding.btnOptionC.text = Constants.Q1O3
                    mainBinding.btnOptionD.text = Constants.Q1O4
                }
                2 -> {
                    mainBinding.tvQuestionNumber.text = "Question 2"
                    mainBinding.tvQuestion.text = Constants.Question2
                    mainBinding.btnOptionA.text = Constants.Q2O1
                    mainBinding.btnOptionB.text = Constants.Q2O2
                    mainBinding.btnOptionC.text = Constants.Q2O3
                    mainBinding.btnOptionD.text = Constants.Q2O4
                }
                3 -> {
                    mainBinding.tvQuestionNumber.text = "Question 3"
                    mainBinding.tvQuestion.text = Constants.Question3
                    mainBinding.btnOptionA.text = Constants.Q3O1
                    mainBinding.btnOptionB.text = Constants.Q3O2
                    mainBinding.btnOptionC.text = Constants.Q3O3
                    mainBinding.btnOptionD.text = Constants.Q3O4
                }
                4 -> {
                    mainBinding.tvQuestionNumber.text = "Question 4"
                    mainBinding.tvQuestion.text = Constants.Question4
                    mainBinding.btnOptionA.text = Constants.Q4O1
                    mainBinding.btnOptionB.text = Constants.Q4O2
                    mainBinding.btnOptionC.text = Constants.Q4O3
                    mainBinding.btnOptionD.text = Constants.Q4O4
                }
                5 -> {
                    mainBinding.tvQuestionNumber.text = "Question 5"
                    mainBinding.tvQuestion.text = Constants.Question5
                    mainBinding.btnOptionA.text = Constants.Q5O1
                    mainBinding.btnOptionB.text = Constants.Q5O2
                    mainBinding.btnOptionC.text = Constants.Q5O3
                    mainBinding.btnOptionD.text = Constants.Q5O4
                }
                6 -> {
                    mainBinding.tvQuestionNumber.text = "Question 6"
                    mainBinding.tvQuestion.text = Constants.Question6
                    mainBinding.btnOptionA.text = Constants.Q6O1
                    mainBinding.btnOptionB.text = Constants.Q6O2
                    mainBinding.btnOptionC.text = ""
                    mainBinding.btnOptionD.text = ""
                }
                7 -> {
                    mainBinding.tvQuestionNumber.text = "Question 7"
                    mainBinding.tvQuestion.text = Constants.Question7
                    mainBinding.btnOptionA.text = Constants.Q7O1
                    mainBinding.btnOptionB.text = Constants.Q7O2
                    mainBinding.btnOptionC.text = Constants.Q7O3
                    mainBinding.btnOptionD.text = Constants.Q7O4
                }
                8 -> {
                    mainBinding.tvQuestionNumber.text = "Question 8"
                    mainBinding.tvQuestion.text = Constants.Question8
                    mainBinding.btnOptionA.text = Constants.Q8O1
                    mainBinding.btnOptionB.text = Constants.Q8O2
                    mainBinding.btnOptionC.text = ""
                    mainBinding.btnOptionD.text = ""
                }
                9 -> {
                    mainBinding.tvQuestionNumber.text = "Question 9"
                    mainBinding.tvQuestion.text = Constants.Question9
                    mainBinding.btnOptionA.text = Constants.Q9O1
                    mainBinding.btnOptionB.text = Constants.Q9O2
                    mainBinding.btnOptionC.text = Constants.Q9O3
                    mainBinding.btnOptionD.text = Constants.Q9O4
                }
                10 -> {
                    mainBinding.tvQuestionNumber.text = "Question 10"
                    mainBinding.tvQuestion.text = Constants.Question10
                    mainBinding.btnOptionA.text = Constants.Q10O1
                    mainBinding.btnOptionB.text = Constants.Q10O2
                    mainBinding.btnOptionC.text = Constants.Q10O3
                    mainBinding.btnOptionD.text = Constants.Q10O4
                }
            }
        }
        mainBinding.btnPrevious.setOnClickListener{
            if(quesNum>1) {
                quesNum-= 1
            }
            checkOption(quesNum)
            when(quesNum){
                1 -> {
                    mainBinding.tvQuestionNumber.text = "Question 1"
                    mainBinding.tvQuestion.text = Constants.Question1
                    mainBinding.btnOptionA.text = Constants.Q1O1
                    mainBinding.btnOptionB.text = Constants.Q1O2
                    mainBinding.btnOptionC.text = Constants.Q1O3
                    mainBinding.btnOptionD.text = Constants.Q1O4
                }
                2 -> {
                    mainBinding.tvQuestionNumber.text = "Question 2"
                    mainBinding.tvQuestion.text = Constants.Question2
                    mainBinding.btnOptionA.text = Constants.Q2O1
                    mainBinding.btnOptionB.text = Constants.Q2O2
                    mainBinding.btnOptionC.text = Constants.Q2O3
                    mainBinding.btnOptionD.text = Constants.Q2O4
                }
                3 -> {
                    mainBinding.tvQuestionNumber.text = "Question 3"
                    mainBinding.tvQuestion.text = Constants.Question3
                    mainBinding.btnOptionA.text = Constants.Q3O1
                    mainBinding.btnOptionB.text = Constants.Q3O2
                    mainBinding.btnOptionC.text = Constants.Q3O3
                    mainBinding.btnOptionD.text = Constants.Q3O4
                }
                4 -> {
                    mainBinding.tvQuestionNumber.text = "Question 4"
                    mainBinding.tvQuestion.text = Constants.Question4
                    mainBinding.btnOptionA.text = Constants.Q4O1
                    mainBinding.btnOptionB.text = Constants.Q4O2
                    mainBinding.btnOptionC.text = Constants.Q4O3
                    mainBinding.btnOptionD.text = Constants.Q4O4
                }
                5 -> {
                    mainBinding.tvQuestionNumber.text = "Question 5"
                    mainBinding.tvQuestion.text = Constants.Question5
                    mainBinding.btnOptionA.text = Constants.Q5O1
                    mainBinding.btnOptionB.text = Constants.Q5O2
                    mainBinding.btnOptionC.text = Constants.Q5O3
                    mainBinding.btnOptionD.text = Constants.Q5O4
                }
                6 -> {
                    mainBinding.tvQuestionNumber.text = "Question 6"
                    mainBinding.tvQuestion.text = Constants.Question6
                    mainBinding.btnOptionA.text = Constants.Q6O1
                    mainBinding.btnOptionB.text = Constants.Q6O2
                    mainBinding.btnOptionC.text = ""
                    mainBinding.btnOptionD.text = ""
                }
                7 -> {
                    mainBinding.tvQuestionNumber.text = "Question 7"
                    mainBinding.tvQuestion.text = Constants.Question7
                    mainBinding.btnOptionA.text = Constants.Q7O1
                    mainBinding.btnOptionB.text = Constants.Q7O2
                    mainBinding.btnOptionC.text = Constants.Q7O3
                    mainBinding.btnOptionD.text = Constants.Q7O4
                }
                8 -> {
                    mainBinding.tvQuestionNumber.text = "Question 8"
                    mainBinding.tvQuestion.text = Constants.Question8
                    mainBinding.btnOptionA.text = Constants.Q8O1
                    mainBinding.btnOptionB.text = Constants.Q8O2
                    mainBinding.btnOptionC.text = ""
                    mainBinding.btnOptionD.text = ""
                }
                9 -> {
                    mainBinding.tvQuestionNumber.text = "Question 9"
                    mainBinding.tvQuestion.text = Constants.Question9
                    mainBinding.btnOptionA.text = Constants.Q9O1
                    mainBinding.btnOptionB.text = Constants.Q9O2
                    mainBinding.btnOptionC.text = Constants.Q9O3
                    mainBinding.btnOptionD.text = Constants.Q9O4
                }
                10 -> {
                    mainBinding.tvQuestionNumber.text = "Question 10"
                    mainBinding.tvQuestion.text = Constants.Question10
                    mainBinding.btnOptionA.text = Constants.Q10O1
                    mainBinding.btnOptionB.text = Constants.Q10O2
                    mainBinding.btnOptionC.text = Constants.Q10O3
                    mainBinding.btnOptionD.text = Constants.Q10O4
                }
            }
        }
    }
}
