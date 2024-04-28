package com.example.inventomate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.content.Intent
import android.widget.ImageButton


class Report : AppCompatActivity(), View.OnClickListener {
    lateinit var btnHome: ImageButton
    lateinit var btnStock: ImageButton
    lateinit var btnProfile: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_report)

        btnHome = findViewById(R.id.home)
        btnStock = findViewById(R.id.stock)
        btnProfile = findViewById(R.id.profile)

        btnHome.setOnClickListener(this)
        btnStock.setOnClickListener(this)
        btnProfile.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.stock -> {
                val intent = Intent(this, Stocks::class.java)
                startActivity(intent)
            }

            R.id.profile -> {
                val intent = Intent(this, Profile::class.java)
                startActivity(intent)
            }

            R.id.home -> {
             val intent = Intent(this, MainActivity::class.java)
             startActivity(intent)
            }
        }
    }

}
