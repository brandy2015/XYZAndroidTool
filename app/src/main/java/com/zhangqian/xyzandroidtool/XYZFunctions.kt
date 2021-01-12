package com.zhangqian.xyzandroidtool

import android.util.Log

class XYZFunctions {
}

@JvmName("PrintX1")
fun String.PrintX(){
    Log.d("已运行,输出控制台",this) }

fun PrintX(Message:String){
    Log.d("已运行,输出控制台",Message) }

fun PrintX(Message:Int){
    Log.d("已运行,输出控制台","${Message}") }

