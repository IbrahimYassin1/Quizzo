package com.example.quizzo

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "QuizzoData")
data class Quizdata (
    @PrimaryKey(autoGenerate = true)val id: Int,
    @ColumnInfo(name = "Quest")var question: String,
     @ColumnInfo(name = "SportQuiz")var category : String?)




