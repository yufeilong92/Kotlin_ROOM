package com.example.myapplication.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

/**
 * @Author : YFL  is Creating a porject in My Application
 * @Package com.example.myapplication.room
 * @Email : yufeilong92@163.com
 * @Time :2019/12/2 16:41
 * @Purpose :
 */
@Dao
interface StudentDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(element:Student)
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(vararg  element:Student)
    @Query("select * from Student")
    fun getAllStudents():MutableList<Student>

    @Query("select * from Student where studentID = :studentID")
    fun getStudnet(studentID:Int):Student

    @Query("select * from Student order by studentID desc ")
    fun getAllByDateDesc():MutableList<Student>

    @Query("delete from Student")
    fun deleteAll()

}