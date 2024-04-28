package com.example.inventomate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.content.Intent
import android.widget.ImageButton


class Stocks : AppCompatActivity(), View.OnClickListener {
    lateinit var btnHome: ImageButton
    lateinit var btnReport: ImageButton
    lateinit var btnProfile: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stocks)

        btnHome = findViewById(R.id.home)
        btnReport = findViewById(R.id.report)
        btnProfile = findViewById(R.id.profile)

        btnHome.setOnClickListener(this)
        btnReport.setOnClickListener(this)
        btnProfile.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.report -> {
                val intent = Intent(this, Report::class.java)
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
