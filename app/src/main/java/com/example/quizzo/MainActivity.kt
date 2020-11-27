package com.example.quizzo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.room.Room
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var db : AppQuizDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        db = Room.databaseBuilder(applicationContext,AppQuizDatabase::class.java, "Quizzo-Questions")
            .fallbackToDestructiveMigration()
            .build()
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val Quizdata = Quizdata(0,"Quest","sport")


        startbutton.setOnClickListener {
            if (et_name.text.toString().isEmpty()){
                Toast.makeText(this,
                    "Please enter your name", Toast.LENGTH_SHORT).show()
            }else{
                val intent = Intent(this, QuizzoQuestionsActivity::class.java)
                intent.putExtra(Constans.mUserName, et_name.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }

}

