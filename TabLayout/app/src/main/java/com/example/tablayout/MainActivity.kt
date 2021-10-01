package com.example.tablayout

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TableRow
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_add.setOnClickListener {
            if (!androidName.text.isEmpty() && !androidVersion.text.isEmpty()) {
                val tableRow = TableRow(getApplicationContext())
                val layoutParams = TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT)
                tableRow.setLayoutParams(layoutParams)
                val column1 = TextView(this)
                column1.text = androidVersion.text.toString()
                column1.setBackgroundColor(Color.parseColor("#be2edd"))
                val column2 = TextView(this)
                column2.setBackgroundColor(Color.parseColor("#be2edd"))
                column2.text = androidName.text.toString()
                tableRow.addView(column1)
                tableRow.addView(column2)
                tableRow.setPadding(0,5,0,0)
                table.addView(tableRow)
//                androidName.text.clear()
//                androidVersion.text.clear()
                Toast.makeText(applicationContext, "Successfully added",  Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(applicationContext, "Please enter your full information",  Toast.LENGTH_SHORT).show()
            }

        }
    }

}