package com.example.inventomate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class onboardscreen3 : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboardscreen3)

        var getstarted: Button = findViewById(R.id.getstarted)

        getstarted.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.getstarted -> {
                val intent = Intent(this, Login::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}