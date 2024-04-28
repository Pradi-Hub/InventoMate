package com.example.inventomate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class onboardscreen2 : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboardscreen2)

        var back1: Button = findViewById(R.id.back1)
        var next2: Button = findViewById(R.id.next2)

        back1.setOnClickListener(this)
        next2.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.back1 -> {
                val intent = Intent(this, onboardscreen1::class.java)
                startActivity(intent)
                finish()
            }
            R.id.next2 -> {
                val intent = Intent(this, onboardscreen3::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}