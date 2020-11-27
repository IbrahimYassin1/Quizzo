package com.example.quizzo

import androidx.room.Database
import androidx.room.RoomDatabase

abstract class AppQuizDatabase : RoomDatabase(){
    @Database(entities = arrayOf(Quizdata::class),version = 1)
    abstract class AppQuizDatabase : RoomDatabase () {
     abstract fun quiz (): QuizDao
    }

}