package com.example.inventomate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class EditProfile : AppCompatActivity(), View.OnClickListener {
    lateinit var btnSave:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)

        btnSave = findViewById(R.id.Save)
        btnSave.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.Save -> {
                val intent = Intent(this, Profile::class.java)
                startActivity(intent)
            }
        }
    }
}