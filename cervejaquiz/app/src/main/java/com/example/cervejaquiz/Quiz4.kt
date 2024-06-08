package com.example.cervejaquiz

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Quiz4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_quiz4)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val butaoSim: Button = findViewById(R.id.butaoSim)
        val butaoNao: Button = findViewById(R.id.butaoNao)

        val resposta1 = intent.getIntExtra("resposta1", 0)
        val resposta2 = intent.getIntExtra("resposta2", 0)
        val resposta3 = intent.getIntExtra("resposta3", 0)

        val soma = resposta1 + resposta2 + resposta3 + 1

        if (soma > 2){
            butaoNao.setOnClickListener {
                val intent = Intent(this, Resultado3::class.java)
                startActivity(intent)
            }
        } else {
            butaoNao.setOnClickListener {
                val intent = Intent(this, Resultado2::class.java)
                startActivity(intent)
        }

        butaoSim.setOnClickListener {
            val intent = Intent(this, Resultado2::class.java)
            startActivity(intent)
        }
    }
}}