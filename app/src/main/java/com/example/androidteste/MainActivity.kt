package com.example.androidteste

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.androidteste.Result

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast", "CutPasteId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Botao de envio de informaçoes
        val btnEnviar = findViewById<Button>(R.id.btn_enviar)
        // Exibir informaçoes
        val txtResult = findViewById<TextView>(R.id.txt_result)
        // Inserir informaçoes
        val edText = findViewById<EditText>(R.id.edText)
        // Abrir tela
        val inputName = edText.text

        // Variavel que armazena inf inseridas
        val abrirNovaTela = findViewById<Button>(R.id.btnNovaTela)


        // Botao que exibe as informaçoes
        btnEnviar.setOnClickListener {

           // Verificar se existe algo digitado no campo
            if (inputName.isBlank()) {
                edText.error = "Esse campo não pode estar vazio"
            } else {
                txtResult.text = edText.text
                btnEnviar.text = edText.text
            }
        }


        // botao para abrir a nova tela
        abrirNovaTela.setOnClickListener {

            // Conversao da inf p/ string
            val nomeDigitado = edText.text.toString()

            // Criaçao da intensao
            val abrirNovaTela = Intent(this, Result::class.java)

            // Envio da inf para a outra act
            abrirNovaTela.putExtra("RESULTADO", nomeDigitado )

            // Execuçao da intençao
            startActivity(abrirNovaTela)


        }
    }
}