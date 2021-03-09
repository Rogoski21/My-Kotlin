package com.cursoandroid.gasolinaoualcoo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calcularPreco(view: View) {

        val precoAlcool = editPrecoAlccol.text.toString()
        val precoGasolina = editPrecoGasolina.text.toString()

        val validaCampos = validaCOmpos(precoAlcool, precoGasolina)

        if (validaCampos) {
            calcularMelhorPreco(precoAlcool, precoGasolina)

        } else {
            textResultado.text = "Preencha os precos primeiro"
        }
    }

    fun calcularMelhorPreco(precoAlcool: String, precoGasolina: String) {

        val valorAlcool = precoAlcool.toDouble()
        val valorGasolina = precoGasolina.toDouble()

        if ((valorAlcool / valorGasolina) >= 0.7) {
            textResultado.text = "Melhor usar gasolina"
        } else {
            textResultado.text = "Melhor usar alcool"
        }

    }

    fun validaCOmpos(precoAlcool: String, precoGasolina: String): Boolean {

        var camposValidados: Boolean = true
        if (precoAlcool == null || precoAlcool.equals("")) {
            camposValidados = false
        }
        if (precoGasolina == null || precoGasolina.equals("")) {
            camposValidados = false
        }
        return camposValidados
    }
}