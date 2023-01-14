package com.example.uno2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class ForgetPassword : AppCompatActivity() {
    @SuppressLint("ResourceAsColor")
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
        val button12 = findViewById<Button>(R.id.button12)
        button12.setOnClickListener{
            Toast.makeText(applicationContext, "Ваш запрос по изменеию пароля был отправлен!", Toast.LENGTH_SHORT).show()
        }
    }
    private fun HideActionBar() {
        supportActionBar?.hide()
    }
}