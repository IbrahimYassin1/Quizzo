package com.example.quizzo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_quizzo_questions.*

class QuizzoQuestionsActivity : AppCompatActivity() {


    private var



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quizzo_questions)

        val questionsList = Constans.getQuestions()
        Log.i("Questions Size", "${questionsList.size}")

        val currentPosition = 1
        val question: Question? = questionsList[currentPosition -1]
        progressbar.progress = currentPosition
        tv_progress.text = "$currentPosition" + "/" + progressbar.max

        tv_question.text = question!!.question
        iv_image.setImageResource((question.image))
        OptionOne.text = question.optionOne
        OptionTwo.text = question.optionTwo
        OptionThree.text = question.optionThree
    }
}