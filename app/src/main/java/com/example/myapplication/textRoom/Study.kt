package com.example.myapplication.textRoom

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * @Author : YFL  is Creating a porject in My Application
 * @Package com.example.myapplication.textRoom
 * @Email : yufeilong92@163.com
 * @Time :2019/12/2 17:13
 * @Purpose :
 */
@Entity(tableName = "study")
data class Study(
    @PrimaryKey(autoGenerate = true)
    var uid: Int?,
    @ColumnInfo(name = "content")
    var content: String,
    @ColumnInfo(name = "data")
    var data: String

) {

}