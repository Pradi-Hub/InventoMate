package com.example.inventomate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.content.Intent

class Login : AppCompatActivity(), View.OnClickListener  {

    lateinit var btnLogin:Button
    //lateinit var Button btnSignup;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnLogin = findViewById(R.id.login)
        var btnSignup = findViewById<Button>(R.id.signup)

        btnLogin.setOnClickListener(this)
        btnSignup.setOnClickListener(this)
    }
    override fun onClick(v: View) {
        when (v.id) {
            R.id.login -> {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            }
            R.id.signup -> {
                val intent = Intent(this, SignUp::class.java)
                startActivity(intent)
                finish()
            }
        }
    }

}