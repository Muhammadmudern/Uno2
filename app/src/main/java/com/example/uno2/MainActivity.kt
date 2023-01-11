package com.example.uno2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var timer: CountDownTimer? = null
    private var downTimer: Int = 2000

    private fun DownTimer() {
        timer?.cancel()
        timer = object :CountDownTimer(downTimer.toLong(), 1000){
            override fun onTick(p0: Long) {
                downTimer-=1000
                Toast.makeText(applicationContext,"Timer is start ${downTimer}",Toast.LENGTH_LONG).show()
            }

            override fun onFinish() {
                Toast.makeText(applicationContext,"Timer is finish ${downTimer}",Toast.LENGTH_LONG).show()

            }
        }.start()
    }

    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        HideActionBar()
        val button = findViewById<ImageView>(R.id.swip)
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