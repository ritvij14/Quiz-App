package com.example.quizapp

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.graphics.Color
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.TextView
import android.preference.Preference
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.quizapp.databinding.ActivityPracticeBinding
import java.text.DecimalFormat
import java.text.NumberFormat
import java.util.prefs.Preferences

abstract class CountDownTimer


var quesNum = 1
class Practice : AppCompatActivity() {
    private lateinit var mainBinding: ActivityPracticeBinding
    fun checkOption(num: Int) {
        if (num == 6 || num == 8) {
            mainBinding.btnOptionC.visibility = View.GONE
            mainBinding.btnOptionD.visibility = View.GONE
        } else {
            mainBinding.btnOptionC.visibility = View.VISIBLE
            mainBinding.btnOptionD.visibility = View.VISIBLE
        }
    }

    override fun onBackPressed() {
        Toast.makeText(this, "If you want to finish, press End test",
            Toast.LENGTH_LONG).show();

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        mainBinding = ActivityPracticeBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(mainBinding.root)
        val timer: TextView = findViewById(R.id.clock)
        object : CountDownTimer(1200000, 1000) {
            val f: NumberFormat = DecimalFormat("00")
            override fun onTick(millisUntilFinished: Long) {
                timer.setText("Time left: " + millisUntilFinished / 60000 + ":" + f.format((millisUntilFinished / 1000) % 60))
            }

            override fun onFinish() {
                val intent = Intent(applicationContext, Result::class.java)
                startActivity(intent)
                Toast.makeText(Practice(), "Times Up!!",
                    Toast.LENGTH_LONG).show();

            }
        }.start()


        val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        var quesNum = 1
        var ans = "None"

        fun screenContent(num: Int) {
            mainBinding.btnNext.text = "Next"
            when (num) {
                1 -> {
                    mainBinding.tvQuestionNumber.text = "Question 1"
                    mainBinding.tvQuestion.text = Constants.Question1
                    mainBinding.btnOptionA.text = Constants.Q1O1
                    mainBinding.btnOptionB.text = Constants.Q1O2
                    mainBinding.btnOptionC.text = Constants.Q1O3
                    mainBinding.btnOptionD.text = Constants.Q1O4
                    mainBinding.optnRadioGrp.clearCheck()
                }

                2 -> {
                    mainBinding.tvQuestionNumber.text = "Question 2"
                    mainBinding.tvQuestion.text = Constants.Question2
                    mainBinding.btnOptionA.text = Constants.Q2O1
                    mainBinding.btnOptionB.text = Constants.Q2O2
                    mainBinding.btnOptionC.text = Constants.Q2O3
                    mainBinding.btnOptionD.text = Constants.Q2O4
                    if (ans == "A") {
                        editor.apply {
                            putInt("Q1optionSelected", 1)
                            apply()
                        }
                    }
                    else if (ans == "None") {
                        editor.apply {
                            putInt("Q3optionSelected", 2)
                            apply()
                        }
                    }
                    else{
                        editor.apply {
                            putInt("Q3optionSelected", 0)
                            apply()}
                    }
                    mainBinding.optnRadioGrp.clearCheck()
                }
                3 -> {
                    mainBinding.tvQuestionNumber.text = "Question 3"
                    mainBinding.tvQuestion.text = Constants.Question3
                    mainBinding.btnOptionA.text = Constants.Q3O1
                    mainBinding.btnOptionB.text = Constants.Q3O2
                    mainBinding.btnOptionC.text = Constants.Q3O3
                    mainBinding.btnOptionD.text = Constants.Q3O4
                    if (ans == "C") {
                        editor.apply {
                            putInt("Q2optionSelected", 1)
                            apply()
                        }
                    }
                    else if (ans == "None") {
                        editor.apply {
                            putInt("Q3optionSelected", 2)
                            apply()
                        }
                    }
                    else{
                        editor.apply {
                            putInt("Q3optionSelected", 0)
                            apply()}
                    }
                    mainBinding.optnRadioGrp.clearCheck()
                }
                4 -> {
                    mainBinding.tvQuestionNumber.text = "Question 4"
                    mainBinding.tvQuestion.text = Constants.Question4
                    mainBinding.btnOptionA.text = Constants.Q4O1
                    mainBinding.btnOptionB.text = Constants.Q4O2
                    mainBinding.btnOptionC.text = Constants.Q4O3
                    mainBinding.btnOptionD.text = Constants.Q4O4
                    if (ans == "C") {
                        editor.apply {
                            putInt("Q3optionSelected", 1)
                            apply()
                        }
                    }
                    else if (ans == "None") {
                        editor.apply {
                            putInt("Q3optionSelected", 2)
                            apply()
                        }
                    }
                    else{
                        editor.apply {
                            putInt("Q3optionSelected", 0)
                            apply()}
                    }
                    mainBinding.optnRadioGrp.clearCheck()
                }
                5 -> {
                    mainBinding.tvQuestionNumber.text = "Question 5"
                    mainBinding.tvQuestion.text = Constants.Question5
                    mainBinding.btnOptionA.text = Constants.Q5O1
                    mainBinding.btnOptionB.text = Constants.Q5O2
                    mainBinding.btnOptionC.text = Constants.Q5O3
                    mainBinding.btnOptionD.text = Constants.Q5O4
                    if (ans == "A") {
                        editor.apply {
                            putInt("Q4optionSelected", 1)
                            apply()
                        }
                    }
                    else if (ans == "None") {
                        editor.apply {
                            putInt("Q3optionSelected", 2)
                            apply()
                        }
                    }
                    else{
                        editor.apply {
                            putInt("Q3optionSelected", 0)
                            apply()}
                    }
                    mainBinding.optnRadioGrp.clearCheck()
                }
                6 -> {
                    mainBinding.tvQuestionNumber.text = "Question 6"
                    mainBinding.tvQuestion.text = Constants.Question6
                    mainBinding.btnOptionA.text = Constants.Q6O1
                    mainBinding.btnOptionB.text = Constants.Q6O2
                    mainBinding.btnOptionC.text = ""
                    mainBinding.btnOptionD.text = ""
                    if (ans == "A") {
                        editor.apply {
                            putInt("Q5optionSelected", 1)
                            apply()
                        }
                    }
                    else if (ans == "None") {
                        editor.apply {
                            putInt("Q3optionSelected", 2)
                            apply()
                        }
                    }
                    else{
                        editor.apply {
                            putInt("Q3optionSelected", 0)
                            apply()}
                    }
                    mainBinding.optnRadioGrp.clearCheck()
                }
                7 -> {
                    mainBinding.tvQuestionNumber.text = "Question 7"
                    mainBinding.tvQuestion.text = Constants.Question7
                    mainBinding.btnOptionA.text = Constants.Q7O1
                    mainBinding.btnOptionB.text = Constants.Q7O2
                    mainBinding.btnOptionC.text = Constants.Q7O3
                    mainBinding.btnOptionD.text = Constants.Q7O4
                    if (ans == "B") {
                        editor.apply {
                            putInt("Q6optionSelected", 1)
                            apply()
                        }
                    }
                    else if (ans == "None") {
                        editor.apply {
                            putInt("Q3optionSelected", 2)
                            apply()
                        }
                    }
                    else{
                        editor.apply {
                            putInt("Q3optionSelected", 0)
                            apply()}
                    }
                    mainBinding.optnRadioGrp.clearCheck()
                }
                8 -> {
                    mainBinding.tvQuestionNumber.text = "Question 8"
                    mainBinding.tvQuestion.text = Constants.Question8
                    mainBinding.btnOptionA.text = Constants.Q8O1
                    mainBinding.btnOptionB.text = Constants.Q8O2
                    mainBinding.btnOptionC.text = ""
                    mainBinding.btnOptionD.text = ""
                    if (ans == "B") {
                        editor.apply {
                            putInt("Q7optionSelected", 1)
                            apply()
                        }
                    }
                    else if (ans == "None") {
                        editor.apply {
                            putInt("Q3optionSelected", 2)
                            apply()
                        }
                    }
                    else{
                        editor.apply {
                            putInt("Q3optionSelected", 0)
                            apply()}
                    }
                    mainBinding.optnRadioGrp.clearCheck()
                }
                9 -> {
                    mainBinding.tvQuestionNumber.text = "Question 9"
                    mainBinding.tvQuestion.text = Constants.Question9
                    mainBinding.btnOptionA.text = Constants.Q9O1
                    mainBinding.btnOptionB.text = Constants.Q9O2
                    mainBinding.btnOptionC.text = Constants.Q9O3
                    mainBinding.btnOptionD.text = Constants.Q9O4
                    if (ans == "A") {
                        editor.apply {
                            putInt("Q8optionSelected", 1)
                            apply()
                        }
                    }
                    else if (ans == "None") {
                        editor.apply {
                            putInt("Q3optionSelected", 2)
                            apply()
                        }
                    }
                    else{
                        editor.apply {
                            putInt("Q3optionSelected", 0)
                            apply()}
                    }
                    mainBinding.optnRadioGrp.clearCheck()
                }
                10 -> {
                    mainBinding.tvQuestionNumber.text = "Question 10"
                    mainBinding.tvQuestion.text = Constants.Question10
                    mainBinding.btnOptionA.text = Constants.Q10O1
                    mainBinding.btnOptionB.text = Constants.Q10O2
                    mainBinding.btnOptionC.text = Constants.Q10O3
                    mainBinding.btnOptionD.text = Constants.Q10O4
                    if (ans == "C") {
                        editor.apply {
                            putInt("Q9optionSelected", 1)
                            apply()
                        }
                    }
                    else if (ans == "None") {
                        editor.apply {
                            putInt("Q3optionSelected", 2)
                            apply()
                        }
                    }
                    else{
                        editor.apply {
                            putInt("Q3optionSelected", 0)
                            apply()}
                    }
                    mainBinding.optnRadioGrp.clearCheck()
                    mainBinding.btnNext.text = "Submit"
                }
                11 -> {
                    if (ans == "B") {
                        editor.apply {
                            putInt("Q10optionSelected", 1)
                            apply()
                        }
                    }
                    else if (ans == "None") {
                        editor.apply {
                            putInt("Q3optionSelected", 2)
                            apply()
                        }
                    }
                    else{
                        editor.apply {
                            putInt("Q3optionSelected", 0)
                            apply()}
                    }
                    val intent = Intent(this, Result::class.java)
                    startActivity(intent)
                }

            }
        }

        mainBinding.btnOptionA.setOnClickListener {
            ans = "A"
            when (quesNum) {
                1 -> mainBinding.btnShortCut1.setBackgroundColor(Color.YELLOW)
                2 -> mainBinding.btnShortCut2.setBackgroundColor(Color.YELLOW)
                3 -> mainBinding.btnShortCut3.setBackgroundColor(Color.YELLOW)
                4 -> mainBinding.btnShortCut4.setBackgroundColor(Color.YELLOW)
                5 -> mainBinding.btnShortCut5.setBackgroundColor(Color.YELLOW)
                6 -> mainBinding.btnShortCut6.setBackgroundColor(Color.YELLOW)
                7 -> mainBinding.btnShortCut7.setBackgroundColor(Color.YELLOW)
                8 -> mainBinding.btnShortCut8.setBackgroundColor(Color.YELLOW)
                9 -> mainBinding.btnShortCut9.setBackgroundColor(Color.YELLOW)
                10 -> mainBinding.btnShortCut10.setBackgroundColor(Color.YELLOW)
            }
        }
        mainBinding.btnOptionB.setOnClickListener {
            ans = "B"
            when (quesNum) {
                1 -> mainBinding.btnShortCut1.setBackgroundColor(Color.YELLOW)
                2 -> mainBinding.btnShortCut2.setBackgroundColor(Color.YELLOW)
                3 -> mainBinding.btnShortCut3.setBackgroundColor(Color.YELLOW)
                4 -> mainBinding.btnShortCut4.setBackgroundColor(Color.YELLOW)
                5 -> mainBinding.btnShortCut5.setBackgroundColor(Color.YELLOW)
                6 -> mainBinding.btnShortCut6.setBackgroundColor(Color.YELLOW)
                7 -> mainBinding.btnShortCut7.setBackgroundColor(Color.YELLOW)
                8 -> mainBinding.btnShortCut8.setBackgroundColor(Color.YELLOW)
                9 -> mainBinding.btnShortCut9.setBackgroundColor(Color.YELLOW)
                10 -> mainBinding.btnShortCut10.setBackgroundColor(Color.YELLOW)
            }
        }
        mainBinding.btnOptionC.setOnClickListener {
            ans = "C"
            when (quesNum) {
                1 -> mainBinding.btnShortCut1.setBackgroundColor(Color.YELLOW)
                2 -> mainBinding.btnShortCut2.setBackgroundColor(Color.YELLOW)
                3 -> mainBinding.btnShortCut3.setBackgroundColor(Color.YELLOW)
                4 -> mainBinding.btnShortCut4.setBackgroundColor(Color.YELLOW)
                5 -> mainBinding.btnShortCut5.setBackgroundColor(Color.YELLOW)
                6 -> mainBinding.btnShortCut6.setBackgroundColor(Color.YELLOW)
                7 -> mainBinding.btnShortCut7.setBackgroundColor(Color.YELLOW)
                8 -> mainBinding.btnShortCut8.setBackgroundColor(Color.YELLOW)
                9 -> mainBinding.btnShortCut9.setBackgroundColor(Color.YELLOW)
                10 -> mainBinding.btnShortCut10.setBackgroundColor(Color.YELLOW)
            }
        }
        mainBinding.btnOptionD.setOnClickListener {
            ans = "D"
            when (quesNum) {
                1 -> mainBinding.btnShortCut1.setBackgroundColor(Color.YELLOW)
                2 -> mainBinding.btnShortCut2.setBackgroundColor(Color.YELLOW)
                3 -> mainBinding.btnShortCut3.setBackgroundColor(Color.YELLOW)
                4 -> mainBinding.btnShortCut4.setBackgroundColor(Color.YELLOW)
                5 -> mainBinding.btnShortCut5.setBackgroundColor(Color.YELLOW)
                6 -> mainBinding.btnShortCut6.setBackgroundColor(Color.YELLOW)
                7 -> mainBinding.btnShortCut7.setBackgroundColor(Color.YELLOW)
                8 -> mainBinding.btnShortCut8.setBackgroundColor(Color.YELLOW)
                9 -> mainBinding.btnShortCut9.setBackgroundColor(Color.YELLOW)
                10 -> mainBinding.btnShortCut10.setBackgroundColor(Color.YELLOW)
            }
        }
        mainBinding.tvQuestionNumber.text = "Question 1"
        mainBinding.tvQuestion.text = Constants.Question1
        mainBinding.btnOptionA.text = Constants.Q1O1
        mainBinding.btnOptionB.text = Constants.Q1O2
        mainBinding.btnOptionC.text = Constants.Q1O3
        mainBinding.btnOptionD.text = Constants.Q1O4

        mainBinding.btnNext.setOnClickListener {

            if (quesNum <= 11) {
                quesNum += 1
                checkOption(quesNum)
                screenContent(quesNum)
            }
            mainBinding.btnPrevious.setOnClickListener {
                if (quesNum <= 11) {
                    quesNum -= 1
                    checkOption(quesNum)
                    screenContent(quesNum)
                }
            }


        }
        mainBinding.btnMarkForReview.setOnClickListener {
            when (quesNum) {
                1 -> mainBinding.btnShortCut1.setBackgroundColor(Color.CYAN)
                2 -> mainBinding.btnShortCut2.setBackgroundColor(Color.CYAN)
                3 -> mainBinding.btnShortCut3.setBackgroundColor(Color.CYAN)
                4 -> mainBinding.btnShortCut4.setBackgroundColor(Color.CYAN)
                5 -> mainBinding.btnShortCut5.setBackgroundColor(Color.CYAN)
                6 -> mainBinding.btnShortCut6.setBackgroundColor(Color.CYAN)
                7 -> mainBinding.btnShortCut7.setBackgroundColor(Color.CYAN)
                8 -> mainBinding.btnShortCut8.setBackgroundColor(Color.CYAN)
                9 -> mainBinding.btnShortCut9.setBackgroundColor(Color.CYAN)
                10 -> mainBinding.btnShortCut10.setBackgroundColor(Color.CYAN)
            }
        }
        mainBinding.btnShortCut1.setOnClickListener {
            quesNum = 1
            checkOption(quesNum)
            screenContent(quesNum)
        }
        mainBinding.btnShortCut2.setOnClickListener {
            quesNum = 2
            checkOption(quesNum)
            screenContent(quesNum)
        }
        mainBinding.btnShortCut3.setOnClickListener {
            quesNum = 3
            checkOption(quesNum)
            screenContent(quesNum)
        }
        mainBinding.btnShortCut4.setOnClickListener {
            quesNum = 4
            checkOption(quesNum)
            screenContent(quesNum)
        }
        mainBinding.btnShortCut5.setOnClickListener {
            quesNum = 5
            checkOption(quesNum)
            screenContent(quesNum)
        }
        mainBinding.btnShortCut6.setOnClickListener {
            quesNum = 6
            checkOption(quesNum)
            screenContent(quesNum)
        }
        mainBinding.btnShortCut7.setOnClickListener {
            quesNum = 7
            checkOption(quesNum)
            screenContent(quesNum)
        }
        mainBinding.btnShortCut8.setOnClickListener {
            quesNum = 8
            checkOption(quesNum)
            screenContent(quesNum)
        }
        mainBinding.btnShortCut9.setOnClickListener {
            quesNum = 9
            checkOption(quesNum)
            screenContent(quesNum)
        }
        mainBinding.btnShortCut10.setOnClickListener {
            quesNum = 10
            checkOption(quesNum)
            screenContent(quesNum)
        }
        mainBinding.btnEndTest.setOnClickListener {
            val intent = Intent(applicationContext, Result::class.java)
            startActivity(intent)
            finish()

        }
    }
}









