package com.cursoandroid.trip

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import com.getnet.posdigital.PosDigital

class LoginActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        connectPosDigitalService()

        val button = findViewById<Button>(R.id.entrar)
        button.setOnClickListener {

            val intent = Intent(this, Shopping::class.java)
            startActivity(intent)
        }

    }

    private fun connectPosDigitalService() {
        PosDigital.register(applicationContext, bindCallback)
    }

    override fun onDestroy() {
        super.onDestroy()
        try {
            if (PosDigital.getInstance().isInitiated)
                PosDigital.unregister(applicationContext)
        } catch (e: Exception) {
            Log.e("tag", "Erro de exception no Destroy da Activity")
        }
    }

    private val bindCallback: PosDigital.BindCallback
        get() = object : PosDigital.BindCallback {
            override fun onError(e: Exception) {
                if (PosDigital.getInstance().isInitiated)
                    PosDigital.unregister(applicationContext)

                connectPosDigitalService()
            }

            override fun onConnected() {}

            override fun onDisconnected() {
                connectPosDigitalService()
            }
        }

}

