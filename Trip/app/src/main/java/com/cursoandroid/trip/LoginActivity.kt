package com.cursoandroid.trip

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class LoginActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val button = findViewById<Button>(R.id.entrar)
        button.setOnClickListener {

            val intent = Intent(this, Carrinho::class.java)
            startActivity(intent)
        }

    }
/*
    fun nextPage(view: View) {
        val button = findViewById<Button>(R.id.entrar)
        button.setOnClickListener {

            val intent = Intent(this, Shopping::class.java)
            startActivity(intent)
        }
    }

 */
}

