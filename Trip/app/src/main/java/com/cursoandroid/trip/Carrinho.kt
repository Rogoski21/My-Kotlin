package com.cursoandroid.trip

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Carrinho : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carrinho)
        startActivity(intent)
    }
}