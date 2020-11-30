package data

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase

abstract class Userdatabase:RoomDatabase() {
    abstract class UserDatabase: RoomDatabase (){



        abstract fun userDaO(): UserDao

        companion object {
            @Volatile
            private var INSTANCE: Userdatabase? = null

            fun getDatabase(context: Context):Userdatabase{
             val tempInstance = INSTANCE
              if(tempInstance != null){
                  return  tempInstance
              }

              synchronized(this){
                  val instance = Room.databaseBuilder(
                      context.applicationContext,Userdatabase::class.java,
                      "User_table"
                  ).build()
                  INSTANCE = instance
                  return instance
              }

            }

        }


    }
}