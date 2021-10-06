package com.example.quiz_lab6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //QUIZ
        quiz.setOnClickListener {
            startActivity(Intent(applicationContext, Quiz::class.java))
        }
        //Shopping
        shopping.setOnClickListener {
            startActivity(Intent(this, Shopping::class.java))
        }
        //Details
        details.setOnClickListener {
            startActivity(Intent(this, Details::class.java))
        }
    }
}