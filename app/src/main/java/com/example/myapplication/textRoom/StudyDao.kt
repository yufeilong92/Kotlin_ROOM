package com.example.myapplication.textRoom

import androidx.room.*

/**
 * @Author : YFL  is Creating a porject in My Application
 * @Package com.example.myapplication.textRoom
 * @Email : yufeilong92@163.com
 * @Time :2019/12/2 17:16
 * @Purpose :学习反射累
 */
@Dao
interface StudyDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(vararg study: Study)

    @Query("SELECT  * FROM STUDY")
    fun getAll(): List<Study>

    @Update
    fun updata(vararg study: Study)

    @Query("Select * from STUDY where uid =:id")
    fun findName(id: Int): Study

    @Delete()
    fun deleteStudy(study: Study)

    @Query("delete from  STUDY ")
    fun deleteStudy()

}