package com.example.expensetracker

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Categories : AppCompatActivity() {

    private lateinit var catebtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categories)

        catebtn = findViewById(R.id.addCategory)
        catebtn.setOnClickListener {
            val intent = Intent(this, AddCategory::class.java)
            startActivity(intent)
        }
    }
}