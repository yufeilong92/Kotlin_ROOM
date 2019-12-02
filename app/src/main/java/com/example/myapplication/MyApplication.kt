package com.example.myapplication

import android.app.Application

/**
 * @Author : YFL  is Creating a porject in My Application
 * @Package com.example.myapplication
 * @Email : yufeilong92@163.com
 * @Time :2019/12/2 16:43
 * @Purpose :
 */
class MyApplication : Application() {
    companion object {
        operator fun invoke(): Companion {
            return this
        }

        val instance = this
    }
}