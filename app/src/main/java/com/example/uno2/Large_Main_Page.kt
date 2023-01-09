package com.example.uno2

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.LinearLayout
import androidx.appcompat.app.ActionBar
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager2.widget.ViewPager2
import com.example.uno2.Domain.ShopItem
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class Large_Main_Page : AppCompatActivity() {
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager2: ViewPager2
    private lateinit var adapter: FragmentAdapter


    private lateinit var viewModel: MainViewModel
    private lateinit var shopListLinerLayout: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_large_main_page2)
        supportActionBar?.hide()


        shopListLinerLayout = findViewById(R.id.ll_shop_list)
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        viewModel.shopList.observe(this) {
            showList(it)
        }
        tabLayout = findViewById(R.id.tab_layout)
        viewPager2 = findViewById(R.id.view_pager)
        adapter = FragmentAdapter(supportFragmentManager, lifecycle)
        viewPager2.adapter = adapter

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


    private fun showList(list: List<ShopItem>){
        for(shopItem  in list){
            val layoutId = if(shopItem.enabled){
                R.layout.enabled_item_shop
            }else{
                R.layout.disabled_item_shop
            }
            val view = LayoutInflater.from(this).inflate(layoutId, shopListLinerLayout, false)
            shopListLinerLayout.addView(view)
        }
    }
}