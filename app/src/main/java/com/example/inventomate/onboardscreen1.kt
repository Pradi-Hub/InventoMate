package com.example.inventomate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class onboardscreen1 : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboardscreen1)

        var skip1:Button = findViewById(R.id.skip1)
        var next1:Button = findViewById(R.id.next1)

        skip1.setOnClickListener(this)
        next1.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.skip1 -> {
                val intent = Intent(this, onboardscreen3::class.java)
                startActivity(intent)
                finish()
            }
            R.id.next1 -> {
                val intent = Intent(this, onboardscreen2::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}