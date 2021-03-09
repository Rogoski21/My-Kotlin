package com.cursoandroid.appsorteio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sortearNumero(view: View) {

        var texto = findViewById<TextView>(R.id.textoSorteio)
        texto.text = "Numero sorteado: " + Random.nextInt(11)
    }
}