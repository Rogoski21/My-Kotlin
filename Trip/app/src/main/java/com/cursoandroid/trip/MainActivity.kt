package com.cursoandroid.trip

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun pageViagem(veiw: View) {
        val button = findViewById<Button>(R.id.comprar)
        button.setOnClickListener {
            button.setOnClickListener {

                val intent = Intent(this, Carrinho::class.java)
                startActivity(intent)
            }
        }
    }
/*
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


 */


}
