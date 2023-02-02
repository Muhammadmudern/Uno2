package com.example.uno2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.viewpager2.widget.ViewPager2
import com.example.uno2.ModelsAndAdapters.FragmentAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator


class Large_Main_Page : AppCompatActivity() {
    var pos: String? = null

    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager2: ViewPager2
    private lateinit var adapter: FragmentAdapter

    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_large_main_page2)
        supportActionBar?.hide()

        tabLayout = findViewById(R.id.tab_layout)
        viewPager2 = findViewById(R.id.view_pager)
        adapter = FragmentAdapter(supportFragmentManager, lifecycle)
        viewPager2.adapter = adapter

        // изменения текста в Tab
        tabLayout.setTabTextColors(
            resources.getColor(R.color.white),
            resources.getColor(R.color.white)
        );

        TabLayoutMediator(tabLayout, viewPager2) { tab, position ->
            tab.text = "ЗАЛ ${(position+1)}"
            pos = position.toString()
            Toast.makeText(applicationContext, pos, Toast.LENGTH_SHORT).show()
        }.attach()
    }
}