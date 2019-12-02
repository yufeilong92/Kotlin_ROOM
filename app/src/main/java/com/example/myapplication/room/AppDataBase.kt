package com.example.myapplication.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.myapplication.MyApplication

/**
 * @Author : YFL  is Creating a porject in My Application
 * @Package com.example.myapplication.room
 * @Email : yufeilong92@163.com
 * @Time :2019/12/2 16:42
 * @Purpose :
 */
@Database(entities = [Student::class], version = 1)
abstract class AppDataBase() : RoomDatabase() {
    companion object {//被companion object包裹的语句都是private的

        @Volatile
        private var instance: AppDataBase? = null

        fun getDBInstace(mContext: Context): AppDataBase {

            if (instance == null) {

                synchronized(AppDataBase::class) {

                    if (instance == null) {

                        instance = Room.databaseBuilder(
                            mContext,
                            AppDataBase::class.java,
                            "User.db"
                        )
                            .allowMainThreadQueries()
                            .build()
                    }
                }
            }
            return instance!!

        }

    }
    abstract fun getStudentDao(): StudentDao
}