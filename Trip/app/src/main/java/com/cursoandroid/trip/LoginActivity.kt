package com.cursoandroid.trip

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener{

            val intent =  Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}

