package com.sparklead.core

import android.content.Context
import android.widget.Toast

object SparkleadToaster {

    fun simpleToast(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }
}