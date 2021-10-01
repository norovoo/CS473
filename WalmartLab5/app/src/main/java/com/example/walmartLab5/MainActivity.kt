package com.example.walmartLab5

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.walmartLab5.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_register.*

class MainActivity : AppCompatActivity() {
    var user1 = User("notgonbayar@miu.edu", "noro123", "Norovdorj", "Otgonbayar")
    var user2 = User("uenebish@miu.edu", "noro123", "Undraa", "Enebish")
    var user3 = User("egalbadrakh@miu.edu", "noro123", "Enkhee", "Hana")
    var user4 = User("gbayarsaikhan@miu.edu", "noro123", "Ganzorig", "Bayarsaikhan")

    var users = ArrayList<User>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        signIn()
        btn_newAcc.setOnClickListener {
            val registerIntent = Intent(this, Register::class.java)
            startActivityForResult(registerIntent,200)

        }


    }

    open override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 200 && resultCode == Activity.RESULT_OK) {
            val test = data?.getSerializableExtra("user") as User

            users.add(test)
            println(test.username)
            Toast.makeText(this, "Successfully created", Toast.LENGTH_LONG).show()
        }
    }
    fun forgetPass(view: View) {
        for (i in users) {
            if (i.username == etxt_email.text.toString()) {
                val browserIntent = Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:"))
                browserIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf(i.username))
                browserIntent.putExtra(Intent.EXTRA_SUBJECT, "Your password information (SECURE)!!!")
                browserIntent.putExtra(Intent.EXTRA_TEXT, "Your forgotten password is ${i.password}")
                startActivity(Intent.createChooser(browserIntent, "Choose your mail app"));
                return
            }
        }
        Toast.makeText(this, "We don't have any username!", Toast.LENGTH_SHORT).show()

    }

    fun signIn() {
        btn_signIn.setOnClickListener {
            for (i in users) {
                if (i.username == etxt_email.text.toString() && i.password == etxt_pass.text.toString()) {
                    val shoppingIntent = Intent(this, OnlineShop::class.java)
                    shoppingIntent.putExtra("email", "Welcome " + i.username + "!")
                    startActivity(shoppingIntent)
                    return@setOnClickListener
                }
            }
            Toast.makeText(applicationContext, "Username or Password is incorrect!", Toast.LENGTH_SHORT).show()
        }
    }


}