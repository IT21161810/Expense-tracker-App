package com.example.expensetracker

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Login : AppCompatActivity() {

    private lateinit var txtvw: TextView
    private  lateinit var catbtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        txtvw = findViewById<TextView>(R.id.signup)
        txtvw.setOnClickListener {
            val intent = Intent(this, Register::class.java)
            startActivity(intent)
        }
        catbtn = findViewById<Button>(R.id.catgoriesview)
        catbtn.setOnClickListener{
            val intent = Intent(this,Categories::class.java)
            startActivity(intent)
        }

    }
}
