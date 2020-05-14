package com.example.basicgrammar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class BasicGrammarActivity : AppCompatActivity() {
    companion object {
        private val TAG = BasicGrammarActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basic_grammar)
        val string = "i am kotlin"
        val int = 1314
        val long = 1314L
        val float = 13.14f
        val double = 13.14
        val double2 = 10.1e6

        Log.d(TAG, "CLASS NAME :" + string.javaClass.name)
        Log.d(TAG, "CLASS NAME :" + int.javaClass.name)
        Log.d(TAG, "CLASS NAME :" + long.javaClass.name)
        Log.d(TAG, "CLASS NAME :" + float.javaClass.name)
        Log.d(TAG, "CLASS NAME :" + double.javaClass.name)
        Log.d(TAG, "CLASS NAME :" + double2.javaClass.name)
        Log.d(TAG, "fun sum 1 + 2 = " + sum(1,2))
        Log.d(TAG, "fun sum1 1 + 2 = " + sum1(1,2))
        Log.d(TAG, "fun foo 5 = " + foo(5))
    }

    //代码块函数体
    fun sum(x: Int, y: Int): Int {
        return x + y
    }
    //表达式函数体
    fun sum1(x: Int, y: Int) = x + y
    //error 类型检查遇到了递归问题。 最简单的解决方法：显式指定声明的类型
    //当前编译器不能针对递归函数的情况推到类型，复杂情况下我们需要显示生命类型
    //fun foo(n: Int) = if (n == 0) 1 else n * foo(n - 1)

    fun foo(n: Int): Int = if (n == 0) 1 else n * foo(n - 1)


}
