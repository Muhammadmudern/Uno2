package com.example.uno2

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.ScrollView
import androidx.appcompat.app.ActionBar
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager2.widget.ViewPager2
import com.example.uno2.Domain.ShopItem
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class Large_Main_Page : AppCompatActivity() {
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager2: ViewPager2
    private lateinit var adapter: FragmentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_large_main_page2)
        supportActionBar?.hide()
        tabLayout = findViewById(R.id.tab_layout)
        viewPager2 = findViewById(R.id.view_pager)
        adapter = FragmentAdapter(supportFragmentManager, lifecycle)
        viewPager2.adapter = adapter
        val button = findViewById<LinearLayout>(R.id.nextPage)
        button.setOnClickListener{
            val intent = Intent(this, ShopItemAddActivity::class.java)
            startActivity(intent)
            finish()
        }

        TabLayoutMediator(tabLayout, viewPager2) { tab, position ->
            when (position) {
                0 -> {
                    tab.text = "ЗАЛ1"
                }
                1 -> {
                    tab.text = "ТЕСТ"
                }
                2 -> {
                    tab.text = "ЗАЛ2"
                }
            }
        }.attach()
    }

}