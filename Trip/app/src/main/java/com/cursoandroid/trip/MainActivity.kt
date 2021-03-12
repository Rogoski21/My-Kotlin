package com.cursoandroid.trip

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    var sampleImage = intArrayOf(
        R.drawable.tehran,
        R.drawable.singapore,
        R.drawable.cazak,
        R.drawable.hongkong
    )

    var cities = arrayOf(
        "Tehra,",
        "Singapore",
        "Cazakstan",
        "Hong Kong"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        carouselView.pageCount = cities.size
    }
}