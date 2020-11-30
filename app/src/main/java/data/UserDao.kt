package data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import java.net.UnknownServiceException

@Dao
interface UserDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addUser (user:User)

    @Query("SELECT * FROM user_table ORDER BY id ASC")
    fun alldata(): LiveData <List<User>>

}