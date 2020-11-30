package data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName = "User_table")
data class User(
    @PrimaryKey(autoGenerate = true)
    val id: Int
)