package com.example.uno2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        HideActionBar()
        val button = findViewById<Button>(R.id.button)
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