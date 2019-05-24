package com.cat9tac.kotlinpractice

import android.util.Log
import java.net.URL

/**
 *  createtime: 2019/5/24
 *  author:  jessica
 *  fuction:
 */
class Request(private val url:String) {
    fun run(){
        val forecastJsonStr = URL(url).readText()
        Log.d(javaClass.simpleName,forecastJsonStr);
    }
}