package com.tech.arno.oreo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.longToast
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    fun init() {
        //测试简单简化
        tv_hello.text = "Hello Kotlin!"
        tv_hello.setOnClickListener { toast("点击") }
        tv_hello.setOnLongClickListener { longToast("长按"); true }

        //声明变量
//        val origin:Float = 65.0f
        val origin = 65.0f
        tv_hello.text = origin.toString()

//        val int_array: IntArray = intArrayOf(1, 2, 3)
        val int_array = intArrayOf(1, 2, 3)
        val string_array: Array<String> = arrayOf("How", "Are", "You")

        toast("字符串值为${string_array.get(1)}")
        //转义输出 ${'xxx'}
//        toast("美元符号为${'$'}")

        var test = 0
        when (test) {
            0 -> toast(0)
            1 -> toast(1)


            else -> toast("else")

        }

    }
}
