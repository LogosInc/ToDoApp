package com.example.todoapp.data

import android.content.Context
import androidx.room.*
import com.example.todoapp.data.models.ToDoData

@Database(entities = [ToDoData::class], version = 1, exportSchema = false)
@TypeConverters(Converter::class)
abstract class ToDoDataBase: RoomDatabase() {

    abstract fun  toDoDau(): ToDoDao

    companion object{

        @Volatile
        private var INSTANCE: ToDoDataBase? = null

        fun getDatabase(context: Context): ToDoDataBase{
            val  tempInstance = INSTANCE
            if (tempInstance != null){
                return tempInstance
            }

            synchronized(this){
                val instance = Room.databaseBuilder(
                        context.applicationContext,
                        ToDoDataBase::class.java,
                        "todo_database"
                ).build()
                INSTANCE = instance
                return  instance
            }
        }
    }
}