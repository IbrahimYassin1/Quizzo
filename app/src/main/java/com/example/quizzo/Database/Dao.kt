package com.example.quizzo.Database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.quizzo.Question

@Dao
interface Dao{

    @Insert
     fun insert(user: User)


    @Delete
    fun delete(user: User)


    @Query("SELECT * FROM  Quiz_table")
    fun getAll(): List <User>

}
