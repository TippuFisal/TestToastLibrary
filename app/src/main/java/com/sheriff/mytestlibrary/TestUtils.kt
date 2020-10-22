package com.sheriff.mytestlibrary

import android.content.Context
import android.widget.Toast

object TestUtils {

    fun toastShort(context: Context,message:String){
        Toast.makeText(context,message,Toast.LENGTH_LONG).show()
    }

    fun toastLong(context: Context,message:String){
        Toast.makeText(context,message,Toast.LENGTH_LONG).show()
    }
}