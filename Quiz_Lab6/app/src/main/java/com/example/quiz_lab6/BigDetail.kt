package com.example.quiz_lab6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.*
import kotlinx.android.synthetic.main.activity_big_detail.*

class BigDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_big_detail)
        val product = intent.getSerializableExtra("prod") as Product
        img_BigImage.setImageResource(product.image)
        txt_BigTitle.text = product.title
        txt_BigColor.text = "Color: " + product.color
        txt_BigProdId.text = "Item ID#: " + product.itemid
        txt_BigDescription.text = "Item Description: " + product.desc
    }
}