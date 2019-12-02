package com.example.myapplication.textRoom

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

/**
 * @Author : YFL  is Creating a porject in My Application
 * @Package com.example.myapplication.textRoom
 * @Email : yufeilong92@163.com
 * @Time :2019/12/2 17:19
 * @Purpose :
 */
@Database(entities = [Study::class],version = 1)
abstract class StudyDataBase : RoomDatabase() {
    companion object {//被companion object包裹的语句都是private的
        private var singletonInstance: StudyDataBase? = null

        @Synchronized
        fun getInstance(mContext: Context): StudyDataBase? {

            if (singletonInstance == null) {
                synchronized(StudyDataBase::class) {
                    if (singletonInstance == null) {
                        singletonInstance = Room.databaseBuilder(
                            mContext,
                            StudyDataBase::class.java,
                            "study.db"
                        )
                            .allowMainThreadQueries()
                            .build()
                    }
                }
            }

            return singletonInstance
        }
    }

    abstract fun getStudyInstance():StudyDao


}