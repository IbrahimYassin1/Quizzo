package com.example.quizzo

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_quizzo_questions.*

class QuizzoQuestionsActivity : AppCompatActivity(), View.OnClickListener {

    private var CurrentPosition:Int = 1
    private var QuestionsList: ArrayList<Question>? = null
    private var SelectedOptionPosition : Int = 0
    private var CorrectAnswers: Int = 0
    private var UserName: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quizzo_questions)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        answerButton.visibility = View.INVISIBLE

        UserName = intent.getStringExtra(Constans.mUserName)

        QuestionsList = Constans.getQuestions()

        setQuestion()

        OptionOne.setOnClickListener(this)
        OptionTwo.setOnClickListener(this)
        OptionThree.setOnClickListener(this)
        answerButton.setOnClickListener(this)
    }

    private fun setQuestion(){

        answerButton.setVisibility (View.VISIBLE)

        val question = QuestionsList!![CurrentPosition-1]

        defaultOptionsView()

        if (CurrentPosition == QuestionsList!!.size){
            answerButton.text = "FINISH"
        }else{
            answerButton.text = "NEXT"
        }


        progressbar.progress = CurrentPosition
        tv_progress.text = "$CurrentPosition" + "/" + progressbar.max

        tv_question.text = question.question
        iv_image.setImageResource((question.image))
        OptionOne.text = question.optionOne
        OptionTwo.text = question.optionTwo
        OptionThree.text = question.optionThree
    }

    private fun defaultOptionsView(){
        val options = ArrayList<TextView>()
        options.add(0, OptionOne)
        options.add(1, OptionTwo)
        options.add(2, OptionThree)

        for (option in options){
            option.setTextColor(Color.parseColor("#fffafa"))

            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(this,
            R.drawable.default_option_bg
            )
        }
    }
    override fun onClick(view: View?) {
        when (view?.id){
            R.id.OptionOne -> {
                selectOption(OptionOne, 1)

                if (SelectedOptionPosition == 0){
                    CurrentPosition++

                    when{
                        CurrentPosition <= QuestionsList!!.size ->{
                            setQuestion()
                        }else ->{
                        val intent = Intent(this, ResultatActivity::class.java)
                        intent.putExtra(Constans.mUserName, UserName)
                        intent.putExtra(Constans.mCorrectAnswers, CorrectAnswers)
                        intent.putExtra(Constans.mTotalQuestion, QuestionsList!!.size)
                        startActivity(intent)
                        finish()
                    }
                    }
                }else{
                    val question = QuestionsList?.get(CurrentPosition -1)
                    if(question!!.correctOption != SelectedOptionPosition){

                    }else{
                        CorrectAnswers++
                    }


                    if (CurrentPosition == QuestionsList!!.size){
                        answerButton.text = "FINSIH"
                    }else{
                        answerButton.text = "NEXT"
                    }
                    SelectedOptionPosition = 0
                }
                answerButton.isEnabled = true
                OptionOne.isEnabled = false
                OptionTwo.isEnabled = false
                OptionThree.isEnabled = false
            }
            R.id.OptionTwo ->{
                selectOption(OptionTwo,2)

                if (SelectedOptionPosition == 0){
                    CurrentPosition++

                    when{
                        CurrentPosition <= QuestionsList!!.size ->{
                            setQuestion()
                        }else ->{
                        val intent = Intent(this, ResultatActivity::class.java)
                        intent.putExtra(Constans.mUserName, UserName)
                        intent.putExtra(Constans.mCorrectAnswers, CorrectAnswers)
                        intent.putExtra(Constans.mTotalQuestion, QuestionsList!!.size)
                        startActivity(intent)
                        finish()
                    }
                    }
                }else{
                    val question = QuestionsList?.get(CurrentPosition -1)
                    if(question!!.correctOption != SelectedOptionPosition){

                    }else{
                        CorrectAnswers++
                    }


                    if (CurrentPosition == QuestionsList!!.size){
                        answerButton.text = "FINSIH"
                    }else{
                        answerButton.text = "NEXT"
                    }
                    SelectedOptionPosition = 0
                }
                answerButton.isEnabled = true
                OptionOne.isEnabled = false
                OptionTwo.isEnabled = false
                OptionThree.isEnabled = false

            }
            R.id.OptionThree ->{
                selectOption(OptionThree,3)

                if (SelectedOptionPosition == 0){
                    CurrentPosition++

                    when{
                        CurrentPosition <= QuestionsList!!.size ->{
                            setQuestion()
                        }else ->{
                        val intent = Intent(this, ResultatActivity::class.java)
                        intent.putExtra(Constans.mUserName, UserName)
                        intent.putExtra(Constans.mCorrectAnswers, CorrectAnswers)
                        intent.putExtra(Constans.mTotalQuestion, QuestionsList!!.size)
                        startActivity(intent)
                        finish()
                    }
                    }
                }else{
                    val question = QuestionsList?.get(CurrentPosition -1)
                    if(question!!.correctOption != SelectedOptionPosition){

                    }else{
                        CorrectAnswers++
                    }


                    if (CurrentPosition == QuestionsList!!.size){
                        answerButton.text = "FINSIH"
                    }else{
                        answerButton.text = "NEXT"
                    }
                    SelectedOptionPosition = 0
                }
                answerButton.isEnabled = true
                OptionOne.isEnabled = false
                OptionTwo.isEnabled = false
                OptionThree.isEnabled = false
            }

            R.id.answerButton -> {
                answerButton.isEnabled = false
                OptionOne.isEnabled = true
                OptionTwo.isEnabled = true
                OptionThree.isEnabled = true
                if (SelectedOptionPosition == 0){
                    CurrentPosition++

                    when{
                        CurrentPosition <= QuestionsList!!.size ->{
                            setQuestion()
                        }else ->{
                            val intent = Intent(this, ResultatActivity::class.java)
                            intent.putExtra(Constans.mUserName, UserName)
                            intent.putExtra(Constans.mCorrectAnswers, CorrectAnswers)
                            intent.putExtra(Constans.mTotalQuestion, QuestionsList!!.size)
                            startActivity(intent)
                            finish()
                        }
                    }
                }else{
                    val question = QuestionsList?.get(CurrentPosition -1)
                    if(question!!.correctOption != SelectedOptionPosition){

                    }else{
                        CorrectAnswers++
                    }


                    if (CurrentPosition == QuestionsList!!.size){
                        answerButton.text = "FINSIH"
                    }else{
                        answerButton.text = "NEXT"
                    }
                    SelectedOptionPosition = 0
                }
            }

        }

    }


    private fun answerView(answer: Int, drawableView: Int){
        when(answer){
            1 ->{
                OptionOne.background = ContextCompat.getDrawable(
                    this, drawableView
                )
            }
            2 ->{
                OptionTwo.background = ContextCompat.getDrawable(
                    this,drawableView
                )
            }
            3 ->{
                OptionThree.background = ContextCompat.getDrawable(
                    this, drawableView
                )
            }
        }
    }

    private fun selectOption(textView: TextView, selectedOption: Int){
        defaultOptionsView()
        SelectedOptionPosition = selectedOption

        textView.setTextColor(Color.parseColor("#fffafa"))
        textView.setTypeface(textView.typeface, Typeface.BOLD)
        textView.background = ContextCompat.getDrawable(this,
            R.drawable.question_one
        )
    }
}