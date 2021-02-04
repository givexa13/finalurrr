package com.example.quiz

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MtavariActivity : AppCompatActivity() {
    private lateinit var startButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mtavari)


        startButton = findViewById(R.id.btn_start)
        startButton.setOnClickListener {
            val intent = Intent(this,QuizQuestionsActivity::class.java)
            startActivity(intent)
            finish()
        }


    }
}