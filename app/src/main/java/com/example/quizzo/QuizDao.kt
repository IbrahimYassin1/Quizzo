package com.example.quizzo

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface QuizDao {

     //Här Sätter jag in
    @Insert
    fun insertAllData(quiz:Quizdata)

    // Här raderar jag
    @Delete
    fun delete(quiz: Quizdata)

    //Hämtar data från min table name som är QuizzoData
    @Query("SELECT * FROM QuizzoData")
    fun getAll (): List<Quizdata>


}