package com.example.walmartLab5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_register.*

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        btn_create.setOnClickListener {
            if (!edit_firstname.text.isEmpty() || !edit_lastname.text.isEmpty() || !edit_email.text.isEmpty() || !edit_password.text.isEmpty()) {
                var newAccInfo = User(edit_email.text.toString(), edit_password.text.toString(), edit_firstname.text.toString(), edit_lastname.text.toString())
                val intent = Intent()
                intent.putExtra("user", newAccInfo)
                setResult(RESULT_OK, intent)
                finish()
            } else {
                Toast.makeText(this, "Please enter your * information!", Toast.LENGTH_LONG).show()
            }
        }
    }

    fun isRegisterable () {

    }
}