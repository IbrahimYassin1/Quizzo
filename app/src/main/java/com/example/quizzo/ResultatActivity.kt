package com.example.quizzo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.quizzo.Database.AppDatabase
import com.example.quizzo.Database.User
import kotlinx.android.synthetic.main.activity_resultat.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ResultatActivity : AppCompatActivity() {
    private lateinit var db: AppDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultat)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val username = intent.getStringExtra(Constans.mUserName)
        tv_username.text = username
        val totalQuestions = intent.getIntExtra(Constans.mTotalQuestion, 0)
        val correctAnswers = intent.getIntExtra(Constans.mCorrectAnswers, 0)

        tv_score.text = "Your score is $correctAnswers out of $totalQuestions"

        val item = User(0,username,correctAnswers)

        db = AppDatabase.invoke(this)


        CoroutineScope(Dispatchers.IO).launch{
            db.userDao().insert(item)
        }

        btn_finish.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}