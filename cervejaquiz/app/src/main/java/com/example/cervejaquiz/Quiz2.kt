package com.example.cervejaquiz

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Quiz2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_quiz2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val butaoSim: Button = findViewById(R.id.butaoSim)
        val butaoNao: Button = findViewById(R.id.butaoNao)

        val resposta1 = intent.getIntExtra("resposta1", 0)

        butaoSim.setOnClickListener {
            val intent = Intent(this, Quiz3::class.java)
            intent.putExtra("resposta1", resposta1)
            intent.putExtra("resposta2", 1)
            startActivity(intent)
        }

        butaoNao.setOnClickListener {
            val intent = Intent(this, Quiz3::class.java)
            intent.putExtra("resposta1", resposta1)
            intent.putExtra("resposta2", 0)
            startActivity(intent)
        }
    }
}