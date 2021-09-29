package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var foods = ArrayList<String>(arrayListOf("Hamburger","Pizza", "Mexican", "American", "Chinese"))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    open fun addFood(food:String) {
        foods.add(food)
        Toast.makeText(applicationContext, "Added",  Toast.LENGTH_SHORT).show()
        findViewById<EditText>(R.id.input_txt).text.clear()
    }

    open fun decide() :String  {
        if (foods.size == 0) {
            Toast.makeText(applicationContext, "Please add food names first!",  Toast.LENGTH_SHORT).show()
            return ""
        }
        return foods.random()
    }

    fun addFood(view: android.view.View) {
        if (findViewById<EditText>(R.id.input_txt).text.toString().isEmpty()) {
            Toast.makeText(applicationContext, "Please enter your food name!",  Toast.LENGTH_SHORT).show()
        } else {
            addFood(findViewById<EditText>(R.id.input_txt).text.toString())
        }

    }

    fun ac_decide(view: android.view.View) {
        findViewById<TextView>(R.id.txt).text = decide()
    }
}