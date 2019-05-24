package com.cat9tac.kotlinpractice

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.longToast
import org.jetbrains.anko.uiThread

class MainActivity : AppCompatActivity() {
    private val items = listOf(
        "Mon 6/23 - Sunny - 31/17",
        "Tue 6/24 - Foggy - 21/8",
        "Wed 6/25 - Cloudy - 22/17",
        "Thers 6/26 - Rainy - 18/11",
        "Fri 6/27 - Foggy - 20/10",
        "Sat 6/28 - TRAPPED IN WEATHERSTATION - 23/18",
        "Sun 6/29 - Sunny - 20/7"
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val forrecastList = findViewById(R.id.forecast_list) as RecyclerView
        forrecastList.layoutManager = LinearLayoutManager(this)
        forrecastList.adapter = ForecastListAdapter(items)
        val url = "https://www.baidu.com/"
        doAsync {
            Request(url).run()
            uiThread { longToast("Request performed") }
        }

    }
    val ViewGroup.childViews:List<View>
    get() = (0 until childCount).map{(getChildAt(it))}

    fun Context.toast(message: CharSequence,duration:Int = Toast.LENGTH_SHORT) {
        Toast.makeText(this,message,duration).show()
    }

    fun add(x: Int, y: Int): Int = x + y

    fun toast(message: String,
              tag: String = MainActivity::class.java.simpleName,
              length: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(this,"[$tag] $message",length).show()
    }
}
