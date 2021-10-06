package com.example.quiz_lab6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_shopping.*

class Shopping : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping)
        img_tv.setOnClickListener {
            startActivity(Intent(this, Category_Details::class.java).putExtra("category", "electronic"))

        }
        img_clothing.setOnClickListener {
            startActivity(Intent(this, Category_Details::class.java).putExtra("category", "clothing"))
        }
        img_food.setOnClickListener {
            startActivity(Intent(this, Category_Details::class.java).putExtra("category", "food"))
        }
        img_lipstick.setOnClickListener {
            startActivity(Intent(this, Category_Details::class.java).putExtra("category", "beauty"))
        }
    }
}