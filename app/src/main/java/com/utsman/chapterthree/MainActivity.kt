package com.utsman.chapterthree

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private val tvHasil: TextView by lazy {
        findViewById(R.id.tv_hasil)
    }

    private val kotak: Kotak by lazy {
        Kotak(10.0, 5.0)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val luasKotak = kotak.luas()
        tvHasil.text = "$luasKotak"
    }
}