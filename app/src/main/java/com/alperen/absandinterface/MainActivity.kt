package com.alperen.absandinterface

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var myPiano = Piano()
        println( ""+ myPiano.roomName)
        myPiano.info()
    }
}