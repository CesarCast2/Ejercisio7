package com.example.ejercisio7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Tecladito : AppCompatActivity() {
    lateinit var txtMostrar : TextView
    var inputText: String = ""



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tecladito)
        txtMostrar = findViewById(R.id.txtMostrar)
        val btn1: Button = findViewById(R.id.btn1)
        val btn2: Button = findViewById(R.id.btn2)
        val btn3: Button = findViewById(R.id.btn3)
        val btn4: Button = findViewById(R.id.btn4)
        val btnB: Button = findViewById(R.id.btnB)
        val btnC: Button = findViewById(R.id.btnC)

    btn1.setOnClickListener {
    agregaDigito(btn1.text.toString())
        }
btn2.setOnClickListener {
    agregaDigito(btn2.text.toString())
}
        btn3.setOnClickListener {
        agregaDigito(btn3.text.toString())
        }
        btn4.setOnClickListener {
            agregaDigito(btn4.text.toString())
        }
        btnB.setOnClickListener {
            borrarDigito()
        }
        btnC.setOnClickListener {
            agregaDigito(btnC.text.toString())
            limpiarTodo()
        }

    }
    private fun agregaDigito(digito: String){
    inputText +=digito
        actualizarTexto()
    }
        private fun borrarDigito(){
            if (inputText.isNotEmpty()) {
                inputText = inputText.substring(0, inputText.length - 1)
                actualizarTexto()
            }
        }
    private fun limpiarTodo() {
        inputText = ""
        actualizarTexto()
    }
    private fun actualizarTexto() {
        txtMostrar.text = inputText
    }
}