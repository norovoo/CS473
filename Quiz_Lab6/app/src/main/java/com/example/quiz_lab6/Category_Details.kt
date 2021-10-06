package com.example.quiz_lab6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_category_details.*
import kotlinx.android.synthetic.main.activity_main.*

class Category_Details : AppCompatActivity() {
    var electronicList: Array<String> = arrayOf("TV","Cellphone","Headphones","Laptop","Refricator")
    var beautyList: Array<String> = arrayOf("Lipstick","Mist","Cream","Eyelash","Mirror")
    var foodList: Array<String> = arrayOf("Burger","Sandwich","Buuz","Huushuur","Vegetable soup")
    var clothingList: Array<String> = arrayOf("Jagger","Jacket","Coat","Boots","Hoodie")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category_details)
        when (intent.getStringExtra("category")) {
            "electronic" -> listview.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, electronicList)
            "beauty" -> listview.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, beautyList)
            "clothing" -> listview.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, clothingList)

            else -> listview.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, foodList)
        }
        listview.setOnItemClickListener { parent, _, position, _ ->
            Toast.makeText(this, parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show()
        }
    }
}