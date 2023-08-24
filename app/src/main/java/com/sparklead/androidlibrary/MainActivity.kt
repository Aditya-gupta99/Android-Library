package com.sparklead.androidlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sparklead.core.SparkleadToaster

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        SparkleadToaster.simpleToast(this,"Simple Toast ....")

    }
}