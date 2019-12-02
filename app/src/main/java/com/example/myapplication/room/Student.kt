package com.example.myapplication.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * @Author : YFL  is Creating a porject in My Application
 * @Package com.example.myapplication.room
 * @Email : yufeilong92@163.com
 * @Time :2019/12/2 16:40
 * @Purpose :
 */
@Entity(tableName = "Student")
data class Student(

    @PrimaryKey(autoGenerate = true)
    var studentID: Int?,
    @ColumnInfo(name = "s_name")
    var studentName: String?,
    @ColumnInfo(name = "s_type")
    var studentType: String?

)
