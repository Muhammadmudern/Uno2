package com.example.uno2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.google.android.material.textfield.TextInputLayout

class ForgetPassword : AppCompatActivity() {

    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forget_password)
        HideActionBar()
        val button = findViewById<TextView>(R.id.textView5)
        val editText= findViewById<EditText>(R.id.editTextTextEmailAddress)

        button.setOnClickListener {
            val intent = Intent(this, PasswordPage::class.java)
            startActivity(intent)
            finish()
        }
        val button12 = findViewById<Button>(R.id.button12)
        button12.setOnClickListener{
            val text = editText.text
            if("@" in text){
                Toast.makeText(applicationContext, "Ваш запрос по изменеию пароля был отправлен!  ${text}", Toast.LENGTH_SHORT).show()
                Thread.sleep(300)
                val intent = Intent(this, PasswordPage::class.java)
                startActivity(intent)
                finish()
                }
            else{
                text.clear()
                 editText.error = "Не верныйй mail"
                }
            }
        }

    private fun HideActionBar() {
        supportActionBar?.hide()
    }
}
