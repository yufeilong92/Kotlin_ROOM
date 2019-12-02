package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {
    var mList: MutableList<String>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        mList = getCode()
        val adapter = ImagerAdapter(this, mList!!)
        val g = GridLayoutManager(this, 1)
        rlv.layoutManager = g
        rlv.adapter = adapter
        btn_more.setOnClickListener {

            Handler().postDelayed({
                mList!!.addAll(getCode())
                adapter.notifyDataSetChanged()
            }, 1000)
        }
    }

    private fun getCode(): MutableList<String> {
        val list = mutableListOf<String>()
        for (item in 0 until 10) {
            list.add("http://i1.sinaimg.cn/ent/d/2008-06-04/U105P28T3D2048907F326DT20080604225106.jpg")
        }
        return list
    }
}
