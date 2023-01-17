package com.example.uno2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_password_page.*

open class PasswordPage : AppCompatActivity() {
    private var pressButton: MutableList<String> = arrayListOf()
    private lateinit var text0: String
    private lateinit var text1: String
    private lateinit var text2: String
    private lateinit var text3: String
    private lateinit var text4: String
    private lateinit var text5: String
    private lateinit var text6: String
    private lateinit var text7: String
    private lateinit var text8: String
    private lateinit var text9: String
    private var clickOnBackSpace: Int = 4
    private var true_Pass = listOf<String>("0","0","0","0")
    private lateinit var item: String


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

        val button0= findViewById<Button>(R.id.button0)
        button0.setOnClickListener {
            text0  = button0.text.toString()
            AddText(text0)
            passed_empty_circle()
        }
        val button1= findViewById<Button>(R.id.button1)
        button1.setOnClickListener {
            text1 = button1.text.toString()
            AddText(text1)
            passed_empty_circle()
        }
        val button2= findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            text2 = button2.text.toString()
            AddText(text2)
            passed_empty_circle()
        }
        val button3= findViewById<Button>(R.id.button3)
        button3.setOnClickListener {
            text3 = button3.text.toString()
            AddText(text3)
            passed_empty_circle()
        }
        val button4= findViewById<Button>(R.id.button4)
        button4.setOnClickListener {
            text4 = button4.text.toString()
            AddText(text4)
            passed_empty_circle()
        }
        val button5= findViewById<Button>(R.id.button5)
        button5.setOnClickListener {
            text5 = button5.text.toString()
            AddText(text5)
            passed_empty_circle()
        }
        val button6= findViewById<Button>(R.id.button6)
        button6.setOnClickListener {
            text6 = button6.text.toString()
            AddText(text6)
            passed_empty_circle()
        }
        val button7= findViewById<Button>(R.id.button7)
        button7.setOnClickListener {
            text7 = button7.text.toString()
            AddText(text7)
            passed_empty_circle()
        }
        val button8= findViewById<Button>(R.id.button8)
        button8.setOnClickListener {
            text8 = button8.text.toString()
            AddText(text8)
            passed_empty_circle()
        }
        val button9= findViewById<Button>(R.id.button9)
        button9.setOnClickListener {
            text9 = button9.text.toString()
            AddText(text9)
            passed_empty_circle()
        }
        val buttonbackspace = findViewById<Button>(R.id.buttonbackspace)
        buttonbackspace.setOnClickListener {
            OnPressBackSpace()
        }
    }

    private fun AddText(text: String){
        if (pressButton.size < 4){
            pressButton.add(text)
        }
    }

    private fun passed_empty_circle(){
        if(pressButton.size == 1){
            val view_01 = findViewById<View>(R.id.view_01)
            view_01.setBackgroundResource(R.drawable.elipse_pressed)
        }
        if(pressButton.size == 2){
            val view_02 = findViewById<View>(R.id.view_02)
            view_02.setBackgroundResource(R.drawable.elipse_pressed)
        }
        if (pressButton.size == 3){
            val view_03 = findViewById<View>(R.id.view_03)
            view_03.setBackgroundResource(R.drawable.elipse_pressed)
        }
        if(pressButton.size == 4){
            val view_04 = findViewById<View>(R.id.view_04)
            view_04.setBackgroundResource(R.drawable.elipse_pressed)
            if (true_Pass.toString().equals(pressButton.toString())){
                val intent = Intent(this, Large_Main_Page::class.java)
                startActivity(intent)
            }
            else{
                Toast.makeText(applicationContext, "Пароль не верный", Toast.LENGTH_SHORT).show()
            }
        }

    }

    private fun OnPressBackSpace(){
        if(pressButton.size  == 1){
            val view_01 = findViewById<View>(R.id.view_01)
            view_01.setBackgroundResource(R.drawable.elipse_code)
            pressButton.removeAt(pressButton.size-1)
        }
        if(pressButton.size  == 2){
            val view_02 = findViewById<View>(R.id.view_02)
            view_02.setBackgroundResource(R.drawable.elipse_code)
            pressButton.removeAt(pressButton.size-1)
        }
        if (pressButton.size  == 3){
            val view_03 = findViewById<View>(R.id.view_03)
            view_03.setBackgroundResource(R.drawable.elipse_code)
            pressButton.removeAt(pressButton.size-1)
        }
        if(pressButton.size  == 4){
            val view_04 = findViewById<View>(R.id.view_04)
            view_04.setBackgroundResource(R.drawable.elipse_code)
            pressButton.removeAt(pressButton.size-1)
        }
    }

    private fun HideActionBar() {
        supportActionBar?.hide()
    }
}