package com.example.uno2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ForgetPassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forget_password)
        HideActionBar()
        val button = findViewById<TextView>(R.id.textView5)
        button.setOnClickListener {
            val intent = Intent(this, PasswordPage::class.java)
            startActivity(intent)
            finish()
        }
    }
    private fun HideActionBar() {
        supportActionBar?.hide()
    }
}