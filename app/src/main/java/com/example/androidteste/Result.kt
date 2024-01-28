package com.example.androidteste

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Result : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result2)

        // Pegar a inf vinda da outra act
        val nomeDigitado = intent.getStringExtra("RESULTADO")

        // Botao voltar para a tela anterior
        val btnVoltar = findViewById<Button>(R.id.btnVoltar)

        // txt a ser exibida
        val txtResult = findViewById<TextView>(R.id.textResult)


        txtResult.text = nomeDigitado

        btnVoltar.setOnClickListener {
            finish()
        }
    }
}