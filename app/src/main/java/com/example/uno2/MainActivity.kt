package com.example.uno2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.widget.ImageView
import android.widget.Toast

class  MainActivity : AppCompatActivity() {
    private var downTimer: Int = 1000


    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        HideActionBar()

        Handler().postDelayed({
            val intent = Intent(this, PasswordPage::class.java)
            startActivity(intent)
            finish()
        }, downTimer.toLong())
    }

    private fun HideActionBar() {
        supportActionBar?.hide()
    }
}