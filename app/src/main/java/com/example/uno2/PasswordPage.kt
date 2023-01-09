package com.example.uno2

import android.annotation.SuppressLint
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.ArrayList

open class PasswordPage : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_password_page)
        HideActionBar()
        val textViewForgetPassword = findViewById<TextView>(R.id.textViewForgetPassword)
        textViewForgetPassword.setOnClickListener {
            val intent = Intent(this, ForgetPassword::class.java)
            startActivity(intent)
            finish()
        }
        val button1 = findViewById<TextView>(R.id.button1)
        button1.setOnClickListener {
            val intent = Intent(this, Large_Main_Page::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun HideActionBar() {
        supportActionBar?.hide()
    }
}