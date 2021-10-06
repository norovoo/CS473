package com.example.quiz_lab6

import android.app.AlertDialog
import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_quiz.*
import java.lang.String.format
import java.util.*

class Quiz : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)
        submit_quiz.setOnClickListener {
            var point:Int = 0;
            if(choose1_2.isChecked) {
                point += 50;
            }
            if (choose2_1.isChecked) {
                point += 25;
            }
            if (choose2_2.isChecked) {
                point += 25;
            }
            AlertDialog.Builder(this).setTitle("Congratulations!").setMessage("Submitted on:${Date()}. " +
                    "Your score is: $point.").create().show()
        }
        btn_reset.setOnClickListener {
            radiobtn_group.clearCheck()
            choose2_1.isChecked = false;
            choose2_2.isChecked = false;
            choose2_3.isChecked = false;
        }
    }
}