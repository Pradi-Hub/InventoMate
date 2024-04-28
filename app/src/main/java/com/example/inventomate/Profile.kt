package com.example.inventomate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.content.Intent
import android.widget.ImageButton

class Profile : AppCompatActivity(), View.OnClickListener {
    lateinit var btnHome: ImageButton
    lateinit var btnStock: ImageButton
    lateinit var btnReport: ImageButton
    lateinit var btnEdit: Button
    lateinit var btnLogout: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        btnHome = findViewById(R.id.home)
        btnStock = findViewById(R.id.stock)
        btnReport = findViewById(R.id.report)
        btnEdit = findViewById(R.id.btnedit)
        btnLogout = findViewById(R.id.btnLogout)

        btnLogout.setOnClickListener(this)
        btnHome.setOnClickListener(this)
        btnStock.setOnClickListener(this)
        btnReport.setOnClickListener(this)
        btnEdit.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.stock -> {
                val intent = Intent(this, Stocks::class.java)
                startActivity(intent)
            }
            R.id.report -> {
                val intent = Intent(this, Report::class.java)
                startActivity(intent)
            }

            R.id.home -> {
             val intent = Intent(this, MainActivity::class.java)
             startActivity(intent)
            }

            R.id.btnedit -> {
                val intent = Intent(this, EditProfile::class.java)
                startActivity(intent)
            }
            R.id.btnLogout -> {
                val intent = Intent(this, Login::class.java)
                startActivity(intent)
            }
        }
    }

}
