package com.example.quizapp

import android.os.Bundle
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
    override fun onCreate(savedInstanceState: Bundle?) {
        mainBinding = ActivityPracticeBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(mainBinding.root)

        mainBinding.btnNext.setOnClickListener{
            quesNum += 1
            when(quesNum){
                1 -> {
                    mainBinding.tvQuestionNumber.text = "Question 1"
                    mainBinding.tvQuestion.text = "A and B are two events such that P(A) = 0.4 and P(A ∩ B) = 0.2 Then P(A ∩ B) is equal to ___________"
                    mainBinding.btnOptionA.text = "0.4"
                    mainBinding.btnOptionB.text = "0.2"
                    mainBinding.btnOptionC.text = "0.6"
                    mainBinding.btnOptionC.text = "0.8"
                }
                2 -> {
                    mainBinding.tvQuestionNumber.text = "Question 2"
                    mainBinding.tvQuestion.text = "A problem in mathematics is given to three students A, B and C. If the probability of A solving the problem is 1⁄2 and B not solving it is 1⁄4. The whole probability of the problem being solved is 63⁄64 then what is the probability of solving it?"
                    mainBinding.btnOptionA.text = "1/8"
                    mainBinding.btnOptionB.text = "1/64"
                    mainBinding.btnOptionC.text = "7/8"
                    mainBinding.btnOptionC.text = "1/2"
                }

            }
        mainBinding.btnPrevious.setOnClickListener{
            quesNum -= 1
            when(quesNum){
                1 -> {
                    mainBinding.tvQuestionNumber.text = "Question 1"
                    mainBinding.tvQuestion.text = "A and B are two events such that P(A) = 0.4 and P(A ∩ B) = 0.2 Then P(A ∩ B) is equal to ___________"
                    mainBinding.btnOptionA.text = "0.4"
                    mainBinding.btnOptionB.text = "0.2"
                    mainBinding.btnOptionC.text = "0.6"
                    mainBinding.btnOptionC.text = "0.8"
                }
                2 -> {
                    mainBinding.tvQuestionNumber.text = "Question 2"
                    mainBinding.tvQuestion.text = "A problem in mathematics is given to three students A, B and C. If the probability of A solving the problem is 1⁄2 and B not solving it is 1⁄4. The whole probability of the problem being solved is 63⁄64 then what is the probability of solving it?"
                    mainBinding.btnOptionA.text = "1/8"
                    mainBinding.btnOptionB.text = "1/64"
                    mainBinding.btnOptionC.text = "7/8"
                    mainBinding.btnOptionC.text = "1/2"
                }
            }

            }
        }



    }
}