package data

import androidx.room.Entity

@Entity (tableName = "User_table")
data class User(
    val id: Int
)