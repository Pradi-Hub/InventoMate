package com.example.inventomate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.content.Intent

class SignUp : AppCompatActivity(), View.OnClickListener  {

    lateinit var btnCreateAcc:Button
    lateinit var btnBack:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        btnCreateAcc = findViewById(R.id.CreateAcc)
        btnBack = findViewById(R.id.back)

        btnCreateAcc.setOnClickListener(this)
        btnBack.setOnClickListener(this)
    }
    override fun onClick(v: View) {
        val intent = Intent(this, Login::class.java)
        when (v.id) {
            R.id.CreateAcc, R.id.back -> {
                startActivity(intent)
                finish()
            }
        }

    }
}