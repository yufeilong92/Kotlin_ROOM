package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.room.AppDataBase
import com.example.myapplication.room.Student
import com.example.myapplication.textRoom.Study
import com.example.myapplication.textRoom.StudyDataBase
import kotlinx.android.synthetic.main.activity_main3.*

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        initEvent()
        initListener()
        initViewModel()
    }

    private fun initEvent() {


    }
    var number=1
    private fun initListener() {
        val dbInstace = AppDataBase.getDBInstace(this)
        val studentDao = dbInstace.getStudentDao()
        btn_one.setOnClickListener {
            val s1 = Student(1, "s1", "小学")
            val s2 = Student(2, "s2", "中学")
            val s3 = Student(3, "s3", "高学")
            val s4 = Student(4, "s4", "大学")
            studentDao.insert(s1, s2, s3, s4)
        }
        btn_two.setOnClickListener {
            val allStudents = studentDao.getAllStudents()
            for (item in allStudents) {
                println(item.toString())
            }
        }
        val dataBase = StudyDataBase.getInstance(mContext = this)
        val dao = dataBase!!.getStudyInstance()

        btn_three.setOnClickListener {
            val st_1 = Study(null, "内容一", "学习一")
            val st_2 = Study(null, "内容二", "学习二")
            val st_3 = Study(null, "内容三", "学习三")
            val st_4 = Study(null, "内容四", "学习四")
            dao.insert(st_1, st_2, st_3, st_4)
        }
        btn_four.setOnClickListener {
            val all = dao.getAll()
            for (item in all) {
                println(item.toString())
            }
        }
        btn_five.setOnClickListener {
            number+=1
            val findName = dao.findName(3)
            findName.data="内容更新$number"
            dao.updata(findName)
        }
        btn_six.setOnClickListener {
            val findName = dao.findName(3)
            println(findName)
        }
        btn_server.setOnClickListener {
            dao.deleteStudy()
        }
    }

    private fun initViewModel() {


    }
}
