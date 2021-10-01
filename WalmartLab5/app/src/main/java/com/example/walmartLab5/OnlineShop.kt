package com.example.walmartLab5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_online_shop.*

class OnlineShop : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_online_shop)
        welcome.text = intent.getStringExtra("email")
        img_tv.setOnClickListener {
            Toast.makeText(this, "Hi there! Your choose is: "+ txt_tv.text.toString() + ".", Toast.LENGTH_LONG).show()
        }
        img_clothing.setOnClickListener {
            Toast.makeText(this, "Hi there! Your choose is: "+ txt_clothing.text.toString() + ".", Toast.LENGTH_LONG).show()
        }
        img_lipstick.setOnClickListener {
            Toast.makeText(this, "Hi there! Your choose is: "+ txt_lipstick.text.toString() + ".", Toast.LENGTH_LONG).show()
        }
        img_food.setOnClickListener {
            Toast.makeText(this, "Hi there! Your choose is: "+ txt_food.text.toString() + ".", Toast.LENGTH_LONG).show()
        }
    }

}