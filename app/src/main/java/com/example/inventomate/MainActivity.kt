package com.example.inventomate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.content.Intent
import android.widget.ImageButton
import com.example.inventomate.R


class MainActivity : AppCompatActivity(),View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnStock:ImageButton=findViewById(R.id.stock)
        var btnReport:ImageButton = findViewById(R.id.report)
        var btnProfile:ImageButton = findViewById(R.id.profile)

        btnStock.setOnClickListener(this)
        btnReport.setOnClickListener(this)
        btnProfile.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.stock -> {
                val intent = Intent(this, Stocks::class.java)
                startActivity(intent)
                finish()
            }
            R.id.report -> {
                val intent = Intent(this, Report::class.java)
                startActivity(intent)
                finish()
            }
            R.id.profile -> {
                val intent = Intent(this, Profile::class.java)
                startActivity(intent)
                finish()
            }
        }
    }

}
